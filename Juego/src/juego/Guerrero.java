package juego;

public class Guerrero implements Character{
    private int puntosDeVida;
    
    public Guerrero() {
    }

    public Guerrero(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }


    @Override
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    @Override
    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    @Override
    public void recibirDanio(int cantidad) {
        System.out.println("Guerro recibio " + cantidad + " de daño!");
        this.puntosDeVida = this.puntosDeVida - cantidad;
    }

    @Override
    public void recuperarSalud(int cantidad) {
        System.out.println("Guerro recupero " + cantidad + " puntos de vida!");
        this.puntosDeVida = this.puntosDeVida + cantidad;
    }

    @Override
    public void mostrarAtaques() {
        System.out.println("|---------------------------------|");
        System.out.println("| Ataque                    |Daño |");
        System.out.println("|---------------------------------|");
        System.out.println("| 1) FiloDoble              | 15  |");
        System.out.println("| 2) Desespero(pierde 10ps) | 50  |");
        System.out.println("|---------------------------------|\n");
    }

    @Override
    public void mostrarPs() {
        System.out.println("Guerrero le quedan " + this.puntosDeVida +" ps");
    }

    @Override
    public int atacar(int opataque) {
        if (opataque == 1) {
            System.out.println("Guerro ataco con FiloDoble!");
            return 15;
        } else {
            System.out.println("Guerro ataco con Desespero!");
            return 50;
        }
    }

}