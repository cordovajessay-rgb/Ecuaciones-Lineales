package Ecuaciones_Lineales;

public class Lanzador_gauss {
  public static void main(String [] args){
      double [][] matriz = defmatrizz.defmatriz();
      Gauss.eliminacionGaussiana(matriz);
      double [] Soluciones = Gauss.sustitucionRegresiva(matriz);
      System.out .println ("Soluciones del sistema:");
      for ( int i=0;i < soluciones.length;i++){
          System.out.println ("x"+(i+1)+"="+ soluciones[i]);
      }
  }
}
