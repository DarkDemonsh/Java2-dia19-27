package dia21act4.Entidad;

import dia21act4.Interface.Calculo;
import java.util.Scanner;

public class Rectangulo implements Calculo {
    Scanner leer = new Scanner(System.in);
    private double base;
    private double altura;
    private double a;
    private double p;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double a, double p) {
        this.base = base;
        this.altura = altura;
        this.a = a;
        this.p = p;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    } 
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void CrearR(){
        System.out.println("Escribe el tamaño de la base");
        base = leer.nextDouble();
        System.out.println("Escribe el tamaño de la altura");
        altura = leer.nextDouble();
    }
    
    @Override
    public void Area() {
        a = base*altura;
        System.out.println("el area es: "+a);
    }

    @Override
    public void Perimetro() {
        p = (base+altura)*2;
        System.out.println("el perimetro es: "+p);
    }
    
}
