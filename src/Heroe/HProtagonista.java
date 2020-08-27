package Heroe;

public class HProtagonista extends AHeroe{

    public HProtagonista(){
        HP = 100;
        MP = 100;
        Ataque = 10; 
        Defensa = 10; 
        Dinero = 0;
        DañoCargado = 0;
        Estado = true;
        Espada = false;
        Escudo = false;
    }
    
    public HProtagonista RegresarProtagonista(){
        return this;
    }
    
    public void Atacar(){
        System.out.println("Heroe simple!");
        System.out.println("HP: " + HP);
        System.out.println("MP: " + MP);
        System.out.println("Ataque: " + Ataque);
        System.out.println("Defensa: " + Defensa);
        System.out.println("Dinero: " + Dinero);
        System.out.println("Espada: " + Espada);
        System.out.println("Escudo: " + Escudo);
        System.out.println();
    }
    
    public void Defender(){
    
    }
}
