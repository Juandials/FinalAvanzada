
package Interfaz;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class VentanaGraficos8Bit extends JFrame implements ActionListener, IVentanaGraficos {
    JButton Regresar,OpcionAni,Opcion8Bit;
    JLabel Fondo,CuadroDialogo;
    
    @Override
    public void InicializarVentana() {
        Regresar = new JButton();
        OpcionAni = new JButton();
        Opcion8Bit = new JButton();
        CuadroDialogo = new JLabel();
        Fondo = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(1024, 576));
        getContentPane().setLayout(null);

        Regresar.setIcon(new ImageIcon(getClass().getResource("/Img/BotonRegresar8Bi.png")));
        Regresar.setBorder(null);
        Regresar.setBorderPainted(false);
        Regresar.setContentAreaFilled(false);
        Regresar.setPreferredSize(new Dimension(194, 212));
        Regresar.addActionListener(this);
        getContentPane().add(Regresar);
        Regresar.setBounds(20, 20, 45, 49);

        OpcionAni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GraficasOpcionAni.png")));
        OpcionAni.setBorder(null);
        OpcionAni.setBorderPainted(false);
        OpcionAni.setContentAreaFilled(false);
        OpcionAni.setPreferredSize(new java.awt.Dimension(194, 212));
        OpcionAni.addActionListener(this);
        getContentPane().add(OpcionAni);
        OpcionAni.setBounds(570, 110, 300, 410);

        Opcion8Bit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GraficasOpcion8Bi.png")));
        Opcion8Bit.setBorder(null);
        Opcion8Bit.setBorderPainted(false);
        Opcion8Bit.setContentAreaFilled(false);
        Opcion8Bit.setPreferredSize(new java.awt.Dimension(194, 212));
        Opcion8Bit.addActionListener(this);
        getContentPane().add(Opcion8Bit);
        Opcion8Bit.setBounds(140, 110, 300, 410);

        CuadroDialogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CuadroDialogoGraficas8Bi.png")));
        getContentPane().add(CuadroDialogo);
        CuadroDialogo.setBounds(20, 50, 980, 490);

        Fondo.setIcon(new ImageIcon(getClass().getResource("/Img/FondoMenu8Bi.png")));
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 1030, 580);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Opcion8Bit){
            this.dispose();
            FabricaInterfaz8Bit Fabrica8Bit = new FabricaInterfaz8Bit();
            VentanaMenu8Bit Menu8Bit = (VentanaMenu8Bit) Fabrica8Bit.FabricarVMenu();
        }else if(e.getSource() == OpcionAni){
            this.dispose();
            FabricaInterfazAni FabricaAni = new FabricaInterfazAni();
            VentanaMenuAni MenuAni = (VentanaMenuAni) FabricaAni.FabricarVMenu();
        }else if(e.getSource() == Regresar){
            this.dispose();
            FabricaInterfaz8Bit Fabrica8Bit = new FabricaInterfaz8Bit();
            VentanaMenu8Bit Menu8Bit = (VentanaMenu8Bit) Fabrica8Bit.FabricarVMenu();
        }  
    }
    
}
