package dia20act1.entidad;

import dia20act1.Interface.AccionAnimal;

public class Animal implements AccionAnimal {
    
    protected String nombre;    
    protected String Alimento;
    protected int edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String Alimento, int edad, String raza) {
        this.nombre = nombre;
        this.Alimento = Alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    } 

    @Override
    public void Entity(){
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
        System.out.println("raza: "+raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.print("este animal se alimenta de: ");
    }
    
}
