public class Montana extends Tierra{
    public Montana(float Probabilidad, Monstruo MONSTRUO, Jefe_Final Jefe, NPC nPC){
        this.probabilidad_enemigo = Probabilidad;
        this.monstruo = MONSTRUO;
        this.jefe_Final = Jefe;
        this.npc = nPC;
    }

    @Override
    boolean accion(Jugador jugador) {
        
        return false;
    }
    
}
