package juego;

public class Guerrero extends Character implements IAtaqueGuerrero{
    
    public Guerrero() {
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = this.puntosDeVida;
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
    public void atacarFiloDoble() {
        System.out.println("Guerro ataco con FiloDoble!");
    }

    @Override
    public void atacarFuriaEspada() {
        System.out.println("Guerro ataco con FuriaEspada!");
    }

    @Override
    public void atacarDesespero() {
        System.out.println("Guerro ataco con Desespero!");
    }

    @Override
    public void mostrarAtaques() {
        System.out.println("|--------------------|");
        System.out.println("| Ataque       |Daño |");
        System.out.println("|--------------------|");
        System.out.println("| FiloDoble    | 15  |");
        System.out.println("| FuriaEspada  | 30  |");
        System.out.println("| Desespero    | 50  |");
        System.out.println("|--------------------|\n");
    }

}
