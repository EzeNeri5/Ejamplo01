package Entidades;
 
import java.util.Scanner;

public class Circulo implements calculoFormas{

    private Integer radio;
    private Integer diametro;

    public Circulo() {    }

    public Circulo(Integer radio, Integer diametro) {
        this.radio = radio;
        this.diametro = diametro;    }

    public Integer getRadio() {
        return radio;    }

    public void setRadio(Integer radio) {
        this.radio = radio;    }

    public Integer getDiametro() {
        return diametro;    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;    }

    @Override
    public void cacularPerimetro(int c, int a) {
        Double perimetro;
        perimetro = pii * c;
        System.out.println("El perimetro es " + perimetro);
    }
        
    @Override
    public Circulo cargarFigura() {
        System.out.println("Hacemos un circulo");
        Scanner leer = new Scanner(System.in);
        Circulo cr = new Circulo();
        System.out.println("Ingrese el radio");
        cr.setRadio(leer.nextInt());  
        System.out.println("Ingrese el diametro");
        cr.setDiametro(leer.nextInt());
        System.out.println(cr);
    
    return cr;}

    @Override
    public void calcularArea(int c, int s) {
       Double area;
       area = pii * (c * c);
        System.out.println("El area del circulo es " + area);   }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';    }
}
