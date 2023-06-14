package dia20act2.Entidad;

public class Lavadora extends Electrodomestico {
    
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    @Override
    public void Crear(){
        super.Crear();
        
        System.out.println("Ingresar el tamaño de la carga");
        carga = leer.nextInt();
        
    }
    
    @Override
    public int PFinal(){ 
        if(carga >= 31){
            
            super.precio = super.precio + 500;
        }
        super.PFinal();
        return super.precio;    
    }
    
}
