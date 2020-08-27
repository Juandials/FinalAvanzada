package Enemigos;

public class FabricaAleatoria implements IFabricaEnemigos{
    int Aleatorio;
    FabricaGoblinsSolos FabricaGoblins = new FabricaGoblinsSolos();
    FabricaDemonioClaseBaja FabricaDemonios = new FabricaDemonioClaseBaja();
    
    EnemigoConcreto EnemigoGenerado;
    
    @Override
    public IEnemigo FabricarEnemigos() {
        Aleatorio = (int) (Math.random() * 2) + 1;
        switch(Aleatorio){
            case 1:
                EnemigoGenerado = (EnemigoConcreto) FabricaGoblins.FabricarEnemigos();
                break;
            case 2:
                EnemigoGenerado = (EnemigoConcreto) FabricaDemonios.FabricarEnemigos();
        }
        
        return EnemigoGenerado;
    }
    
}
