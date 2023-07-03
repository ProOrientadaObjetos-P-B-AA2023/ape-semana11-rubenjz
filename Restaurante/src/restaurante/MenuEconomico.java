package restaurante;

public class MenuEconomico extends Menu{
    private double descuento;

    public MenuEconomico(double descuento, String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
        this.descuento = descuento;
        calcularValorMenu();
    }
    
    @Override
    public double calcularExtra() {
        double extra = (this.descuento /100) * this.getValorInicialMenu() * -1;
        return extra;
    }

    @Override
    public String toString() {
        return "\nMenu a la Carta: " +
                super.toString() +
                "\nPorcentaje Descuento: " + descuento +
                "\nValor del Menú: " + valorMenu;
    }

}
