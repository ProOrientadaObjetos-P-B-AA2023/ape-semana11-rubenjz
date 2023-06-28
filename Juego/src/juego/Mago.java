package juego;

public class Mago implements Character{
    private int puntosDeVida;

    public Mago() {
    }

    public Mago(int puntosDeVida) {
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
        System.out.println("Mago recibio " + cantidad + " de daño!");
        this.puntosDeVida = this.puntosDeVida - cantidad;
    }

    @Override
    public void recuperarSalud(int cantidad) {
        System.out.println("Mago recupero " + cantidad + " puntos de vida!");
        this.puntosDeVida = this.puntosDeVida + cantidad;
    }

    @Override
    public void mostrarAtaques() {
        System.out.println("|-------------------------------------|");
        System.out.println("| Ataque                        |Daño |");
        System.out.println("|-------------------------------------|");
        System.out.println("| 1) Escudo cura(recupera 10ps) | 20  |");
        System.out.println("| 2) MagiaMugui                 | 50  |");
        System.out.println("|-------------------------------------|\n");
    }

    @Override
    public void mostrarPs() {
        System.out.println("Mago le quedan " + this.puntosDeVida +" ps");
    }

    @Override
    public int atacar(int opataque) {
        if (opataque == 1) {
            System.out.println("Mago ataco con Escudo cura!");
            return 20;
        } else {
            System.out.println("Mago ataco con MagiaMugui!");
            return 50;
        }
    }
    
}