import java.util.ArrayList;
import java.util.List;

public class Guerrero extends Jugador{

    public Guerrero (String Guerrero_nombre){
        this.nombre = Guerrero_nombre;
        this.vida = 20;
        this.xp = 0;
        this.fuerza = 9;
        this.inteligencia = 1;
        this.energia = 10;
        this.mana = 2;
        
        this.nivel_Actual = 1;
        this.vida_Actual = 20;
        this.energia_Actual = 10;
        this.mana_Actual = 2; 
    }

    private int Nivel(){
        int nivel = 0;

        if (xp > 0 && xp < 10) {
            nivel = 1;
        } else if (xp > 10 && xp < 25){
            nivel = 2;
        } else if (xp > 25 && xp < 50){
            nivel = 3;
        } else if (xp > 50 && xp < 100){
            nivel = 4;
        } else if (xp > 100 && xp < 200){
            nivel = 5;
        } else if (xp > 200 && xp < 350){
            nivel = 6;
        } else if (xp > 350 && xp < 600){
            nivel = 7;
        } else if (xp > 600 && xp < 900){
            nivel = 8;
        }
        
        return nivel;
    }

    @Override
    public int ataque() {
        int Ataque = this.fuerza * 2 + this.energia;
        this.energia = this.energia - 5;
        return Ataque;
    }

    @Override
    public int hechizo() {
        int Hechizo = this.inteligencia * (this.fuerza/4) + this.mana;
        this.mana = this.mana - 3;
        return Hechizo;
    }

    @Override
    public void subir_experiencia(int experiencia) {
        this.xp = this.xp + experiencia;
        if (nivel_Actual < Nivel()){
            this.vida = this.vida + (3 * nivel_Actual);
            this.fuerza = this.fuerza + (5 * nivel_Actual);
            this.inteligencia = this.inteligencia + 1;
            this.energia = this.energia + (2 * nivel_Actual);
            this.mana = this.mana + 1;
        }
        
    }    
}
