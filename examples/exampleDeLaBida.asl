func main()

  create dos (circle,300,300, (color : #129fa3 , r : 40,stroke : black) );
  tres = dos;
  cuatro = dos;

  movet tres 1s (250, 300);
  movet cuatro 1s (300, 350);

 // create dos (circle,50,300, (color : #129fa3 , r : 40,stroke : black) );
 // create tres (circle, 200, 400, (color : #123 , r : 20, stroke : blue));
 // create cuatro(circle, 0,0, (r:5));
 // delay 250ms;
  parallel 500ms {
    hide dos;
    hide tres;
  }
//  movet cuatro 150ms (25+25,20+30);
//  destroy(dos);
//  create dos (circle, 400, 200, (color : #121fa3 , r : 40,stroke : green));
//  show dos;
//  show tres;
//  parallel {
//    hidet dos 250ms;
//    hidet tres 500ms;
//  }

 // delay 250ms;
 // showt dos 250ms;
 // showt dos 1000ms;
 // hidet dos 250ms;
 // hidet dos 250ms;
 // show dos;
 // show tres;

 // modifyt tres 1s (color: black);
 // modifyt tres 1s (color: white);

 // dos = tres;
 // estoEsNull = tres;
 // parallel 10s{
 //   move dos (400,400);
 //   modify dos (color : green, r : 20);
 //   move estoEsNull (200,200);
 //   modify estoEsNull (color : white, r : 20);
 // }

  //show dos;
  //modify dos (color:black);
  //movet dos 2s (45,42);
  //destroy(dos);
  //create tres (circle, 10,10);
  //create cuatro (rectangle, 20,20);
  //parallel 20s {
  //	modify tres (color:red);
  //	modify cuatro (color:blue);
  //}
  //parallel {
  //	modifyt tres 3s (x:100);
  //	modifyt cuatro 14s (y:200);
  // }
endfunc