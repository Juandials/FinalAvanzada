package Logica;

import Enemigos.*;
import Heroe.*;

public class Batalla {
    boolean BatallaTerminada;
    public EnemigoConcreto ElEnemigo;
    public AHeroe ElHeroe;
    
    public Batalla(EnemigoConcreto Enemigo, AHeroe Heroe){
        ElEnemigo = Enemigo;
        ElHeroe = Heroe;
    }
    
    public void AtaqueHeroe(IEstrategia TipoAtaque){
        TipoAtaque.Operacion(ElEnemigo,ElHeroe);
    }
    
    public void AtaqueEnemigo(){
        ElEnemigo.Atacar(ElHeroe);
    }
    
    public boolean terminoOno(){
        if(ElHeroe.Estado == false || ElEnemigo.Estado == false){
            BatallaTerminada = true;
        }else{
            BatallaTerminada = false;
        }
        return BatallaTerminada;
    }
}
