/*Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor */

package guia4;

import static Entidades.Electro2.*;
import Entidades.Electrodomestico;
import Servicios.Televisor;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio03 {

    public static void main(String[] args) {
       
        List<Electrodomestico> elec = new ArrayList();
        Televisor tv1 = new Televisor(1000, true, 5000d, ROJO, "A", 10);
        Televisor tv2 = new Televisor(1200, false, 5200d, AZUL, "A", 10);
        Televisor tv3 = new Televisor(1400, true, 5400d, BLANCO, "A", 10);
        Televisor tv4 = new Televisor(1600, false, 5600d, ROJO, "A", 10);
        int pfinal = 0 ;
        
        elec.add(tv1);
        elec.add(tv2);
        elec.add(tv3);
        elec.add(tv4);
        
        for (Electrodomestico electrodomestico : elec) {
           System.out.println(electrodomestico);}
          pfinal = (int) (tv1.getPrecio() + tv2.getPrecio() + tv3.getPrecio() + tv4.getPrecio());
           
          System.out.println("El precio total es " + pfinal); 
    }
}
