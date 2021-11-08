public class Planicie extends Tierra{
    public Planicie(float Probabilidad, Monstruo MONSTRUO, Jefe_Final Jefe, NPC nPC){
        this.probabilidad_enemigo = Probabilidad;
        this.monstruo = MONSTRUO;
        this.jefe_Final = Jefe;
        this.npc = nPC;
    }

    @Override
    boolean accion(Jugador jugador) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
