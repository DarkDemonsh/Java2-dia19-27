package dia20act1.entidad;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String Alimento, int edad, String raza) {
        super(nombre, Alimento, edad, raza);
    }

    @Override
    public void Alimentarse(){
        super.Alimentarse();
        System.out.println(Alimento);
    }
    
     @Override
    public void Entity(){
        super.Entity();

    }
}
