func main()
  create dos (circle,50,300, (color : #129fa3 , r : 40,stroke : black) );
  prueba = dos.color; 
  
  create dos (circle,100,300, (color : dos.color , r : 40,stroke : black) );
  write dos.color;
endfunc
