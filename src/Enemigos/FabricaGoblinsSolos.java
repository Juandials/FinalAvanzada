
package Enemigos;

public class FabricaGoblinsSolos implements IFabricaEnemigos{
    int ProbabilidadDaga, ProbabilidadArmadura, ProbabilidadJefe, ProbabilidadVagabundo;
    EnemigoConcreto EnemigoGenerado;
    VJefe Jefe;
    VVagabundo Vagabundo;
 
    @Override
    public IEnemigo FabricarEnemigos() {
        ProbabilidadDaga = (int) (Math.random() * 10) + 1;
        ProbabilidadArmadura = (int) (Math.random() * 10) + 1;
        ProbabilidadJefe = (int) (Math.random() * 10) + 1;
        ProbabilidadVagabundo = (int) (Math.random() * 10) + 1;
        
        EnemigoGenerado = new EGoblinSolitario();
        
        Jefe = new VJefe();
        Vagabundo = new VVagabundo();
        
        if (ProbabilidadDaga >= 5){
            DDaga prov = new DDaga(EnemigoGenerado);                   
            EnemigoGenerado = prov.RegresarDecorado();   
        }
        if (ProbabilidadArmadura >= 5){
            DArmadura prov = new DArmadura(EnemigoGenerado);
            EnemigoGenerado = prov.RegresarDecorado(); 
        }
        if (ProbabilidadJefe >= 5){
            EnemigoGenerado.Aceptar(Jefe);
            System.out.println("El enemigo es un Jefe");
        }else if(ProbabilidadVagabundo >= 5){
            EnemigoGenerado.Aceptar(Vagabundo);
            System.out.println("El enemigo es un Vagabundo");
        }
        return EnemigoGenerado;
    }
}
