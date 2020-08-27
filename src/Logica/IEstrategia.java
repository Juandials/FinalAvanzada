package Logica;

import Enemigos.EnemigoConcreto;
import Heroe.AHeroe;

public interface IEstrategia {
    public void Operacion(EnemigoConcreto ElEnemigo, AHeroe ElHeroe);
}
