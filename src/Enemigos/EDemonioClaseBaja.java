package Enemigos;

import Heroe.AHeroe;

public class EDemonioClaseBaja extends EnemigoConcreto{
    
    public EDemonioClaseBaja(){
        Nombre = "DemonioCB";
        HP = 20;
        MP = 20;
        Ataque = 5;
        Defensa = 5;
        Recompensa = 10;
        Jefe = false;
        Daga = false;
        Armadura = false;
        Estado = true;
    }

    @Override
    public void Aceptar(IVisitante Visitante) {
        Visitante.VisitarEnemigoConcreto(this); 
        System.out.println("El Demonio de clase baja ha sido promovido a Demonio de clase baja milenario!");
    }
}
