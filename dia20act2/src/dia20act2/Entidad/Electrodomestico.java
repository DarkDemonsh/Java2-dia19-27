package dia20act2.Entidad;

import java.util.Scanner;

public class Electrodomestico {
    Scanner leer = new Scanner(System.in);
    
    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumo(){
        
        if(consumo != 'a' && consumo != 'b'  && consumo != 'c'  && consumo != 'd'  && consumo != 'e'){
            consumo = 'f';
        }
        
    }
    
    public void comprobarColor(){

        if(!"negro".equalsIgnoreCase(color) && !"rojo".equalsIgnoreCase(color) && !"azul".equalsIgnoreCase(color) && !"gris".equalsIgnoreCase(color)){
            color = "blanco";            
        }
        
    }
    
    public void Crear(){
        System.out.println("Ingrese el color del electrodomestico");
        color = leer.next();
        comprobarColor();
        System.out.println("Ingrese el consumo (A-F)");
        String q = leer.next();
        consumo = q.charAt(0);
        comprobarConsumo();
        System.out.println("Ingrese el peso del electrodomestico");
        peso = leer.nextInt();
        
        precio = 1000;
    }
    
    public int PFinal(){
        
        if(peso >= 1 && peso <= 19){
            precio = precio + 100;
        }else if(peso >= 20 && peso <= 49){
            precio = precio + 500;
        }else if(peso >= 50 && peso <= 79){
            precio = precio + 800;
        }else if(peso >= 80){
            precio = precio + 1000;
        }
        switch(consumo) {
            case 'a':
                precio = precio + 1000;
                break;
            case 'b':
                precio = precio + 800;
                break;
            case 'c':
                precio = precio + 600;
                break;
            case 'd':
                precio = precio + 500;
                break;
            case 'e':
                precio = precio + 300;
                break;
            case 'f':
                precio = precio + 100;
                break;
            default:
                break;
        }
        return precio;   
    }
    
}
