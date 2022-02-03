package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Barco<T> {
    protected String nombre;
    protected Integer dni;
    protected Date alquiler;
    protected Date devolucion;
    protected Integer amarre;
    protected String barco;
    protected Integer matriculo;
    protected Integer eslora;
    protected Date fabricacion;
    protected long costo;

    public Barco() {    }

    public Barco(String nombre, Integer dni, Date alquiler, Date devolucion, Integer amarre, String barco, Integer matriculo, Integer eslora, Date fabricacion) {
        this.nombre = nombre;
        this.dni = dni;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.amarre = amarre;
        this.barco = barco;
        this.matriculo = matriculo;
        this.eslora = eslora;
        this.fabricacion = fabricacion;    }

    public String getNombre() {
        return nombre;    }

    public void setNombre(String nombre) {
        this.nombre = nombre;    }

    public Integer getDni() {
        return dni;    }

    public void setDni(Integer dni) {
        this.dni = dni;    }

    public Date getAlquiler() {
        return alquiler;    }

    public void setAlquiler(Date alquiler) {
        this.alquiler = alquiler;    }

    public Date getDevolucion() {
        return devolucion;    }

    public void setDevolucion(Date devolucion) {
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

    public Date getFabricacion() {
        return fabricacion;    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;    }

    public long getCosto() {
        return costo;    }

    public void setCosto(long costo) {
        this.costo = costo;   }
    
    public void cargarBarco(){
        int dia, mes, anio;
        Scanner leer = new Scanner(System.in);
        Barco b = new Barco();
        System.out.println("Nombre");
        b.setNombre(leer.next());
        System.out.println("DNI");
        b.setDni(leer.nextInt());
        System.out.println("Ingrese el dia de inicio");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        Date fecha = new Date(); 
        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(anio);
        b.setAlquiler(fecha);
        System.out.println("Ingrese el dia de devolucion");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        fecha.setDate(dia); 
        fecha.setMonth(mes);
        fecha.setYear(anio);
        b.setDevolucion(fecha);
        System.out.println("Posicion de amarre");
        b.setAmarre(leer.nextInt());
        System.out.println("Barco que lo ocupa");
        b.setBarco(leer.next());
        System.out.println("Matricula");
        b.setMatriculo(leer.nextInt());
        System.out.println("Ingrese el dia de fabricacion");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        fecha.setDate(dia); 
        fecha.setMonth(mes);
        fecha.setYear(anio);
        b.setFabricacion(fecha);

        //System.out.print(b);
        }
    
        public void calcularAlquile (Barco b){
            int alq = (int) ((b.alquiler.getTime() - b.devolucion.getTime()));
            System.out.println("Los dias de ocupacion son "+alq);
            System.out.println("");
            b.costo = alq * (b.eslora*10);
            System.out.println("El alquiler cuesta "+costo);
            }
    
    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ", dni=" + dni + ", alquiler=" + alquiler + ", devolucion=" + devolucion + ", amarre=" + amarre + ", barco=" + barco + ", matriculo=" + matriculo + ", eslora=" + eslora + ", fabricacion=" + fabricacion + '}';
    }
}
