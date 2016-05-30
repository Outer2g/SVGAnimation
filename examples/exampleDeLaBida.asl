func main()

  create dos (circle,300,300, (color : #129fa3 , r : 40,stroke : black) );

  move dos (400, 200);
  modifyt dos 500ms (color:#123,stroke:green, r:20);
  //hide dos;

  movet dos 1s (300, 300);
  //showt dos 1s;
  //delay 1s;

  



  //destroy (dos);


  // move tres (400, 200);

  tres = dos;
  cuatro = dos;
  cinco  = tres;
  seis = cinco;


  //movet tres 500ms (250, 300);
  //movet cuatro 500ms (300, 350);
  //movet cinco 500ms (300, 250);
  //movet seis 500ms (350, 300);
  //parallel 1s {
  //  move tres (300, 300);
  //  move cuatro (300, 300);
  //  move cinco (300, 300);
  //  move seis (300, 300);
  //}

  i = 0;
  while i < 10 do
    i = i + 1;
  endwhile;

  siete = dos;
  destroy (dos);
  while siete.r < 100 do
    parallel 250ms {
      hide siete;hide tres;hide cuatro;hide cinco;hide seis;
      modify siete (r : siete.r - 10);
      modify tres (r : tres.r - 10, x: tres.x + 10);
      modify cuatro (r : cuatro.r - 10, x: cuatro.x - 10);
      modify cinco (r : cinco.r - 10, y: cinco.y + 10);
      modify seis (r : seis.r - 10, y: seis.y - 10);
    }
    parallel 500ms {

      show siete;show tres;show cuatro;show cinco;show seis;
      modify siete (r : siete.r + 20);
      modify tres (r : tres.r + 20);
      modify cuatro (r : cuatro.r + 20);
      modify cinco (r : cinco.r + 20);
      modify seis (r : seis.r + 20);
    }
  endwhile;

 // create dos (circle,50,300, (color : #129fa3 , r : 40,stroke : black) );
 // create tres (circle, 200, 400, (color : #123 , r : 20, stroke : blue));
 // create cuatro(circle, 0,0, (r:5));
 // delay 250ms;
  //parallel 500ms {
  //  hide dos;
  //  hide tres;
  //  }
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