package Heroe;

public class DEspada extends ADecoradorHeroe{
    
    public DEspada (AHeroe UnHeroe){
        HeroeAdecorar = UnHeroe;
        HeroeAdecorar.MP = HeroeAdecorar.MP + 80;
        HeroeAdecorar.Ataque = HeroeAdecorar.Ataque + 10;
        HeroeAdecorar.Espada = true;
        System.out.println("Heroe con espada!");
    }
    
    public AHeroe RegresarHeroeDecorado(){
        return HeroeAdecorar;
    }
    
    public void Atacar(){
        System.out.println("Heroe con espada!");
        System.out.println("HP: " + HeroeAdecorar.HP);
        System.out.println("MP: " + HeroeAdecorar.MP);
        System.out.println("Ataque: " + HeroeAdecorar.Ataque);
        System.out.println("Defensa: " + HeroeAdecorar.Defensa);
        System.out.println("Dinero: " + HeroeAdecorar.Dinero);
        System.out.println("Espada: " + HeroeAdecorar.Espada);
        System.out.println("Escudo: " + HeroeAdecorar.Escudo);
        System.out.println();
    }
    
    public void Defender(){
    
    }
    
}
