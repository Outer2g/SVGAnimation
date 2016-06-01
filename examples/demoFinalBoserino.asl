func main()

  create dos (circle,300,300, (color : #129fa3 , r : 40,stroke : black) );
  tres = dos;
  cuatro = dos;
  cinco  = tres;
  seis = cinco;
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

endfunc