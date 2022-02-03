package Entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Yate extends Barco{

    private Integer potencia;
    private Integer camarotes;

    public Yate() {    }

    public Yate(Integer potencia, Integer camarotes, String nombre, Integer dni, Date alquiler, Date devolucion, Integer amarre, String barco, Integer matriculo, Integer eslora, Date fabricacion) {
        super(nombre, dni, alquiler, devolucion, amarre, barco, matriculo, eslora, fabricacion);
        this.potencia = potencia;
        this.camarotes = camarotes;    }

    public Integer getPotencia() {
        return potencia;    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;    }

    public Integer getCamarotes() {
        return camarotes;    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;    }

    public String getNombre() {
        return nombre;    }

    public void setNombre(String nombre) {
        this.nombre = nombre;    }

    public Integer getDni() {
        return dni;    }

    public void setDni(Integer dni) {
        this.dni = dni;    }

    public long getCosto() {
        return costo;    }

    public void setCosto(long costo) {
        this.costo = costo;    }

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

    public Date getAlquiler() {
        return alquiler;    }

    public void setAlquiler(Date alquiler) {
        this.alquiler = alquiler;    }

    public Date getDevolucion() {
        return devolucion;    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;    }

    public Date getFabricacion() {
        return fabricacion;    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;    }

    public void cargarYate(Yate y){
        super.cargarBarco();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Potencia en CV del motor");
        y.potencia = leer .nextInt();
        System.out.println("Ingrese la cantidad de camarotes");
        y.camarotes = leer.nextInt();
        System.out.println(y); }   
    
        public void costeYate(Yate y){
        System.out.println("El costo extra por Yate es $"+y.potencia+y.camarotes);
        System.out.println("El coste total del alquiler es $ "+y.potencia+y.camarotes+y.costo);}
    
    @Override
    public String toString() {
        return "Yate{" + super.toString() + "potencia=" + potencia + ", camarotes=" + camarotes + '}';    }
}
