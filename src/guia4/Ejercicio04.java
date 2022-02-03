/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2 */

package guia4;

import Entidades.Circulo;
import Entidades.Rectangulo;

public class Ejercicio04 {

    public static void main(String[] args) {
       
        Circulo cr = new Circulo();
        Rectangulo rec = new Rectangulo();
        
        cr = cr.cargarFigura();
        cr.calcularArea(cr.getRadio(), 0);
        cr.cacularPerimetro(cr.getDiametro(), 0);
        
        rec = rec.cargarFigura();
        rec.calcularArea(rec.getBase(),rec.getAltura());
        rec.cacularPerimetro(rec.getBase(), rec.getAltura());
    }
}
