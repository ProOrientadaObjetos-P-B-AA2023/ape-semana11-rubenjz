package juego;

public class Arquero extends Character implements IAtaqueArquero{

    public Arquero() {
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

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
    public void atacarTiroCertero() {
        System.out.println("Arquero ataco con TiroCertero!");
        this.ataque = 50;
    }

    @Override
    public void atacarDobleFlecha() {
        System.out.println("Arquero ataco con DobleFlecha!");
        this.ataque = 35;
    }

    @Override
    public void atacarFechaVeneno() {
        System.out.println("Arquero ataco con FechaVeneno!");
        this.ataque = 60;
    }

    @Override
    public void mostrarAtaques() {
        System.out.println("|----------------------|");
        System.out.println("| Ataque         |Daño |");
        System.out.println("|----------------------|");
        System.out.println("| TiroCertero    | 15  |");
        System.out.println("| DobleFlecha    | 15  |");
        System.out.println("| FechaVeneno    | 15  |");
        System.out.println("|----------------------|\n");
    }
    
}
