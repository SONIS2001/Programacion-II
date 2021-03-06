package ejercicios;

import excepciones.ExcepcionSimpatica;
import excepciones.MiExcepcion;

/**
 * Excepciones
 * @author arielp
 */
public class TrabajoPractico2 {

    public void ejercicio1() {
        int[] array = new int[20];
        array[-7] = 24;
        System.out.println("No tengo que llegar hasta aca");
    }

    public void ejercicio2() {
        try {
            int[] array = new int[20];
            array[50] = 24;
            System.out.println("no debo llegar aca");
            
            // Instrucciones cuando no hay una excepción
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Instrucciones cuando se produce una excepcion
            System.out.println("Excepcion: " + ex);     
        } finally {
            System.out.println("Finally Ejercicio 2");
            // Instruciones que se ejecutan, tanto si hay como sino hay excepciones
        }
    }

    public void ejercicio3() {
        int[] array = new int[20];
        try {
            int b = 0 ;
            int a = 23 / b;
            array[-10] = 24;            

            String s = null;
            s.equals("QQQQ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(" Error de índice en un array: " + ex);
        } catch (ArithmeticException ex) {
            System.out.println(" Error matematico: " + ex);
        } catch (Exception ex) {
            System.out.println(" Error matematico: " + ex);
        } 
    }
    
    public void ejercicio4() throws Exception {
        System.out.println("Generando una excepcion");
        throw new Exception("Soy la excepcion");
    }
    
    /**
     * Excepcion Propia
     */
    public void ejercicio5() {
        try {
            System.out.println("Primera parte");
            throw new ExcepcionSimpatica("Soy la excepcion");
        }catch(ExcepcionSimpatica e) {
            System.out.println("excepcion" +  e);
        } 
    }
    
    /**
     * Crear una excepcion propia y capturarla y mostrar su contenido.
     */
    public void ejercicio6() {
        
         try {
            int[] numerito = new int[12];
            numerito[-40] = 24;
            System.out.println("no debo llegar aca");
        }
         
         catch (ArrayIndexOutOfBoundsException ex) {
          
            System.out.println("Excepcion: " + ex);     
        } finally {
            System.out.println("Final del Ejercicio 2");
            // Instruciones que se ejecutan, tanto si hay como sino hay excepciones
        }
    }
}

