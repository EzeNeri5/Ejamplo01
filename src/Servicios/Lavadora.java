package Servicios;

import Entidades.Electro1;
import Entidades.Electro2;
import Entidades.Electrodomestico;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private Integer carga;
    
    public Lavadora() {    }

    public Lavadora(Integer carga) {
        this.carga = carga;    }

    public Lavadora(Integer carga, Double precio, Electro2 color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;    }
  
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

    public Integer getCarga() {
        return carga;    }

    public void setCarga(Integer carga) {
        this.carga = carga;    }

    public Lavadora crearLavarropa(){
        System.out.println("Crea un lavarropas");
        Scanner leer = new Scanner(System.in);
        Lavadora la = new Lavadora ();
        super.crearElectro(la);
        System.out.println("Ingrese la carga del lavarropa");
        la.setCarga(leer.nextInt());   
        System.out.println(la);
    
        return la;}
    
    public void precioFinal(Lavadora e){
        super.precioFinal(e);
        if (e.getCarga() > 30) {
            e.setPrecio(e.getPrecio()+500);  }
        System.out.println("El precio final es "+ e.getPrecio());
}
    @Override
    public String toString() {
        return "Lavadora{" +super.toString()+ "carga=" + carga + '}';
    }
}