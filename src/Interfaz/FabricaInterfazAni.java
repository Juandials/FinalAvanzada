package Interfaz;

import Enemigos.EnemigoConcreto;
import Heroe.AHeroe;
import javax.swing.JOptionPane;

public class FabricaInterfazAni implements IAbsFabrica{
    
    @Override
    public IVentanaMenu FabricarVMenu() {
        VentanaMenuAni Prov = new VentanaMenuAni();
        Prov.InicializarVentana();
        Prov.setBounds(0,0,1024,576);
        Prov.setVisible(true);
        Prov.setResizable(false);
        return Prov;
    }

    @Override
    public IVentanaGraficos FabricarVGraficos() {
        VentanaGraficosAni Prov = new VentanaGraficosAni();
        Prov.InicializarVentana();
        Prov.setBounds(0,0,1024,576);
        Prov.setVisible(true);
        Prov.setResizable(false);
        return Prov;
    }

    @Override
    public IVentanaEquipamiento FabricarVEquipamiento() {
        VentanaEquipamientoAni Prov = new VentanaEquipamientoAni();
        Prov.InicializarVentana();
        Prov.setBounds(0,0,1024,576);
        Prov.setVisible(true);
        Prov.setResizable(false);
        return Prov;
    }

    @Override
    public IVentanaCombate FabricarVCombate(EnemigoConcreto ElEnemigo, AHeroe ElHeroe) {
        VentanaCombateAni Prov = new VentanaCombateAni(ElEnemigo, ElHeroe);
        Prov.InicializarVentana();
        Prov.setBounds(0,0,1024,576);
        Prov.setVisible(true);
        Prov.setResizable(false);
        JOptionPane.showMessageDialog(null, "Inicias vos!");
        return Prov;
    }

    
}
