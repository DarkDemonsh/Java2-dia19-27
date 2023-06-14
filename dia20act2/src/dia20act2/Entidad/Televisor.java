package dia20act2.Entidad;

public class Televisor extends Electrodomestico {
    
    protected int reso;
    protected boolean TDT;

    public Televisor() {
        this.TDT = false;
    }

    public Televisor(int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.TDT = false;
    }

    public Televisor(int reso, boolean TDT) {
        this.TDT = false;
        this.reso = reso;
        this.TDT = TDT;
    }

    public int getReso() {
        return reso;
    }

    public void setReso(int reso) {
        this.reso = reso;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    @Override
    public void Crear(){
        super.Crear();
        
        System.out.println("Ingrese las pulgadas del televisor");
        reso = leer.nextInt();
        System.out.println("Tiene un sintonizador TDT incorporado (SI/NO)");
        String r = leer.next();
        if(r.equalsIgnoreCase("Si")){
            TDT = true;
        }else if(r.equalsIgnoreCase("No")){
            TDT = false;
        }
        
    }
    
    @Override
    public int PFinal(){
        
        if(reso >= 40){
            
            int z = (super.precio*30)/ 100;
            
            super.precio = super.precio + z;
        }
        
        if(TDT != true){
        } else {
            super.precio = super.precio + 500;
        }
        
        super.PFinal();
        return super.precio;
    }
    
}
