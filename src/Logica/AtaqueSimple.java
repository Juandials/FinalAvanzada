package Logica;

import Enemigos.EnemigoConcreto;
import Heroe.AHeroe;

public class AtaqueSimple implements IEstrategia{
    
    @Override
    public void Operacion(EnemigoConcreto ElEnemigo, AHeroe ElHeroe) {
        int AtaqueNeto = ElHeroe.Ataque + ElHeroe.DañoCargado - ElEnemigo.Defensa;
        if(AtaqueNeto <= 0){
            AtaqueNeto = 0;
        }
        
        if(ElHeroe.DañoCargado != 0){
            ElEnemigo.HP -= AtaqueNeto;
            ElHeroe.DañoCargado = 0;
        }else{
            ElEnemigo.HP -= AtaqueNeto;
        }
        
        if(ElEnemigo.HP <= 0)
            ElEnemigo.Estado = false;
    }
    
}
