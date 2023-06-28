package restaurante;

public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nombrePlato, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorInicialMenu = valorInicialMenu;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public void calcularValorMenu() {
        this.valorMenu = this.valorInicialMenu + calcularExtra();
    }

    public double getValorInicialMenu() {
        return valorInicialMenu;
    }

    public void setValorInicialMenu(double valorInicialMenu) {
        this.valorInicialMenu = valorInicialMenu;
    }

    public void setValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }
    
    public abstract double calcularExtra();

    @Override
    public String toString() {
        return "\nPlato: " + nombrePlato +
                "\nValor Inicial: " + valorInicialMenu;
    }
    
}