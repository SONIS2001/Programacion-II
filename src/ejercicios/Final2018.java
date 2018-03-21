/*
 *1
 */
package ejercicios;

import java.util.ArrayList;
import java.util.List;
import modelos.Ciudad;

/**
 *
 * @author Sonia
 */
public class Final2018 {

    public void ejercicio1() {

        List<Integer> numerosMay = new ArrayList();

        numerosMay.add(12);
        numerosMay.add(20);
        numerosMay.add(17);
        numerosMay.add(14);
        numerosMay.add(24);

        for (int i = 0; i < numerosMay.size(); i++) {

            int num = numerosMay.get(i);

            System.out.println(num);

        }
        for (int i = (numerosMay.size() - 1); i >= 0; i--) {

            int num = numerosMay.get(i);

            System.out.println(num);
        }

    }
    
    public void ejercicio2(){
        
        Ciudad neuquen = new Ciudad();
         neuquen.setId(01);
         neuquen.setNombre("Neuquen");
         
         Ciudad sanRafael = new Ciudad();
         sanRafael.setId(02);
         sanRafael.setNombre("San Rafael");
         
         System.out.println(sanRafael.getId() +  neuquen.getNombre());
         
    }

}
