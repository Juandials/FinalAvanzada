package Enemigos;

public class VVagabundo implements IVisitante{
    
    @Override
    public void VisitarEnemigoConcreto(EnemigoConcreto Visitante) {
        Visitante.Recompensa = 0;
    }
}
