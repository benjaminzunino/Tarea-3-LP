public class Bueno extends NPC{
    public String atributo;
    public int cantidad;

    public Bueno(String Nombre, String Atributo, int Cantidad){
        this.nombre = Nombre;
        this.atributo = Atributo;
        this.cantidad = Cantidad;
    }

    @Override
    public void interaccion(Jugador jugador) {
        System.out.println("");
        System.out.println(this.nombre + ": Creo que nesecitas un poco de ayuda te subire "+ this.cantidad + "a tu" + this.atributo);
        System.out.println("");

        if (this.atributo == "vida" && jugador.vida > jugador.vida_Actual){
            jugador.vida_Actual = jugador.vida_Actual + this.cantidad;
            if (jugador.vida < jugador.vida_Actual){
                jugador.vida_Actual = jugador.vida;
            }
        }else if (this.atributo == "xp" && jugador.xp < 900){
            jugador.xp = jugador.xp + this.cantidad;
        }else if (this.atributo == "energia" && jugador.energia > jugador.energia_Actual){
            jugador.energia_Actual = jugador.energia_Actual + this.cantidad;
            if (jugador.energia < jugador.energia_Actual){
                jugador.energia_Actual = jugador.energia;
            }
        }else if (this.atributo == "mana" && jugador.mana > jugador.mana_Actual){
            jugador.mana_Actual = jugador.mana_Actual + this.cantidad;
            if (jugador.mana < jugador.mana_Actual){
                jugador.mana_Actual = jugador.mana;
            }
        }
    }
    
}
