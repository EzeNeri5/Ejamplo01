package Entidades;

import java.util.Scanner;

public class Rectangulo implements calculoFormas{
    
    private int base;
    private int altura;

    public Rectangulo() {    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;    }

    public int getBase() {
        return base;    }

    public void setBase(int base) {
        this.base = base;    }

    public int getAltura() {
        return altura;    }

    public void setAltura(int altura) {
        this.altura = altura;    }

    @Override
    public Rectangulo cargarFigura() {
        System.out.println("Hacemos un rectangulo");
        Scanner leer = new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        System.out.println("Ingrese la base");
        rec.setBase(leer.nextInt());  
        System.out.println("Ingrese el diametro");
        rec.setAltura(leer.nextInt());
        System.out.println(rec);
        return rec;}

    @Override
    public void calcularArea(int b, int a) {
        float area;
        area = b * a ;
        System.out.println("La area del rectangulo es " + area);
    }

    @Override
    public void cacularPerimetro(int ba, int al) {
        float perimetro;
        perimetro = (ba * al) + 2 ;
        System.out.println("La perimetro del rectangulo es " + perimetro);
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}
