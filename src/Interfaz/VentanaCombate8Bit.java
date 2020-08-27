
package Interfaz;

import Enemigos.EnemigoConcreto;
import Heroe.AHeroe;
import Logica.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaCombate8Bit extends JFrame implements ActionListener, IVentanaCombate {
    JButton BotonRegresar, BotonDeshacer, BotonAtaqueBasico, BotonAtaqueCargado, BotonAtaqueEspecial, BotonRendirse; 
    JLabel Fondo,CuadroDialogo, LabelHeroe,LabelEnemigo,LabelStatsHeroe,LabelStatsEnemigos;
    JLabel HPHeroe, MPHeroe, AtaqueHeroe, DefensaHeroe, HPEnemigo, MPEnemigo, AtaqueEnemigo,DefensaEnemigo, RecompensaEnemigo;
    EnemigoConcreto ElEnemigo;
    AHeroe ElHeroe;
    Batalla Batalla;
    AtaqueCargado AtaqueCargado;
    AtaqueMagico AtaqueMagico;
    AtaqueSimple AtaqueSimple;
    
    VentanaCombate8Bit(EnemigoConcreto EnemigoElegido, AHeroe HeroeElegido){
        ElEnemigo = EnemigoElegido;
        ElHeroe = HeroeElegido;
        AtaqueCargado = new AtaqueCargado();
        AtaqueMagico = new AtaqueMagico();
        AtaqueSimple = new AtaqueSimple();
        Batalla = new Batalla(ElEnemigo,ElHeroe);
    }
    
    @Override
    public void InicializarVentana() {
        
        
        BotonRegresar = new JButton();
        BotonDeshacer = new JButton();
        BotonAtaqueEspecial = new JButton();
        BotonRendirse = new JButton();
        BotonAtaqueCargado = new JButton();
        BotonAtaqueBasico = new JButton();
        
        Fondo = new JLabel();
        CuadroDialogo = new JLabel();
        LabelHeroe = new JLabel();
        LabelEnemigo = new JLabel();
        LabelStatsHeroe = new JLabel();
        LabelStatsEnemigos = new JLabel();
        
        HPHeroe = new JLabel();
        MPHeroe = new JLabel();
        AtaqueHeroe = new JLabel();
        DefensaHeroe = new JLabel();
        HPEnemigo = new JLabel();
        MPEnemigo = new JLabel();
        AtaqueEnemigo = new JLabel();
        DefensaEnemigo = new JLabel();
        RecompensaEnemigo = new JLabel();
             
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 576));
        getContentPane().setLayout(null);

        BotonRegresar.setIcon(new ImageIcon(getClass().getResource("/Img/BotonRegresar8Bi.png")));
        BotonRegresar.setBorder(null);
        BotonRegresar.setBorderPainted(false);
        BotonRegresar.setContentAreaFilled(false);
        BotonRegresar.addActionListener(this);
        getContentPane().add(BotonRegresar);
        BotonRegresar.setBounds(10, 10, 45, 49);

        BotonDeshacer.setIcon(new ImageIcon(getClass().getResource("/Img/BotonDeshacer8Bi.png")));
        BotonDeshacer.setBorder(null);
        BotonDeshacer.setBorderPainted(false);
        BotonDeshacer.setContentAreaFilled(false);
        BotonDeshacer.addActionListener(this);
        getContentPane().add(BotonDeshacer);
        BotonDeshacer.setBounds(80, 470, 45, 49);

        BotonAtaqueEspecial.setIcon(new ImageIcon(getClass().getResource("/Img/BotonAtaqueEspecial8Bi.png")));
        BotonAtaqueEspecial.setBorder(null);
        BotonAtaqueEspecial.setBorderPainted(false);
        BotonAtaqueEspecial.setContentAreaFilled(false);
        BotonAtaqueEspecial.addActionListener(this);
        getContentPane().add(BotonAtaqueEspecial);
        BotonAtaqueEspecial.setBounds(540, 480, 170, 40);

        BotonRendirse.setIcon(new ImageIcon(getClass().getResource("/Img/BotonRendirse8Bi.png")));
        BotonRendirse.setBorder(null);
        BotonRendirse.setBorderPainted(false);
        BotonRendirse.setContentAreaFilled(false);
        BotonRendirse.addActionListener(this);
        getContentPane().add(BotonRendirse);
        BotonRendirse.setBounds(730, 480, 170, 40);

        BotonAtaqueCargado.setIcon(new ImageIcon(getClass().getResource("/Img/BotonAtaqueCargado8Bi.png")));
        BotonAtaqueCargado.setBorder(null);
        BotonAtaqueCargado.setBorderPainted(false);
        BotonAtaqueCargado.setContentAreaFilled(false);
        BotonAtaqueCargado.addActionListener(this);
        getContentPane().add(BotonAtaqueCargado);
        BotonAtaqueCargado.setBounds(350, 480, 170, 40);

        BotonAtaqueBasico.setIcon(new ImageIcon(getClass().getResource("/Img/BotonAtaqueSimple8Bi.png")));
        BotonAtaqueBasico.setBorder(null);
        BotonAtaqueBasico.setBorderPainted(false);
        BotonAtaqueBasico.setContentAreaFilled(false);
        BotonAtaqueBasico.addActionListener(this);
        getContentPane().add(BotonAtaqueBasico);
        BotonAtaqueBasico.setBounds(160, 480, 170, 40);

        HPHeroe.setText("HP: " + ElHeroe.HP);
        getContentPane().add(HPHeroe);
        HPHeroe.setBounds(420, 270, 110, 14);
        MPHeroe.setText("MP: " + ElHeroe.MP);
        getContentPane().add(MPHeroe);
        MPHeroe.setBounds(420, 290, 110, 14);
        AtaqueHeroe.setText("AT: " + ElHeroe.Ataque);
        getContentPane().add(AtaqueHeroe);
        AtaqueHeroe.setBounds(420, 310, 110, 14);
        DefensaHeroe.setText("DE: " + ElHeroe.Defensa);
        getContentPane().add(DefensaHeroe);
        DefensaHeroe.setBounds(420, 330, 110, 14);

        HPEnemigo.setText("HP: " + ElEnemigo.HP);
        getContentPane().add(HPEnemigo);
        HPEnemigo.setBounds(600, 60, 110, 14);
        MPEnemigo.setText("MP: " + ElEnemigo.MP);
        getContentPane().add(MPEnemigo);
        MPEnemigo.setBounds(600, 80, 110, 14);
        AtaqueEnemigo.setText("AT: " + ElEnemigo.Ataque);
        getContentPane().add(AtaqueEnemigo);
        AtaqueEnemigo.setBounds(600, 100, 110, 14);
        DefensaEnemigo.setText("DE: " + ElEnemigo.Defensa);
        getContentPane().add(DefensaEnemigo);
        DefensaEnemigo.setBounds(600, 120, 110, 14);
        RecompensaEnemigo.setText("RP: " + ElEnemigo.Recompensa);
        getContentPane().add(RecompensaEnemigo);
        RecompensaEnemigo.setBounds(600, 140, 110, 14);

        LabelStatsHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/Stats8Bi.png")));
        getContentPane().add(LabelStatsHeroe);
        LabelStatsHeroe.setBounds(390, 240, 170, 150);
        LabelStatsEnemigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Stats8Bi.png")));
        getContentPane().add(LabelStatsEnemigos);
        LabelStatsEnemigos.setBounds(570, 30, 170, 150);

        CuadroDialogo.setIcon(new ImageIcon(getClass().getResource("/Img/CuadroDialogoCombate8Bi.png")));
        getContentPane().add(CuadroDialogo);
        CuadroDialogo.setBounds(40, 410, 948, 151);
        
        //Definir Imagen del Heroe
        if(ElHeroe.Espada == true && ElHeroe.Escudo == false){
            LabelHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/HeroeEspada8Bi.png")));
        }else if(ElHeroe.Espada == false && ElHeroe.Escudo == true){
            LabelHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/HeroeEscudo8Bi.png")));
        }
        else if(ElHeroe.Espada == true && ElHeroe.Escudo == true){
            LabelHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/HeroeEspadaEscudo8Bi.png")));
        }
        else{
            LabelHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/HeroeBase8Bi.png")));
        }
        getContentPane().add(LabelHeroe);
        LabelHeroe.setBounds(70, 160, 280, 300);
        
        //Definir Imagen del Enemigo
        if("Goblin".equals(ElEnemigo.Nombre)){
            if(ElEnemigo.Daga == true && ElEnemigo.Armadura == false){
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GoblinDaga8Bi.png")));
            }else if(ElEnemigo.Daga == false && ElEnemigo.Armadura == true){
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GoblinArmadura8Bi.png")));
            }else if(ElEnemigo.Daga == true && ElEnemigo.Armadura == true){
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GoblinDagaArmadura8Bi.png")));
            }else{
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GoblinBase8Bi.png")));
            }
            
            if(ElEnemigo.Jefe == true){
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GoblinJefe8Bi.png")));
            }
        }else if("DemonioCB".equals(ElEnemigo.Nombre)){
            if(ElEnemigo.Daga == true && ElEnemigo.Armadura == false){
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DemonioDaga8Bi.png")));
            }else if(ElEnemigo.Daga == false && ElEnemigo.Armadura == true){
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DemonioArmadura8Bi.png")));
            }else if(ElEnemigo.Daga == true && ElEnemigo.Armadura == true){
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DemonioDagaArmadura8Bi.png")));
            }else{
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DemonioClaseBaja8Bi.png")));
            }
            
            if(ElEnemigo.Jefe == true){
                LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DemonioMilenario8Bi.png")));
            }
        }
        getContentPane().add(LabelEnemigo);
        LabelEnemigo.setBounds(700, 20, 300, 300);
        
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoBatalla8Bi.png")));
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 1030, 580);
    }
    
    public void Ronda(IEstrategia TipoAtaque){
        boolean FinalBatalla = Batalla.terminoOno();
        FabricaInterfaz8Bit Fabrica8Bit = new FabricaInterfaz8Bit();
            if(!FinalBatalla){
                Batalla.AtaqueHeroe(TipoAtaque);
                Batalla.AtaqueEnemigo();
                Refrescar();
                FinalBatalla = Batalla.terminoOno();
                if(FinalBatalla && ElHeroe.Estado){
                    JOptionPane.showMessageDialog(null, "Ganaste!");
                    this.dispose();
                    Fabrica8Bit.FabricarVMenu();
                    ElHeroe.Dinero += ElEnemigo.Recompensa;
                }  
                else if(FinalBatalla && ElEnemigo.Estado){
                    JOptionPane.showMessageDialog(null, "Perdiste!");
                    this.dispose();
                    Fabrica8Bit.FabricarVMenu();
                }   
            }
    }
    
    public void Refrescar(){
        getContentPane().add(BotonRegresar);
        getContentPane().add(BotonDeshacer);
        getContentPane().add(BotonAtaqueEspecial);
        getContentPane().add(BotonRendirse);
        getContentPane().add(BotonAtaqueCargado);
        getContentPane().add(BotonAtaqueBasico);
        
        HPHeroe.setText("HP: " + ElHeroe.HP);
        getContentPane().add(HPHeroe);
        MPHeroe.setText("MP: " + ElHeroe.MP);
        getContentPane().add(MPHeroe);
        AtaqueHeroe.setText("AT: " + ElHeroe.Ataque);
        getContentPane().add(AtaqueHeroe);
        DefensaHeroe.setText("DE: " + ElHeroe.Defensa);
        getContentPane().add(DefensaHeroe);
        
        HPEnemigo.setText("HP: " + ElEnemigo.HP);
        getContentPane().add(HPEnemigo);
        MPEnemigo.setText("MP: " + ElEnemigo.MP);
        getContentPane().add(MPEnemigo);
        AtaqueEnemigo.setText("AT: " + ElEnemigo.Ataque);
        getContentPane().add(AtaqueEnemigo);
        DefensaEnemigo.setText("DE: " + ElEnemigo.Defensa);
        getContentPane().add(DefensaEnemigo);
        RecompensaEnemigo.setText("RP: " + ElEnemigo.Recompensa);
        getContentPane().add(RecompensaEnemigo);
        
        getContentPane().add(LabelStatsHeroe);
        getContentPane().add(LabelStatsEnemigos);
        getContentPane().add(CuadroDialogo);
        getContentPane().add(LabelHeroe);
        getContentPane().add(LabelEnemigo);
        getContentPane().add(Fondo);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        FabricaInterfaz8Bit Fabrica8Bit = new FabricaInterfaz8Bit();
        if(e.getSource() == BotonRegresar){
            this.dispose();
            Fabrica8Bit.FabricarVMenu();
        }else if(e.getSource() == BotonDeshacer){
        
        }
        else if(e.getSource() == BotonAtaqueBasico){
            Ronda(AtaqueSimple);
        }
        else if(e.getSource() == BotonAtaqueCargado){
            Ronda(AtaqueCargado);
        }
        else if(e.getSource() == BotonAtaqueEspecial){
            Ronda(AtaqueMagico);
        }
        else if(e.getSource() == BotonRendirse){
            JOptionPane.showMessageDialog(null, "Te has rendido.");
            this.dispose();
            Fabrica8Bit.FabricarVMenu();
        }  
    }
}
