
package Enemigos;

import Heroe.AHeroe;

public class EGoblinSolitario extends EnemigoConcreto {

    public EGoblinSolitario() {
        Nombre = "Goblin";
        HP = 10;
        MP = 0;
        Ataque = 1;
        Defensa = 0;
        Recompensa = 1;
        Jefe = false;
        Daga = false;
        Armadura = false;
        Estado = true;
    }

    
    @Override
    public void Aceptar(IVisitante Visitante) {
       Visitante.VisitarEnemigoConcreto(this); 
    }
}
