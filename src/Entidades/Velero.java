package Entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Velero extends Barco{

    private Integer mastiles;

    public Velero() {    }

    public Velero(Integer mastiles, String nombre, Integer dni, LocalDate alquiler, LocalDate devolucion, Integer amarre, String barco, Integer matriculo, Integer eslora, LocalDate fabricacion) {
        super(nombre, dni, alquiler, devolucion, amarre, barco, matriculo, eslora, fabricacion);
        this.mastiles = mastiles;    }

    public Integer getMastiles() {
        return mastiles;    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;    }

    public String getNombre() {
        return nombre;    }

    public void setNombre(String nombre) {
        this.nombre = nombre;    }

    public Integer getDni() {
        return dni;    }

    public void setDni(Integer dni) {
        this.dni = dni;    }

    public LocalDate getAlquiler() {
        return alquiler;    }

    public void setAlquiler(LocalDate alquiler) {
        this.alquiler = alquiler;    }

    public LocalDate getDevolucion() {
        return devolucion;    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;    }

    public Integer getAmarre() {
        return amarre;    }

    public void setAmarre(Integer amarre) {
        this.amarre = amarre;    }

    public String getBarco() {
        return barco;    }

    public void setBarco(String barco) {
        this.barco = barco;    }

    public Integer getMatriculo() {
        return matriculo;    }

    public void setMatriculo(Integer matriculo) {
        this.matriculo = matriculo;    }

    public Integer getEslora() {
        return eslora;    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;    }

    public LocalDate getFabricacion() {
        return fabricacion;    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;    }

    public long getCosto() {
        return costo;    }

    public void setCosto(long costo) {
        this.costo = costo;    }

    public void cargarMastiles(Velero v){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de mastiles");
        v.setMastiles(leer.nextInt());  
        System.out.println(v);} 
    
    public void costoVelero(Velero v){
        System.out.println("El costo estra por velero es $"+v.mastiles);
        System.out.println("El coste total del alquiler es $ "+v.mastiles+v.costo);}
    
    @Override
    public String toString() {
        return "Velero{" + super.toString()+ "mastiles=" + mastiles + '}';    }
}
