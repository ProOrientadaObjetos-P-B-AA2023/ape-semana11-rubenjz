package juego;

import java.util.Random;
import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Mago mago = new Mago();
        Arquero arquero = new Arquero();
        Guerrero guerrero = new Guerrero();
        
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
            personaje1 = sc.nextByte();
        }
        
        while((personaje2 < 1 || personaje2 > 3) || (personaje2 == personaje1)) {
            System.out.print("Jugador 2 Escoja un personaje diferente del jugador 1(1-3): ");
            personaje2 = sc.nextByte();
        }
        
        while (estadop) {
            if (turno == 1) {
                switch (personaje1) {
                    case 1:
                        
                        if (ataquedm != 0) {
                            guerrero.recibirDanio(ataquedm);
                        }
                        guerrero.mostrarAtaques();
                        System.out.println("4) Puede escoger recuperar una cantidad de ps aleatorio!");
                        while(ataqueop < 1 || ataqueop > 4) {
                            System.out.print("Escoja un ataque: ");
                            ataqueop = sc.nextInt();
                        }
                        
                        if(ataqueop == 1) {
                            guerrero.atacarFiloDoble();
                            ataquedm = 15;
                        } else if (ataqueop == 2) {
                            guerrero.atacarFuriaEspada();
                            ataquedm = 30;
                        } else if (ataqueop == 3){
                            guerrero.atacarDesespero();
                            ataquedm = 50;
                        } else {
                            guerrero.recuperarSalud(Ramdon());
                        }
                }
            }
        }
        
        
    }
    
    public static int Ramdon() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10) + 1;
        return numeroAleatorio;
    }
}
