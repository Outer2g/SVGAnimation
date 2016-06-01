func main()
    create dos (rect,100,100, (color : black , width : 40, height : 40,stroke : black) );
    create tres (circle,200,100, (color : #129fa3,r : 40,stroke : black) );
    modifyt dos 1s (width : 50, height : dos.height);
    modify tres ( stroke : green);
    modify dos (color: tres.color);
    parallel 1s{
      hide tres;
      hide dos;
    }
endfunc
