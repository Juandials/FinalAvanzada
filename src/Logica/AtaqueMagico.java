package Logica;

import Enemigos.EnemigoConcreto;
import Heroe.AHeroe;
import javax.swing.JOptionPane;

public class AtaqueMagico implements IEstrategia{

    @Override
    public void Operacion(EnemigoConcreto ElEnemigo, AHeroe ElHeroe) {
        int DañoMagico = ElHeroe.Ataque*2;
        if(ElHeroe.DañoCargado != 0){
            if(ElHeroe.MP >= 20){
                ElHeroe.MP -= 20;
                JOptionPane.showMessageDialog(null, "Estas A punto de usar un ataque magico!");
                ElEnemigo.HP -= (DañoMagico + ElHeroe.DañoCargado) - ElEnemigo.Defensa;
                ElHeroe.DañoCargado = 0;
            }else
                JOptionPane.showMessageDialog(null, "Atento a tu Mana, No tienes suficiente para este ataque y Recibiste daño del enemigo mientras recitabas el conjuro!");
        }else{
            if(ElHeroe.MP >= 20){
                ElHeroe.MP -= 20;
                JOptionPane.showMessageDialog(null, "Estas A punto de usar un ataque magico!");
                ElEnemigo.HP -= DañoMagico - ElEnemigo.Defensa;
            }else
                JOptionPane.showMessageDialog(null, "Atento a tu Mana, No tienes suficiente para este ataque y Recibiste daño del enemigo mientras recitabas el conjuro!");
        }
        
        if(ElEnemigo.HP <= 0)
            ElEnemigo.Estado = false;
    }
    
}
