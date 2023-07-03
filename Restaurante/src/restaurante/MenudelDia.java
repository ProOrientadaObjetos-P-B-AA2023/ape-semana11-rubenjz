package restaurante;

public class MenudelDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenudelDia(double valorPostre, double valorBebida, String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
        calcularValorMenu();
    }

    @Override
    public double calcularExtra() {
        double extra = this.valorBebida + this.valorPostre;
        return extra;
    }

    @Override
    public String toString() {
        return "\nMenu del Dia: " +
                super.toString() +
                "\nValor bebida: " + valorBebida +
                "\nValor postre: " + valorPostre +
                "\nValor del Menú: " + valorMenu;
    }

}
