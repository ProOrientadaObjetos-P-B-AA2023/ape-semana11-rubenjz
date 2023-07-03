package restaurante;

public class MenualaCarta extends Menu {
    private double valorPGuarnición;
    private double valorBebida;
    private double valorAdicional;

    public MenualaCarta(double valorPGuarnición, double valorBebida, double valorAdicional, String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
        this.valorPGuarnición = valorPGuarnición;
        this.valorBebida = valorBebida;
        this.valorAdicional = valorAdicional;
        calcularValorMenu();
    }
    
    @Override
    public double calcularExtra() {
        double extra = this.valorAdicional + this.valorBebida + this.valorPGuarnición;
        return extra;
    }

    @Override
    public String toString() {
        return "\nMenu a la Carta: " +
                super.toString() +
                "\nValor guarnición: " + valorPGuarnición +
                "\nValor bebida: " + valorBebida +
                "\nPorcentaje Adicional: " + valorAdicional +
                "\nValor del Menú: " + valorMenu;
    }

}
