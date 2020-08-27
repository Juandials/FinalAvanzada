package Logica;

import Enemigos.EnemigoConcreto;
import Heroe.AHeroe;
import javax.swing.JOptionPane;

public class AtaqueCargado implements IEstrategia{
    
    @Override
    public void Operacion(EnemigoConcreto ElEnemigo, AHeroe ElHeroe) {
        JOptionPane.showMessageDialog(null, "Ataque cargado! El siguiente turno pegaras mucho mas!");
        ElHeroe.DañoCargado += ElHeroe.Ataque;
    }
    
}
