package dia21act4;

import dia21act4.Entidad.Circulo;
import dia21act4.Entidad.Rectangulo;

public class Dia21act4 {

    public static void main(String[] args) {
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        
        c.CrearC();
        c.Area();
        c.Perimetro();
        System.out.println("");
        r.CrearR();
        r.Area();
        r.Perimetro();
        
    }
    
}
