package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Arreglos y Listas
 *
 * @author arielp
 */
public class TrabajoPractico1 {

    private int[] arrayNumeros;

    public void ejercicio1() {
        String[] palabras = new String[4];
        palabras[0] = "Esto";
        palabras[1] = "es";
        palabras[2] = "una";
        palabras[3] = "frase";

        System.out.println("Iterando Arreglos forma 1");
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            System.out.println(palabra);
        }
        System.out.println("\n");

        System.out.println("Iterando Arreglos forma 2");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public void ejercicio2() {
        List<String> palabras = new ArrayList();
        palabras.add("Esto");
        palabras.add("es");
        palabras.add("una");
        palabras.add("frase");

        System.out.println("Iterando Listas forma 1");
        for (int i = 0; i < palabras.size(); i++) {
            String palabra = palabras.get(i);
            System.out.println(palabra);
        }
        System.out.println("\n");

        System.out.println("Iterando Listas forma 2");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        System.out.println("Iterando Listas forma 3 (Iterador)");
        Iterator<String> iterador = palabras.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        
    }

    /**
     * Crear un arreglo de numeros enteros del 1 al 5, recorrerlos y mostralos
     * de las 2 formas
     */
    public void ejercicio3() {
        int[] arrayNumeros = new int[5];
        arrayNumeros[0] = 1;
        arrayNumeros[1] = 2;
        arrayNumeros[2] = 3;
        arrayNumeros[3] = 4;
        arrayNumeros[4] = 5;
            System.out.println("Iterando Arreglos forma 1");
            
        for (int i = 0; i <= 4; i++) {
            
            System.out.println(arrayNumeros[i]);
        }
       
        System.out.println("Iterando Arreglos forma 2");
        for (int arrayNum : arrayNumeros) {
            System.out.println(arrayNum);
            
    }

    /**
     * Crear una lista de numeros enteros del 1 al 5, recorrerlos y mostarlos de
     * las 3 formas
     */
    }
         public void ejercicio4() {
          
          List<String> numeros =new ArrayList();
          
          numeros.add("1");
          numeros.add("2");
          numeros.add("3");
          numeros.add("4");
          numeros.add("5");
          
          System.out.println("primera forma de iteración");
          for (int i=0; i< numeros.size();i++){
              
             String numero =numeros.get(i);
              System.out.println(numero);
                          
              
          }
          System.out.println("\n");

        System.out.println("Iterando Listas forma 2");
        for (String numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Iterando Listas forma 3 (Iterador)");
        Iterator<String> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
          
              
          }
      

    

    /*

    
    /**
     * @return the arrayNumeros
     */
    public int[] getArrayNumeros() {
        return arrayNumeros;
    }

    /**
     * @param arrayNumeros the arrayNumeros to set
     */
    public void setArrayNumeros(int[] arrayNumeros) {
        this.arrayNumeros = arrayNumeros;
    }
}
