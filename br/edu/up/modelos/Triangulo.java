package br.edu.up.modelos;
public class Triangulo {
  public int a;
  public int b;
  public int c;

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }

  public void retornaTriangulo() {
    if (a == b && b == c) {
      System.out.println("Equilátero");
    } else if (a == b || a == c || b == c) {
      System.out.println("Isóscele");
    } else {
      System.out.println("Escaleno");
    }
  }
}
