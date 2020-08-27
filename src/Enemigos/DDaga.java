package Enemigos;

import Heroe.AHeroe;

public class DDaga extends DecoradorDeEnemigos{

    DDaga(EnemigoConcreto UnEnemigoConcreto){
        enemigoAdecorar = UnEnemigoConcreto;
        enemigoAdecorar.Ataque = enemigoAdecorar.Ataque + 5;
        enemigoAdecorar.Daga = true;
        System.out.println("El enemigo cogio una daga!");
    }
    
    public EnemigoConcreto RegresarDecorado(){
        return enemigoAdecorar;
    }
    
    @Override
    public void Aceptar(IVisitante Visitante) {
        Visitante.VisitarEnemigoConcreto(enemigoAdecorar);
    }
}
