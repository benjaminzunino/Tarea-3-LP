import java.util.Scanner;

public class Monstruo extends Enemigo{
    public int vida;
    public int dano;

    public Monstruo(int Vida, int Dano){
        this.vida = Vida;
        this.dano = Dano;
    }

    @Override
    public void combate(Jugador jugador) {
        System.out.println("");
        System.out.println("HA EMEPEZADO EL COMBATE");
        do {
            System.out.println("");
            System.out.println("ES TU TURNO, QUE DESEAS HACER?");
            System.out.println("1- ATAQUE");
            System.out.println("2- HECHIZO");
            System.out.println("");
            Scanner Input = new Scanner(System.in);
            int opcion = Input.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("HAZ ATACADO AL MONSTRUO");
                    this.vida = this.vida - jugador.ataque();
                    break;
                case 2:
                    System.out.println("HAZ LANZADO UN HECHIZO AL MONSTRUO");
                    this.vida = this.vida - jugador.hechizo();
                default:
                    System.out.println("UPS! QUE PENA ESA OPCION NO EXISTE ASI QUE HAZ PERDIDO TU TURNO");
                    System.out.println("EL MONSTRUO ATACARA!");
                    break;
            }

            System.out.println("");

            System.out.println("EL MONSTRUO TE HA ATACADO!");

            jugador.vida_Actual = jugador.vida_Actual - this.dano;

        } while (jugador.vida_Actual > 0 || this.vida > 0);
        
        jugador.subir_experiencia(vida/2);
    }
    
}
