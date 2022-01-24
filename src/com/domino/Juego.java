package com.domino;

import com.domino.olorin.gandalf.Ficha;
import com.domino.olorin.gandalf.PilaDeFichas;


public class Juego {

  public static void main(String[] args) {
    int numeroMaxDominoEspa�ol = 6;
    PilaDeFichas dominoEspa�ol = new PilaDeFichas();
    for (int i = 0; i <= numeroMaxDominoEspa�ol; i++) {
      for (int j = 0; j <= i && j <= numeroMaxDominoEspa�ol; j++) {
        dominoEspa�ol.getFichasDomino().add(new Ficha(j, i));
      }
    }
    dominoEspa�ol.getFichasDomino().forEach(System.out::println);
    dominoEspa�ol.remover();
    dominoEspa�ol.getFichasDomino().forEach(System.out::println);
    System.out.println("\n \n");
    Ficha fichaEspa�ol = new Ficha(5, 6);
    System.out.println("�la ficha " + fichaEspa�ol + " esta en el juego? ==> "
        + dominoEspa�ol.contiene(fichaEspa�ol));
    System.out.println("Robo la ficha " + dominoEspa�ol.robar(fichaEspa�ol));
    dominoEspa�ol.getFichasDomino().forEach(System.out::println);
    dominoEspa�ol.getFichasDomino().sort(null);
    dominoEspa�ol.getFichasDomino().forEach(System.out::println);

    // int numeroMaxDominoBritish = 10;
    // PilaDeFichas dominoBritish = new PilaDeFichas();
    // for (int i = 0; i <= numeroMaxDominoBritish; i++) {
    // for (int j = 0; j <= i && j <= numeroMaxDominoBritish; j++) {
    // dominoBritish.getFichasDomino().add(new FichaExterna(j, i));


    // }
    // }



  }
}


