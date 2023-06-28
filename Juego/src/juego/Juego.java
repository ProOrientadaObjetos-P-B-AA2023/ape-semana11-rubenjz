package juego;

import java.util.Random;
import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Mago mago = new Mago();
        Arquero arquero = new Arquero();
        Guerrero guerrero = new Guerrero();
        
        guerrero.setPuntosDeVida(275);
        arquero.setPuntosDeVida(225);
        mago.setPuntosDeVida(175);
        
        int personaje1 = 0, personaje2 = 0;
        int ataqueop = 0, ataquedm = 0, curacion, turno = 1;
        boolean estadop = true;
        
        System.out.println("|------------|");
        System.out.println("| Smudy Game |");
        System.out.println("|------------|\n");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("| Personajes                                  | Salud |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("| 1) Guerrero: gran destreza cuerpo a cuerpo  | 275   |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("| 2) Arquero: tiro certero a gran distancia   | 225   |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("| 3) Mago: Magia poderosa y hechizos potentes | 175   |");
        System.out.println("|-----------------------------------------------------|\n");
        
        while(personaje1 < 1 || personaje1 > 3) {
            System.out.print("Jugador 1 Escoja un personaje (1-3): ");
            personaje1 = sc.nextInt();
        }
        
        while((personaje2 < 1 || personaje2 > 3) || (personaje2 == personaje1)) {
            System.out.print("Jugador 2 Escoja un personaje diferente del jugador 1(1-3): ");
            personaje2 = sc.nextInt();
        }
        
        while (estadop == true) {
            if (turno == 1) {
                System.out.println("Es turno del jugador 1");
                turno = turno + 1;
                switch (personaje1) {
                    case 1:
                        if (ataquedm != 0) {
                            guerrero.recibirDanio(ataquedm);
                        }
                        if(guerrero.getPuntosDeVida() <= 0) {
                            System.out.println("Guerro murio");
                            estadop = false;
                            break;
                        } else {
                            guerrero.mostrarPs();
                        }
                        guerrero.mostrarAtaques();
                        System.out.println("3) Puede escoger recuperar una cantidad de ps aleatorio!");
                        while(ataqueop < 1 || ataqueop > 3) {
                            System.out.print("Escoja un ataque: ");
                            ataqueop = sc.nextInt();
                        }
                        
                        if(ataqueop == 3) {
                            guerrero.recuperarSalud(VidaRamdon());
                            ataquedm = 0;
                        } else {
                            ataquedm = guerrero.atacar(ataqueop);
                        }
                        
                        if(ataqueop == 2) {
                            guerrero.recibirDanio(10);
                        }
                        break;
                    case 2:
                        if (ataquedm != 0) {
                            arquero.recibirDanio(ataquedm);
                        }
                        if(arquero.getPuntosDeVida() <= 0) {
                            System.out.println("Arquero murio");
                            estadop = false;
                            break;
                        } else {
                            mago.mostrarPs();
                        }
                        arquero.mostrarAtaques();
                        System.out.println("2) Puede escoger recuperar una cantidad de ps aleatorio!");
                        while(ataqueop < 1 || ataqueop > 3) {
                            System.out.print("Escoja un ataque: ");
                            ataqueop = sc.nextInt();
                        }
                        
                        if(ataqueop == 3) {
                            arquero.recuperarSalud(VidaRamdon());
                            ataquedm = 0;
                        } else {
                            ataquedm = arquero.atacar(ataqueop);
                        }
                        break;
                    case 3:
                        if (ataquedm != 0) {
                            mago.recibirDanio(ataquedm);
                        }
                        if(mago.getPuntosDeVida() <= 0) {
                            System.out.println("Mago murio");
                            estadop = false;
                            break;
                        } else {
                            mago.mostrarPs();
                        }
                        mago.mostrarAtaques();
                        System.out.println("3) Puede escoger recuperar una cantidad de ps aleatorio!");
                        while(ataqueop < 1 || ataqueop > 4) {
                            System.out.print("Escoja un ataque: ");
                            ataqueop = sc.nextInt();
                        }
                        
                        if(ataqueop == 3) {
                            mago.recuperarSalud(VidaRamdon());
                            ataquedm = 0;
                        } else {
                            ataquedm = mago.atacar(ataqueop);
                        }
                        
                        if(ataqueop == 1) {
                            mago.recuperarSalud(10);
                        }
                        break;
                }
            } else {
                System.out.println("Es turno del jugador 2");
                turno = turno - 1;
                switch (personaje2) {
                    case 1:
                        if (ataquedm != 0) {
                            guerrero.recibirDanio(ataquedm);
                        }
                        if(guerrero.getPuntosDeVida() <= 0) {
                            System.out.println("Guerro murio");
                            estadop = false;
                            break;
                        } else {
                            guerrero.mostrarPs();
                        }
                        guerrero.mostrarAtaques();
                        System.out.println("3) Puede escoger recuperar una cantidad de ps aleatorio!");
                        while(ataqueop < 1 || ataqueop > 3) {
                            System.out.print("Escoja un ataque: ");
                            ataqueop = sc.nextInt();
                        }
                        
                        if(ataqueop == 3) {
                            guerrero.recuperarSalud(VidaRamdon());
                            ataquedm = 0;
                        } else {
                            ataquedm = guerrero.atacar(ataqueop);
                        }
                        
                        if(ataqueop == 2) {
                            guerrero.recibirDanio(10);
                        }
                        break;
                    case 2:
                        if (ataquedm != 0) {
                            arquero.recibirDanio(ataquedm);
                        }
                        if(arquero.getPuntosDeVida() <= 0) {
                            System.out.println("Arquero murio");
                            estadop = false;
                            break;
                        } else {
                            mago.mostrarPs();
                        }
                        arquero.mostrarAtaques();
                        System.out.println("2) Puede escoger recuperar una cantidad de ps aleatorio!");
                        while(ataqueop < 1 || ataqueop > 3) {
                            System.out.print("Escoja un ataque: ");
                            ataqueop = sc.nextInt();
                        }
                        
                        if(ataqueop == 3) {
                            arquero.recuperarSalud(VidaRamdon());
                            ataquedm = 0;
                        } else {
                            ataquedm = arquero.atacar(ataqueop);
                        }
                        break;
                    case 3:
                        if (ataquedm != 0) {
                            mago.recibirDanio(ataquedm);
                        }
                        if(mago.getPuntosDeVida() <= 0) {
                            System.out.println("Mago murio");
                            estadop = false;
                            break;
                        } else {
                            mago.mostrarPs();
                        }
                        mago.mostrarAtaques();
                        System.out.println("3) Puede escoger recuperar una cantidad de ps aleatorio!");
                        while(ataqueop < 1 || ataqueop > 4) {
                            System.out.print("Escoja un ataque: ");
                            ataqueop = sc.nextInt();
                        }
                        
                        if(ataqueop == 3) {
                            mago.recuperarSalud(VidaRamdon());
                            ataquedm = 0;
                        } else {
                            ataquedm = mago.atacar(ataqueop);
                        }
                        
                        if(ataqueop == 1) {
                            mago.recuperarSalud(10);
                        }
                        break;
                }
            }
            ataqueop = 0;
        }
        
        
    }
    
    public static int VidaRamdon() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10) + 1;
        numeroAleatorio = numeroAleatorio * 10;
        return numeroAleatorio;
    }
}
