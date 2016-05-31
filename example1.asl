func main()
  block holi {
    create dos (circle,50,200, (color : #129fa3 , r : 40,stroke : black) );
    create tres (circle,100,300, (color : #129fa3,r : 40,stroke : black) );
    }
  modify holi (color : black);
  hidet holi 1s;
  show holi;
  delay 1s;
  hide holi;
  showt holi 1s;
endfunc
