package com.domino;

import com.domino.olorin.gandalf.Ficha;
import com.domino.olorin.gandalf.PilaDeFichas;


public class Juego {

  public static void main(String[] args) {
    int numeroMaxDominoEspañol = 6;
    PilaDeFichas dominoEspañol = new PilaDeFichas();
    for (int i = 0; i <= numeroMaxDominoEspañol; i++) {
      for (int j = 0; j <= i && j <= numeroMaxDominoEspañol; j++) {
        dominoEspañol.getFichasDomino().add(new Ficha(j, i));
      }
    }
    dominoEspañol.getFichasDomino().forEach(System.out::println);
    dominoEspañol.remover();
    dominoEspañol.getFichasDomino().forEach(System.out::println);
    System.out.println("\n \n");
    Ficha fichaEspañol = new Ficha(5, 6);
    System.out.println("¿la ficha " + fichaEspañol + " esta en el juego? ==> "
        + dominoEspañol.contiene(fichaEspañol));
    System.out.println("Robo la ficha " + dominoEspañol.robar(fichaEspañol));
    dominoEspañol.getFichasDomino().forEach(System.out::println);
    dominoEspañol.getFichasDomino().sort(null);
    dominoEspañol.getFichasDomino().forEach(System.out::println);

    // int numeroMaxDominoBritish = 10;
    // PilaDeFichas dominoBritish = new PilaDeFichas();
    // for (int i = 0; i <= numeroMaxDominoBritish; i++) {
    // for (int j = 0; j <= i && j <= numeroMaxDominoBritish; j++) {
    // dominoBritish.getFichasDomino().add(new FichaExterna(j, i));


    // }
    // }



  }
}


