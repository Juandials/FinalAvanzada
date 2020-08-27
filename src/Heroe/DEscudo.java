package Heroe;

public class DEscudo extends ADecoradorHeroe{
    
    public DEscudo(AHeroe UnHeroe){
        HeroeAdecorar = UnHeroe;
        HeroeAdecorar.HP = HeroeAdecorar.HP + 100;
        HeroeAdecorar.Defensa = HeroeAdecorar.Defensa + 10;
        HeroeAdecorar.Escudo = true;
        System.out.println("Heroe con escudo!");
    }
    
    public AHeroe RegresarHeroeDecorado(){
        return HeroeAdecorar;
    }
    
    public void Atacar(){
        System.out.println("Heroe con escudo!");
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
