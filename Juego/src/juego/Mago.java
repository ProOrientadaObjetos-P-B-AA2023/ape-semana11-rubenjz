package juego;

public class Mago extends Character implements IAtaqueMago{

    public Mago() {
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    @Override
    public void recibirDanio(int cantidad) {
        System.out.println("Guerro Mago " + cantidad + " de daño!");
        this.puntosDeVida = this.puntosDeVida - cantidad;
    }

    @Override
    public void recuperarSalud(int cantidad) {
        System.out.println("Mago recupero " + cantidad + " puntos de vida!");
        this.puntosDeVida = this.puntosDeVida + cantidad;
    }

    @Override
    public void atacarGelido() {
        System.out.println("Mago ataco con Gelido!");
        this.ataque = 60;
    }

    @Override
    public void atacarEscudoCura() {
        System.out.println("Mago ataco con Escudo cura!");
        System.out.println("Mago recupero 10 puntos de vida!");
        this.ataque = 20;
        this.puntosDeVida = this.puntosDeVida + 10;
    }

    @Override
    public void atacarMagiaMugui() {
        System.out.println("Mago ataco con MagiaMugui!");
        this.ataque = 80;
    }

    @Override
    public void mostrarAtaques() {
        System.out.println("|-----------------------------------|");
        System.out.println("| Ataque                      |Daño |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Gelido                      | 60  |");
        System.out.println("| Escudo cura(recupera 10ps)  | 20  |");
        System.out.println("| MagiaMugui                  | 50  |");
        System.out.println("|-----------------------------------|\n");
    }
    
}
