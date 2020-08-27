
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaMenu8Bit extends JFrame implements ActionListener, IVentanaMenu {
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
        BotonJugar.setIcon(new ImageIcon(getClass().getResource("/Img/Boton8BiJugar.png")));
        getContentPane().add(BotonJugar);
        
        BotonGraficos.setBounds(340, 380, 320, 50);
        BotonGraficos.addActionListener(this);
        BotonGraficos.setIcon(new ImageIcon(getClass().getResource("/Img/Boton8BiGraficos.png")));
        getContentPane().add(BotonGraficos);
        
        BotonSalida.setBounds(340, 460, 320, 50);
        BotonSalida.addActionListener(this);
        BotonSalida.setIcon(new ImageIcon(getClass().getResource("/Img/Boton8BiSalida.png")));
        getContentPane().add(BotonSalida);
        
        Logo.setBounds(160, 30, 710, 240);
        Logo.setIcon(new ImageIcon(getClass().getResource("/Img/Logotipo8Bi.png")));
        getContentPane().add(Logo);
        

        Fondo.setIcon(new ImageIcon(getClass().getResource("/Img/FondoMenu8Bi.png")));
        Fondo.setText("jLabel1");
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 1024, 576);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        FabricaInterfaz8Bit Fabrica8Bit = new FabricaInterfaz8Bit();
        if(e.getSource() == BotonJugar){
            this.dispose();
            VentanaEquipamiento8Bit Equip8Bit = (VentanaEquipamiento8Bit) Fabrica8Bit.FabricarVEquipamiento();
        }else if(e.getSource() == BotonGraficos){
            this.dispose();
            VentanaGraficos8Bit Graficos8Bit = (VentanaGraficos8Bit) Fabrica8Bit.FabricarVGraficos();   
        }else if(e.getSource() == BotonSalida){
            System.exit(0);
        }  
    }

    
    
}
