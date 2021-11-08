abstract class Tierra {
    public float probabilidad_enemigo;
    public Monstruo monstruo;
    public Jefe_Final jefe_Final;
    public NPC npc;

    abstract boolean accion(Jugador jugador);
}
