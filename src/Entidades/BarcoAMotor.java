package Entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class BarcoAMotor extends Barco{

    private Integer potencia;

    public BarcoAMotor() {    }

    public BarcoAMotor(Integer potencia, String nombre, Integer dni, LocalDate alquiler, LocalDate devolucion, Integer amarre, String barco, Integer matriculo, Integer eslora, LocalDate fabricacion) {
        super(nombre, dni, alquiler, devolucion, amarre, barco, matriculo, eslora, fabricacion);
        this.potencia = potencia;    }

    public Integer getPotencia() {
        return potencia;    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;    }

    public String getNombre() {
        return nombre;    }

    public void setNombre(String nombre) {
        this.nombre = nombre;    }

    public Integer getDni() {
        return dni;}

    public LocalDate getAlquiler() {
        return alquiler;    }

    public void setAlquiler(LocalDate alquiler) {
        this.alquiler = alquiler;    }

    public LocalDate getDevolucion() {
        return devolucion;    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;    }

    public LocalDate getFabricacion() {
        return fabricacion;    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;    }

    public long getCosto() {
        return costo;    }
    
    public void setCosto(long costo) {
        this.costo = costo;    }

    public void setDni(Integer dni) {
        this.dni = dni;    }

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


    public void cargarAMotor(BarcoAMotor m){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Potencia en CV de motor");
        m.potencia = leer.nextInt();
        System.out.println(m);}
    
    public void costeAMotor(BarcoAMotor m){
        System.out.println("El costo estra por Barco a Motor es $"+m.potencia);
        System.out.println("El coste total del alquiler es $ "+m.potencia+m.costo);}
    
    @Override
    public String toString() {
        return "BarcoAMotor{" + super.toString() + "potencia=" + potencia + '}';    }
}
