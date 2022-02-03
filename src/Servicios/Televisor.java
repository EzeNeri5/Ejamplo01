package Servicios;

import Entidades.Electro1;
import Entidades.Electro2;
import Entidades.Electrodomestico;
import java.util.Scanner;

public class Televisor extends Electrodomestico{

    private Integer resolucion;
    private Boolean TDT = false;

    public Televisor() {    }

    public Televisor(Integer resolucion, Boolean TDT, Double precio, Electro2 color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;    }

    public Integer getResolucion() {
        return resolucion;    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;    }

    public Boolean getTDT() {
        return TDT;    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;    }

    public Double getPrecio() {
        return precio;    }

    public void setPrecio(Double precio) {
        this.precio = precio;   }

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
    
    public Televisor crearTelevisor(){
        System.out.println("Crea un televisor");
        Scanner leer = new Scanner(System.in);
        Televisor tv = new Televisor();
        String op ;
        super.crearElectro(tv);
        System.out.println("Ingrese la resolucion");
        tv.resolucion = leer.nextInt();
        System.out.println("Tiene sintonizador TDT (S/N)");
        op = leer.next();
        if (op.equalsIgnoreCase("s")) {
            tv.TDT = true;   }
        return tv;}
    
    public void precioFinal(Televisor e){
        super.precioFinal(e);
        if (e.getResolucion()> 40) {
            e.setPrecio(e.getPrecio()*1.30); }
        if (e.getTDT()) {
            e.setPrecio(e.getPrecio()+500);  }
        System.out.println("El precio final es "+ e.getPrecio());
    } 
    @Override
    public String toString() {
        return "Televisor{" + super.toString()+ "resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }
}
