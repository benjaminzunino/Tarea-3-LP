import java.util.ArrayList;
import java.util.List;

public class Druida extends Jugador{

    public Druida (String Druida_nombre){
        this.nombre = Druida_nombre;
        this.vida = 15;
        this.xp = 0;
        this.fuerza = 5;
        this.inteligencia = 5;
        this.energia = 5;
        this.mana = 5;

        this.nivel_Actual = 1;
        this.vida_Actual = 15;
        this.energia_Actual = 5;
        this.mana_Actual = 5; 
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

    private int MAX(int e, int m){
        int maximo;
        if(e > m || e == m){
            maximo = e;
        }else{
            maximo = m;
        }
        return maximo;
    }

    @Override
    public int ataque() {
        int Ataque = ((this.fuerza + this.inteligencia)/3) * MAX((this.energia/3), (this.mana/2));
        this.energia = this.energia - 3;
        return Ataque;
    }

    @Override
    public int hechizo() {
        int Hechizo = ((this.fuerza + this.inteligencia)/3) * MAX((this.energia/3), (this.mana/2));
        this.mana = this.mana - 3;
        return Hechizo;
    }

    @Override
    public void subir_experiencia(int experiencia) {
        this.xp = this.xp + experiencia;
        if (nivel_Actual < Nivel()){
            this.vida = this.vida + nivel_Actual;
            this.fuerza = this.fuerza + nivel_Actual;
            this.inteligencia = this.inteligencia + nivel_Actual;
            this.energia = this.energia + nivel_Actual;
            this.mana = this.mana + nivel_Actual;
        }
        
    }    
}
