/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

grammar Asl;

options {
    output = AST;
    ASTLabelType = AslTree;
}

// Imaginary tokens to create some AST nodes

tokens {
    LIST_FUNCTIONS; // List of functions (the root of the tree)
    ASSIGN;     // Assignment instruction
    PARAMS;     // List of parameters in the declaration of a function
    FUNCALL;    // Function call
    ARGLIST;    // List of arguments passed in a function call
    LIST_INSTR; // Block of instructions
    BOOLEAN;    // Boolean atom (for Boolean constants "true" or "false")
    PVALUE;     // Parameter by value in the list of parameters
    PREF;       // Parameter by reference in the list of parameters
    COLORINT;
    COLORHEX;
    COLORPRCTJ;
}

@header {
package parser;
import interp.AslTree;
}

@lexer::header {
package parser;
}


// A program is a list of functions
prog    : func+ EOF -> ^(LIST_FUNCTIONS func+)
        ;
            
// A function has a name, a list of parameters and a block of instructions  
func    : FUNC^ ID params block_instructions ENDFUNC!
        ;

// The list of parameters grouped in a subtree (it can be empty)
params  : '(' paramlist? ')' -> ^(PARAMS paramlist?)
        ;

// Parameters are separated by commas
paramlist: param (','! param)*
        ;

// Parameters with & as prefix are passed by reference
// Only one node with the name of the parameter is created
param   :   '&' id=ID -> ^(PREF[$id,$id.text])
        |   id=ID -> ^(PVALUE[$id,$id.text])
        ;

// A list of instructions, all of them gouped in a subtree
block_instructions
        :    instruction (';' instruction)*
            -> ^(LIST_INSTR instruction+)
        ;

// The different types of instructions
instruction
        :   assign          // Assignment
        |   ite_stmt        // if-then-else
        |   while_stmt      // while statement
        |   funcall         // Call to a procedure (no result produced)
        |   return_stmt     // Return statement
        |   read            // Read a variable
        |   write           // Write a string or an expression
        
        |   create          // create an object
        |   destroy         // destroy an object
        |   move            // move an object
        |   modify          // modify attribute of an object
   //     |   source          // source another scriptfile
  //      |   parallel        // execute things
 //       |   show
//        |   hide
 //       |   delay
        |                   // Nothing
        ;

// Assignment
assign  :   ID eq=EQUAL expr -> ^(ASSIGN[$eq,":="] ID expr)
        ;

// if-then-else (else is optional)
ite_stmt    :   IF^ expr THEN! block_instructions (ELSE! block_instructions)? ENDIF!
            ;

// while statement
while_stmt  :   WHILE^ expr DO! block_instructions ENDWHILE!
            ;

// Return statement with an expression
return_stmt :   RETURN^ expr?
        ;

// Read a variable
read    :   READ^ ID
        ;

// Write an expression or a string
write   :   WRITE^ (expr | STRING )
        ;

// Cosas Bonitas

create  :   CREATE obj_type ID expr expr list_attributes
        ;

destroy :   DESTROY ID
        ;

move    :   move_time | move_no_time
        ;
// "move" id x y time
move_time : MOVE_T ID expr expr time
        ;
// "move" id x y
move_no_time : MOVE ID expr expr
        ;

modify    :   modify_time | modify_no_time
        ;
// "modify" id x y time
modify_time : MODIFY_T^ ID list_attributes time
        ;
// "modify" id x y
modify_no_time : MODIFY^ ID list_attributes
        ;

list_attributes : '('! attribute (','! attribute)* ')'!
        ;

attribute   :   attribute_name_color ':' color
            |   attribute_name_expr ':' expr
            ;

attribute_name_color    : COLOR
                        ;

attribute_name_expr : POSX
                    | POSY
                    ;

color   :   HASHTAG hexadigit hexadigit hexadigit (hexadigit hexadigit hexadigit)? -> ^(COLORHEX  hexadigit hexadigit hexadigit (hexadigit hexadigit hexadigit)?)
        |   RGB '(' expr ',' expr ',' expr ')' -> ^(COLORINT expr expr expr)
        |   RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^(COLORPRCTJ expr expr expr)
        |   color_keyword
        ;

hexadigit   :   '0'..'9'
            |   'A'..'F'
            |   'a'..'f';

color_keyword : RED | WHITE | BLACK | BLUE | GREEN;

obj_type : CIRCLE | RECTANGLE | TEXT;

time :  expr 's'; // o ms. token para cat uno

// Grammar for expressions with boolean, relational and aritmetic operators
expr    :   boolterm (OR^ boolterm)*
        ;

boolterm:   boolfact (AND^ boolfact)*
        ;

boolfact:   num_expr ((EQUAL^ | NOT_EQUAL^ | LT^ | LE^ | GT^ | GE^) num_expr)?
        ;

num_expr:   term ( (PLUS^ | MINUS^) term)*
        ;

term    :   factor ( (MUL^ | DIV^ | MOD^) factor)*
        ;

factor  :   (NOT^ | PLUS^ | MINUS^)? atom
        ;

// Atom of the expressions (variables, integer and boolean literals).
// An atom can also be a function call or another expression
// in parenthesis
atom    :   ID 
        |   INT
        |   (b=TRUE | b=FALSE)  -> ^(BOOLEAN[$b,$b.text])
        |   funcall
        |   '('! expr ')'!
        ;

// A function call has a lits of arguments in parenthesis (possibly empty)
funcall :   ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;

// A list of expressions separated by commas
expr_list:  expr (','! expr)*
        ;

// Basic tokens
HASHTAG : '#';
EQUAL   : '=' ;
NOT_EQUAL: '!=' ;
LT      : '<' ;
LE      : '<=';
GT      : '>';
GE      : '>=';
PLUS    : '+' ;
MINUS   : '-' ;
MUL     : '*';
DIV     : '/';
MOD     : '%' ;
NOT     : 'not';
AND     : 'and' ;
OR      : 'or' ;    
IF      : 'if' ;
THEN    : 'then' ;
ELSE    : 'else' ;
ENDIF   : 'endif' ;
WHILE   : 'while' ;
DO      : 'do' ;
ENDWHILE: 'endwhile' ;
FUNC    : 'func' ;
ENDFUNC : 'endfunc' ;
RETURN  : 'return' ;
READ    : 'read' ;
WRITE   : 'write' ;
TRUE    : 'true' ;
FALSE   : 'false';

CREATE  : 'create';
DESTROY : 'destroy';
MOVE_T  : 'movet';
MOVE    : 'move';
MODIFY_T: 'modifyt';
MODIFY  : 'modify';
RGBPRCTJ: 'rgbp';
RGB     : 'rgb';

COLOR   : 'color';
WHITE   : 'white';
BLACK   : 'black';
BLUE    : 'blue';
RED     : 'red';
GREEN   : 'green';
POSX    : 'x';
POSY    : 'y';
CIRCLE  : 'circle';
RECTANGLE : 'rectangle';
TEXT : 'text';

ID      :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT     :   '0'..'9'+ ;

// C-style comments
COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
        | '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
        ;

// Strings (in quotes) with escape sequences        
STRING  :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
        ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

// White spaces
WS      : ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
        ;


