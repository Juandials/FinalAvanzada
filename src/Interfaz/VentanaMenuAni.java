package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaMenuAni extends JFrame implements ActionListener, IVentanaMenu {
    JLabel Fondo,Logo;
    JButton BotonJugar,BotonGraficos, BotonSalida;
    
    @Override
    public void InicializarVentana() {
        BotonJugar = new JButton();
        BotonGraficos = new JButton();
        BotonSalida = new JButton();
        
        Logo = new JLabel();
        Fondo = new JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        BotonJugar.setBounds(340, 300, 320, 50);
        BotonJugar.addActionListener(this);
        BotonJugar.setIcon(new ImageIcon(getClass().getResource("/Img/BotonAniJugar.png")));
        getContentPane().add(BotonJugar);
        
        BotonGraficos.setBounds(340, 380, 320, 50);
        BotonGraficos.addActionListener(this);
        BotonGraficos.setIcon(new ImageIcon(getClass().getResource("/Img/BotonAniGraficos.png")));
        getContentPane().add(BotonGraficos);
        
        BotonSalida.setBounds(340, 460, 320, 50);
        BotonSalida.addActionListener(this);
        BotonSalida.setIcon(new ImageIcon(getClass().getResource("/Img/BotonAniSalida.png")));
        getContentPane().add(BotonSalida);
        
        Logo.setBounds(160, 30, 710, 240);
        Logo.setIcon(new ImageIcon(getClass().getResource("/Img/LogotipoAni.png")));
        getContentPane().add(Logo);
        

        Fondo.setIcon(new ImageIcon(getClass().getResource("/Img/FondoMenuAni.png")));
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 1024, 576);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        FabricaInterfazAni FabricaAni = new FabricaInterfazAni();
        if(e.getSource() == BotonJugar){
            this.dispose();
            VentanaEquipamientoAni EquipAni = (VentanaEquipamientoAni) FabricaAni.FabricarVEquipamiento();
        }else if(e.getSource() == BotonGraficos){
            this.dispose();       
            VentanaGraficosAni MenuAni = (VentanaGraficosAni) FabricaAni.FabricarVGraficos();
        }else if(e.getSource() == BotonSalida){
            System.exit(0);
        }  
    }

    
    
}
