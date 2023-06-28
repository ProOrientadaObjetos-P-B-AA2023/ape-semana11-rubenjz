package juego;

public interface Character {
    
    public int getPuntosDeVida();
    
    public void setPuntosDeVida(int puntosDeVida);
    
    public void recibirDanio(int cantidad);
    
    public void recuperarSalud(int cantidad);
    
    public int atacar(int opataque);
    
    public void mostrarAtaques();
    
    public void mostrarPs();
}