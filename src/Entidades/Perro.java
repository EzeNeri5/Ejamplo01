package Entidades;

public class Perro extends Animal{

    public Perro() {    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);    }
    
    public String getNombre() {
        return nombre;    }

    public void setNombre(String nombre) {
        this.nombre = nombre;    }

    public String getAlimento() {
        return alimento;    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;    }

    public Integer getEdad() {
        return edad;    }

    public void setEdad(Integer edad) {
        this.edad = edad;    }

    public String getRaza() {
        return raza;    }

    public void setRaza(String raza) {
        this.raza = raza;    }

    @Override
    public String toString() {
        return "Perro{" + super.toString()+ '}';    }

    @Override
    public void Alimentarse(){
        System.out.println();
        System.out.println("El perro "+this.nombre+" Se alimenta de "+Perro.this.alimento);    }   
}
