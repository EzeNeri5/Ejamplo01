/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente: */

package guia4;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;

public class Ejercicio01 {

    public static void main(String[] args) {
       
        Animal perro = new Perro("More", "Croquetas", 10, "Caniche");
        System.out.println(perro);
        perro.Alimentarse();
        
        Perro perro1 = new Perro("Lisa", "Todo", 15, "Calle");
        perro1.Alimentarse();
        
        Animal gato = new Gato("Picky", "Aves", 10, "Naranjoso");
        System.out.println(gato);
        gato.Alimentarse();
//        Animal caballo = new Caballo();
//        caballo.Alimentarse();    }
}
}