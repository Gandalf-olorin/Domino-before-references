package com.domino.olorin.gandalf;

import java.util.Objects;

public class Ficha implements Comparable<Ficha>{
  private int numero1;
  private int numero2;
  private static String[] numeros1 = {"blanca", "pito", "2", "3", "4", "5", "6"};
  private static String[] numeros2 = {"blanca", "pito", "2", "3", "4", "5", "6"};

  public int getNumero1() {
    return numero1;
  }

  public int getNumero2() {
    return numero2;
  }

  public static String[] getNumeros1() {
    return numeros1;
  }

  public static String[] getNumeros2() {
    return numeros2;
  }

  public Ficha(int numero1, int numero2) {
    super();
    this.numero1 = numero1;
    this.numero2 = numero2;
  }

  public String getToStringNumero1() {
    String string1;
    if (getNumero1() == 0) {
      string1 = getNumeros1()[getNumero1()];
    } else if (getNumero1() == 1) {
      string1 = getNumeros1()[getNumero1()];
    } else
      string1 = String.valueOf(getNumeros1()[getNumero1()]);
    return string1;
  }


  public String getToStringNumero2() {
    String string2;
    if (getNumero2() == 0) {
      string2 = getNumeros2()[getNumero2()];
    } else if (getNumero2() == 1) {
      string2 = getNumeros2()[getNumero2()];
    } else
      string2 = String.valueOf(getNumero2());
    return string2;
  }

  @Override
  public String toString() {
    String toString1;
    if (getNumero1() == getNumero2()) {
      toString1 = getToStringNumero1() + " doble ";
    } else
      toString1 = getToStringNumero1() + " | " + getToStringNumero2();
    return toString1;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNumero1(), getNumero2());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Ficha other = (Ficha) obj;
    return getNumero1() == other.getNumero1() && getNumero2() == other.getNumero2();
  }

  public int compareTo(Ficha otraFicha) {
    int resultado = Integer.compare(getNumero1(), otraFicha.getNumero1());
    if (resultado == 0) {
      resultado = Integer.compare(getNumero2(), otraFicha.getNumero2());
    }
    return resultado;
  }



}
