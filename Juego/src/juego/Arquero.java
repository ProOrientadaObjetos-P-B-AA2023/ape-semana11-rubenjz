package juego;

public class Arquero implements Character{
    private int puntosDeVida;
    public Arquero() {
    }

    public Arquero(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    @Override
    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    @Override
    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    @Override
    public void recibirDanio(int cantidad) {
        System.out.println("Arquero recibio " + cantidad + " de daño!");
        this.puntosDeVida = this.puntosDeVida - cantidad;
    }

    @Override
    public void recuperarSalud(int cantidad) {
        System.out.println("Arquero recupero " + cantidad + " puntos de vida!");
        this.puntosDeVida = this.puntosDeVida + cantidad;
    }

    @Override
    public void mostrarAtaques() {
        System.out.println("|----------------------|");
        System.out.println("| Ataque         |Daño |");
        System.out.println("|----------------------|");
        System.out.println("| 1) TiroCertero | 50  |");
        System.out.println("|----------------------|\n");
    }

    @Override
    public void mostrarPs() {
        System.out.println("Arquero le quedan " + this.puntosDeVida +" ps");
    }

    @Override
    public int atacar(int opataque) {
        System.out.println("Arquero ataco con TiroCertero!");
        return 50;
    }

}