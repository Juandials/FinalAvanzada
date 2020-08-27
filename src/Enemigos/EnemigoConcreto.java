package Enemigos;

import Heroe.AHeroe;

public abstract class EnemigoConcreto implements IEnemigo, IVisitado{
    public String Nombre;
    public int HP;
    public int MP;
    public int Ataque;
    public int Defensa;
    public int Recompensa;
    public boolean Jefe;
    public boolean Daga; 
    public boolean Armadura;
    public boolean Estado;
    
    @Override
    public void Atacar(AHeroe HeroeObjetivo){
        int AtaqueNeto = Ataque - HeroeObjetivo.Defensa;
        if(AtaqueNeto <= 0){
            AtaqueNeto = 0;
        }        
        HeroeObjetivo.HP -= AtaqueNeto;
        System.out.println("Ataco el enemigo");
        System.out.println(HeroeObjetivo.HP);
        if(HeroeObjetivo.HP <= 0)
            HeroeObjetivo.Estado = false;
    }
}
