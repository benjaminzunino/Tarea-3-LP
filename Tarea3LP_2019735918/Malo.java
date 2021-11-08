public class Malo extends NPC{
    public int cantidad_energia;
    public int cantidad_mana;

    public Malo(String Nombre, int Cantidad_Energia, int Cantidad_Mana){
        this.nombre = Nombre;
        this.cantidad_energia = Cantidad_Energia;
        this.cantidad_mana = Cantidad_Mana;
    }

    @Override
    public void interaccion(Jugador jugador) {
        System.out.println("");
        System.out.println(this.nombre + ": SOY MALO TE VOY A DISMINUIR TU ENERGIA Y MANA EN" + this.cantidad_energia + "Y" + this.cantidad_mana);
        System.out.println("");

        int Numero_Ramdom = (int) Math.floor(Math.random()*10+1);

        if (Numero_Ramdom < 6){
            jugador.energia_Actual = jugador.energia_Actual - this.cantidad_energia;
        }
        Numero_Ramdom = (int) Math.floor(Math.random()*10+1);

        if (Numero_Ramdom < 6){
            jugador.mana_Actual = jugador.mana_Actual - this.cantidad_mana;
        }
    }
    
}
