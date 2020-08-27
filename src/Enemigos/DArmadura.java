package Enemigos;

import Heroe.AHeroe;

public class DArmadura extends DecoradorDeEnemigos{
    DArmadura(EnemigoConcreto UnEnemigoConcreto){
        enemigoAdecorar = UnEnemigoConcreto;
        enemigoAdecorar.Defensa = enemigoAdecorar.Defensa + 5;
        enemigoAdecorar.HP = enemigoAdecorar.HP + 10;
        enemigoAdecorar.Armadura = true;
        System.out.println("El enemigo se puso armadura");
    }
    
    public EnemigoConcreto RegresarDecorado(){
        return enemigoAdecorar;
    }
    
    @Override
    public void Aceptar(IVisitante Visitante) {
        Visitante.VisitarEnemigoConcreto(enemigoAdecorar);
    } 
}
