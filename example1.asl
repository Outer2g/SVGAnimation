func main()
  block holi {
    create dos (rect,100,100, (color : black , width : 40, height : 40,stroke : black) );
    create tres (circle,100,100, (color : #129fa3,r : 40,stroke : black) );
    }
    movet holi 1s (300,300);
    reComputeCenter holi;
    hidet holi 1s;
endfunc
