package Interfaz;

import Enemigos.EnemigoConcreto;
import Heroe.AHeroe;
import javax.swing.JOptionPane;

public class FabricaInterfaz8Bit implements IAbsFabrica{

    @Override
    public IVentanaMenu FabricarVMenu() {
        VentanaMenu8Bit Prov = new VentanaMenu8Bit();
        Prov.InicializarVentana();
        Prov.setBounds(0,0,1024,576);
        Prov.setVisible(true);
        Prov.setResizable(false);
        return Prov;
    }

    @Override
    public IVentanaGraficos FabricarVGraficos() {
        VentanaGraficos8Bit Prov = new VentanaGraficos8Bit();
        Prov.InicializarVentana();
        Prov.setBounds(0,0,1024,576);
        Prov.setVisible(true);
        Prov.setResizable(false);
        return Prov;
    }

    @Override
    public IVentanaEquipamiento FabricarVEquipamiento() {
        VentanaEquipamiento8Bit Prov = new VentanaEquipamiento8Bit();
        Prov.InicializarVentana();
        Prov.setBounds(0,0,1024,576);
        Prov.setVisible(true);
        Prov.setResizable(false);
        return Prov;
    }

    @Override
    public IVentanaCombate FabricarVCombate(EnemigoConcreto ElEnemigo, AHeroe ElHeroe) {
        VentanaCombate8Bit Prov = new VentanaCombate8Bit(ElEnemigo, ElHeroe);
        Prov.InicializarVentana();
        Prov.setBounds(0,0,1024,576);
        Prov.setVisible(true);
        Prov.setResizable(false);
        JOptionPane.showMessageDialog(null, "Inicias vos!");
        return Prov;
    }
    
}
