package dia20act2;

import dia20act2.Entidad.Electrodomestico;
import dia20act2.Entidad.Lavadora;
import dia20act2.Entidad.Televisor;
import java.util.ArrayList;
import java.util.Iterator;

public class Dia20act2 {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        Electrodomestico l1 = new Lavadora();
        Electrodomestico l2 = new Lavadora();
        Electrodomestico t1 = new Televisor();
        Electrodomestico t2 = new Televisor();
        Iterator it = a1.iterator();
        int a = 1;
        int x = 0;
        
        t1.Crear();       
        a1.add(t1.PFinal());
        
        System.out.println("");
        
        t2.Crear();
        a1.add(t2.PFinal());
        
        System.out.println("");
        
        l1.Crear();
        a1.add(l1.PFinal());
        
        System.out.println("");
        
        l2.Crear();
        a1.add(l2.PFinal());
        
        System.out.println("");
        
        for (it = a1.iterator(); it.hasNext();) {
            System.out.print("Precio del electrodomestico: "+a+" - ");
            int r = (int) it.next();
            System.out.println(r);
            System.out.println("");
            a = a + 1;
        }
        
        for (it = a1.iterator(); it.hasNext();) {
            int i = (int) it.next();
            x = x+i;
        }
        System.out.println("Precio en total de todos los electrodomesticos: "+x);
        System.out.println("");
        
    }
    
}
