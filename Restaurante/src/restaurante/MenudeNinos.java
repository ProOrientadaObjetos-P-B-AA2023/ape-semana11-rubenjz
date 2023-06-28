package restaurante;

public class MenudeNinos extends Menu{
    private double valorPHelado;
    private double valorPastel;

    public MenudeNinos(double valorPHelado, double valorPastel, String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
        this.valorPHelado = valorPHelado;
        this.valorPastel = valorPastel;
    }
    
    @Override
    public double calcularExtra() {
        double extra = this.valorPHelado + this.valorPastel;
        return extra;
    }

    @Override
    public String toString() {
        return "\nMenu a la Niños: " +
                super.toString() +
                "\nValor helado: " + valorPHelado +
                "\nValor pastel: " + valorPastel +
                "\nValor del Menú: " + valorMenu;
    }
    
}
