package restaurante;

import java.util.List;

public class Cuenta {
    private String nombreCliente;
    private List<Menu> listadoMenus;
    private double subtotal;
    private double iva;
    private double total;

    public Cuenta(String nombreCliente, List<Menu> listadoMenus, double iva) {
        this.nombreCliente = nombreCliente;
        this.listadoMenus = listadoMenus;
        this.iva = iva;
    }

    public Cuenta(String nombreCliente, List<Menu> listadoMenus, double subtotal, double iva, double total) {
        this.nombreCliente = nombreCliente;
        this.listadoMenus = listadoMenus;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }
    
    public void calcularSubtotal(){
        this.subtotal = 0;
        for(Menu menu : listadoMenus){
            this.subtotal = this.subtotal + menu.getValorMenu();
        }
    }
    
    public void calcularTotal(){
        this.total = this.subtotal + (this.subtotal * iva);
    }

    @Override
    public String toString() {
        return "Factura\n" +
                "\nCliente: " + nombreCliente + "\n" +
                listadoMenus + "\n" +
                "\nSubtotal: " + subtotal +
                "\nIVA: " + (iva * 100) + "%" +
                "\nTotal a pagar: " + total;
    }
    
}
