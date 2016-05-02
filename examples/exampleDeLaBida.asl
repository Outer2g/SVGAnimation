func main()
  create dos (circle,50,5, (color : #129fa3 ) );
  modify dos (color:black);
  movet dos 2s (45,42);
  destroy(dos);
  create tres (circle, 10,10);
  create cuatro (rectangle, 20,20);
  parallel 20s {
  	modify tres (color:red);
  	modify cuatro (color:blue);
  }
  parallel {
  	modifyt tres 3s (x:100);
  	modifyt cuatro 14s (y:200);
   }
endfunc