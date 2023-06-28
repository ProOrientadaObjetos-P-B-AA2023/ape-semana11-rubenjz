package restaurante;

import java.util.ArrayList;

public class Ejecutor01 {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();
        
        MenudeNinos ninos1 = new MenudeNinos(1.00,1.50,"Niños 01",2.00);
        MenudeNinos ninos2 = new MenudeNinos(1.00,1.50,"Niños 01",3.00);
        MenuEconomico econ = new MenuEconomico(25.00,"Econo 001",4.00);
        MenudelDia dia = new MenudelDia(1.00,1.00,"Dia 001",5.00);
        MenualaCarta carta = new MenualaCarta(1.50,2.00,10.00,"Carta 001",6);
        
        lista.add(ninos1);
        lista.add(ninos2);
        lista.add(econ);
        lista.add(dia);
        lista.add(carta);
        
        Cuenta cuenta1 = new Cuenta("René Elizalde",lista,0.12); 
       
        cuenta1.calcularSubtotal();
        cuenta1.calcularTotal();
       
        System.out.println(cuenta1.toString());
    }
    
}