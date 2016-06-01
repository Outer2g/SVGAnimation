func main()
  block estt{
    create dos (rect,180,140, (color : black , width : 40, height : 40,stroke : black) );
    create tres (circle,200,100, (color : #129fa3,r : 40,stroke : black) );
    }
  movet estt 2s (200,200);
  modifyt estt 1s (color : red);
  hidet estt 1s;
    
endfunc
