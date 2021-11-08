import java.util.ArrayList;
import java.util.List;

abstract class Jugador {
    public String nombre;
    public int vida;
    public int xp;
    public int fuerza;
    public int inteligencia;
    public int energia;
    public int mana;
    public List<Mision> lista_misiones = new ArrayList<Mision>();
    
    public int nivel_Actual;
    public int vida_Actual;
    public int energia_Actual;
    public int mana_Actual;

    public abstract int ataque();
    public abstract int hechizo();
    public abstract void subir_experiencia(int experiencia);
}
