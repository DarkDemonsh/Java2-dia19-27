package dia21act4.Entidad;

import dia21act4.Interface.Calculo;
import java.util.Scanner;

public class Circulo implements Calculo {
    Scanner leer = new Scanner(System.in);
    private double diametro;
    private double radio;
    private double p;
    private double a;

    public Circulo() {
    }

    public Circulo(double diametro, double radio, double p, double a) {
        this.diametro = diametro;
        this.radio = radio;
        this.p = p;
        this.a = a;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public void CrearC(){
        
        System.out.println("Ingrese el radio");
        radio = leer.nextDouble();
        System.out.println("Ingrese el Diametro");
        diametro = leer.nextDouble();
        
    }
    
    @Override
    public void Area() {
        a = Math.PI * Math.pow(radio,2);
        System.out.println("El area del circulo es: "+a);
    }

    @Override
    public void Perimetro() {        
        p = (Math.PI*diametro);
        System.out.println("el perimetro del circulo es: "+p);
    }
    
}
