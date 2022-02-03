package Entidades;

import java.util.Scanner;

public class Electrodomestico {
    
    protected Double precio;
    protected Electro2 color;
    protected String consumoEnergetico;
    protected Integer peso;

    public Electrodomestico() {    }

    public Electrodomestico(Double precio, Electro2 color, String consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;    }

    public Double getPrecio() {
        return precio;    }

    public void setPrecio(Double precio) {
        this.precio = precio;    }

    public Electro2 getColor() {
        return color;    }

    public void setColor(Electro2 color) {
        this.color = color;    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;    }

    public Integer getPeso() {
        return peso;    }

    public void setPeso(Integer peso) {
        this.peso = peso;    }

    public void comprobarColor(Electrodomestico e){
        Scanner leer = new Scanner(System.in);
        String op;
        System.out.println("Ingrese el color ((B)blanco, (N)negro, (R)rojo, (A)azul, (G)gris)");
        op = leer.next().toLowerCase();
        switch (op){
            case "N":
                      e.setColor(Electro2.NEGRO);
            case "R":
                      e.setColor(Electro2.ROJO);
            case "A":
                      e.setColor(Electro2.AZUL);
            case "G":
                      e.setColor(Electro2.GRIS);
            default:  e.setColor(Electro2.BLANCO); }
}
    
    public void comprobarConsumo(Electrodomestico e){
        Scanner leer = new Scanner(System.in);
        String op ;
        System.out.println("Ingrese el consumo energetico");
        op = leer.next();
                switch (op){
            case "A":
                      e.setConsumoEnergetico("A");
            case "B":
                      e.setConsumoEnergetico("B");
            case "C":
                      e.setConsumoEnergetico("C");
            case "D":
                      e.setConsumoEnergetico("D");
            case "E":
                      e.setConsumoEnergetico("E");
            default: e.setConsumoEnergetico("F");}}  
    
    public Electrodomestico crearElectro(Electrodomestico e){
        Scanner leer = new Scanner(System.in);
        Electrodomestico ele = new Electrodomestico();
        e.setPrecio(1000d);
        comprobarColor(e);
        comprobarConsumo(e);
        System.out.println("Ingrese el peso");
        e.setPeso(leer.nextInt());
        return ele;
    }

    public void precioFinal(Electrodomestico e){
    switch(e.getConsumoEnergetico()){
        case "A":
            System.out.println("Entra en el a");
            e.setPrecio(e.getPrecio()+1000);
        case "B":
            System.out.println("Entra en el b");
            e.setPrecio(e.getPrecio()+800);
        case "C":
            System.out.println("Entra en el c");
            e.setPrecio(e.getPrecio()+600);;
        case "D":
            System.out.println("Entra en el c");
            e.setPrecio(e.getPrecio()+500);
        case "E":
            e.setPrecio(e.getPrecio()+300);
            System.out.println("Entra en el e");
        case "F":
            e.setPrecio(e.getPrecio()+100);}

        if (e.getPeso() > 1 && e.getPeso() < 19) {
            e.setPrecio(e.getPrecio()+100); }
        if (e.getPeso() > 20 && e.getPeso() < 49) {
           e.setPrecio(e.getPrecio()+500); }
        if (e.getPeso() > 50 && e.getPeso() < 79) {
            e.setPrecio(e.getPrecio()+800); }
        if (e.getPeso() > 80) {
           e.setPrecio(e.getPrecio()+1000); }   }  

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
}
    
    
    
    
