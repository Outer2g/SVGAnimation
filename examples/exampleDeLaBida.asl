func main()
  create dos (circle,50,300, (color : #129fa3 , r : 40,stroke : black) );
  create tres (circle, 200, 400, (color : #123 , r : 20, stroke : blue));
  delay 1s;
  parallel 2s {
    hide dos;
    hide tres;
  }
  show dos;
  show tres;
  parallel {
    hidet dos 1s;
    hidet tres 2s;
  }

  delay 1s;
  showt dos 1s;
  showt dos 1s;
  hidet dos 1s;
  hidet dos 1s;
  show dos;
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