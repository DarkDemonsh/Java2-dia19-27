package dia20act1;

import dia20act1.entidad.Animal;
import dia20act1.entidad.Caballo;
import dia20act1.entidad.Gato;
import dia20act1.entidad.Perro;

public class Dia20act1 {

    public static void main(String[] args) {
        Animal p1 = new Perro("Stich","Carnivoro",15,"Doberman");
        p1.Entity();
        p1.Alimentarse();
        System.out.println("");
        Animal p2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        p2.Entity();
        p2.Alimentarse();
        System.out.println("");
        Animal g1 = new Gato("Pelusa","Galletas",15,"Siames");
        g1.Entity();
        g1.Alimentarse();
        System.out.println("");
        Animal c1 = new Caballo("Spark","Pasto",25,"Fino");
        c1.Entity();
        c1.Alimentarse();
        System.out.println("");
    }
  
}
