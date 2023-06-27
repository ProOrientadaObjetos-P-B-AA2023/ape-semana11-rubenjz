package juego;

public abstract class Character {
    
    protected int puntosDeVida;
    protected int experiencia;
    protected int nivel;
    
    public abstract void recibirDanio(int cantidad);
    
    public abstract void recuperarSalud(int cantidad);
}
