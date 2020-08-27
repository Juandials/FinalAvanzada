package Enemigos;

public class VJefe implements IVisitante{

    @Override
    public void VisitarEnemigoConcreto(EnemigoConcreto Visitante) {
        Visitante.Recompensa *= 10;
        Visitante.HP *= 10;
        Visitante.Ataque *= 5;
        Visitante.Defensa *= 2;
        Visitante.Jefe = true;
    } 
}
