import java.lang.invoke.ClassSpecializer.Factory;

public class Neutro extends NPC{
    public char requisito;
    public int valor;
    public int recompensa;
    public Boolean ya_dio_mision;

    public Neutro(String Nombre, char Requisito, int Valor, int Recompensa){
        this.nombre = Nombre;
        this.requisito = Requisito;
        this.valor = Valor;
        this.recompensa = Recompensa;
        this.ya_dio_mision = false;
    }

    @Override
    public void interaccion(Jugador jugador) {
        ///
        
    }
    
}
