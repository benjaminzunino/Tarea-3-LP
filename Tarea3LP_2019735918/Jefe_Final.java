import java.util.Scanner;

public class Jefe_Final extends Enemigo{
    public String nombre;
    public int vida;
    public int dano_base;
    private int vida_base;

    public Jefe_Final(String Nombre, int Vida, int Dano){
        this.nombre = Nombre;
        this.vida = Vida;
        this.dano_base = Dano;
        this.vida_base = Vida;
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
                    System.out.println("HAZ ATACADO A" + this.nombre + "!");
                    this.vida = this.vida - jugador.ataque();
                    break;
                case 2:
                    System.out.println("HAZ LANZADO UN HECHIZO A" + this.nombre + "!");
                    this.vida = this.vida - jugador.hechizo();
                default:
                    System.out.println("UPS! QUE PENA ESA OPCION NO EXISTE ASI QUE HAZ PERDIDO TU TURNO");
                    System.out.println(this.nombre + "ATACARA!");
                    break;
            }

            System.out.println("");
            System.out.println(this.nombre + "TE HA ATACADO!");

            if (this.vida/2 >= this.vida_base) {
                jugador.vida_Actual = jugador.vida_Actual - ((this.dano_base + 2) * 1);
            }else{
                jugador.vida_Actual = jugador.vida_Actual - ((this.dano_base + 2) * 2);
            }

        } while (jugador.vida_Actual > 0 || this.vida > 0);
        
        jugador.subir_experiencia(vida/2);
        
    }
    
}
