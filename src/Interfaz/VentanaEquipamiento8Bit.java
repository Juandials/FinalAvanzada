
package Interfaz;

import Enemigos.*;
import Heroe.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaEquipamiento8Bit extends JFrame implements ActionListener, IVentanaEquipamiento {
    JLabel Fondo,FondoHeroe,ImagenHeroe,CuadroDialogo;
    JButton BotonRegresar,BotonEspada, BotonEscudo, BotonGoblins, BotonAleatorio,BotonJugar;
    AHeroe ElHeroe = new HProtagonista();
    EnemigoConcreto ElEnemigo;
    
    @Override
    public void InicializarVentana() {
        Fondo = new JLabel();
        FondoHeroe = new JLabel();
        CuadroDialogo = new JLabel();
        ImagenHeroe = new JLabel();
        
        BotonRegresar = new JButton();
        BotonGoblins = new JButton();
        BotonAleatorio = new JButton();
        BotonEspada = new JButton();
        BotonEscudo = new JButton();
        BotonJugar = new JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        ImagenHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/HeroeBase8Bi.png")));
        getContentPane().add(ImagenHeroe);
        ImagenHeroe.setBounds(160, 170, 300, 240);

        FondoHeroe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoBatalla8Bi.png")));
        getContentPane().add(FondoHeroe);
        FondoHeroe.setBounds(70, 170, 480, 240);

        BotonJugar.setIcon(new ImageIcon(getClass().getResource("/Img/BotonIniciar8Bi.png")));
        BotonJugar.setBorder(null);
        BotonJugar.setBorderPainted(false);
        BotonJugar.setContentAreaFilled(false);
        BotonJugar.addActionListener(this);
        BotonJugar.setBounds(690, 410, 233, 90);
        getContentPane().add(BotonJugar);
        
        BotonGoblins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonGoblins8Bi.png")));
        BotonGoblins.setBorder(null);
        BotonGoblins.setBorderPainted(false);
        BotonGoblins.setContentAreaFilled(false);
        BotonGoblins.addActionListener(this);     
        BotonGoblins.setBounds(640, 220, 320, 50);
        getContentPane().add(BotonGoblins);

        BotonAleatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonAleatorio8Bi.png")));
        BotonAleatorio.setBorder(null);
        BotonAleatorio.setBorderPainted(false);
        BotonAleatorio.setContentAreaFilled(false);
        BotonAleatorio.addActionListener(this);
        BotonAleatorio.setBounds(640, 320, 320, 50);
        getContentPane().add(BotonAleatorio);

        BotonEspada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Espada8Bi.png")));
        BotonEspada.setBorder(null);
        BotonEspada.setBorderPainted(false);
        BotonEspada.setContentAreaFilled(false);
        BotonEspada.addActionListener(this);
        BotonEspada.setBounds(390, 450, 80, 80);
        getContentPane().add(BotonEspada);
        
        BotonEscudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Escudo8Bi.png")));
        BotonEscudo.setBorder(null);
        BotonEscudo.setBorderPainted(false);
        BotonEscudo.setContentAreaFilled(false);
        BotonEscudo.addActionListener(this);
        BotonEscudo.setBounds(210, 450, 80, 80);
        getContentPane().add(BotonEscudo);
        

        CuadroDialogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CuadroDialogoEquipamiento8Bi.png")));
        getContentPane().add(CuadroDialogo);
        CuadroDialogo.setBounds(20, 60, 980, 490);

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonRegresar8Bi.png")));
        BotonRegresar.setBorder(null);
        BotonRegresar.setBorderPainted(false);
        BotonRegresar.setContentAreaFilled(false);
        BotonRegresar.addActionListener(this);
        getContentPane().add(BotonRegresar);
        BotonRegresar.setBounds(20, 20, 45, 49);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoMenu8Bi.png")));
        Fondo.setBounds(0, 0, 1024, 576); 
        getContentPane().add(Fondo);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == BotonJugar){
            if(ElEnemigo == null){
                ElEnemigo = new EGoblinSolitario();  
            }
            System.out.print("Inicia!");
            this.dispose();
            FabricaInterfaz8Bit Fabrica8Bit = new FabricaInterfaz8Bit();
            VentanaCombate8Bit VentanaCombate = (VentanaCombate8Bit) Fabrica8Bit.FabricarVCombate(ElEnemigo, ElHeroe);
            
        }else if(e.getSource() == BotonEspada && ElHeroe.Espada == false){
            DEspada prov = new DEspada(ElHeroe);
            ElHeroe = prov.RegresarHeroeDecorado();
            ElHeroe.Atacar();
            
            if (ElHeroe.Espada == true && ElHeroe.Escudo == true){
                ImagenHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/HeroeEspadaEscudo8Bi.png")));
                getContentPane().add(ImagenHeroe);
                ImagenHeroe.setBounds(160, 170, 300, 240);
                getContentPane().add(FondoHeroe);
                getContentPane().add(BotonGoblins);
                getContentPane().add(BotonAleatorio);
                getContentPane().add(BotonEscudo);
                getContentPane().add(BotonEspada);
                getContentPane().add(CuadroDialogo);
                getContentPane().add(BotonRegresar);
                getContentPane().add(Fondo);
            }else{
                ImagenHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/HeroeEspada8Bi.png")));
                getContentPane().add(ImagenHeroe);
                ImagenHeroe.setBounds(160, 170, 300, 240);
                getContentPane().add(FondoHeroe);
                getContentPane().add(BotonGoblins);
                getContentPane().add(BotonAleatorio);
                getContentPane().add(BotonEscudo);
                getContentPane().add(BotonEspada);
                getContentPane().add(CuadroDialogo);
                getContentPane().add(BotonRegresar);
                getContentPane().add(Fondo);
            }
            
        }else if(e.getSource() == BotonEscudo && ElHeroe.Escudo == false){
            DEscudo prov = new DEscudo(ElHeroe);
            ElHeroe = prov.RegresarHeroeDecorado();
            ElHeroe.Atacar();
            
            if (ElHeroe.Espada == true && ElHeroe.Escudo == true){
                ImagenHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/HeroeEspadaEscudo8Bi.png")));
                getContentPane().add(ImagenHeroe);
                ImagenHeroe.setBounds(160, 170, 300, 240);
                getContentPane().add(FondoHeroe);
                getContentPane().add(BotonGoblins);
                getContentPane().add(BotonAleatorio);
                getContentPane().add(BotonEscudo);
                getContentPane().add(BotonEspada);
                getContentPane().add(CuadroDialogo);
                getContentPane().add(BotonRegresar);
                getContentPane().add(Fondo);
            }else{
                ImagenHeroe.setIcon(new ImageIcon(getClass().getResource("/Img/HeroeEscudo8Bi.png")));
                getContentPane().add(ImagenHeroe);
                ImagenHeroe.setBounds(160, 170, 300, 240);
                getContentPane().add(FondoHeroe);
                getContentPane().add(BotonGoblins);
                getContentPane().add(BotonAleatorio);
                getContentPane().add(BotonEscudo);
                getContentPane().add(BotonEspada);
                getContentPane().add(CuadroDialogo);
                getContentPane().add(BotonRegresar);
                getContentPane().add(Fondo);
            }
        }else if(e.getSource() == BotonGoblins){
            FabricaGoblinsSolos FabricaGoblins = new FabricaGoblinsSolos();
            ElEnemigo = (EnemigoConcreto) FabricaGoblins.FabricarEnemigos();
        }else if(e.getSource() == BotonAleatorio){
            FabricaAleatoria FabricaAleatoria = new FabricaAleatoria();
            ElEnemigo = (EnemigoConcreto) FabricaAleatoria.FabricarEnemigos();
        }else if(e.getSource() == BotonRegresar){
            this.dispose();
            FabricaInterfaz8Bit Fabrica8Bit = new FabricaInterfaz8Bit();
            VentanaMenu8Bit Menu8Bit = (VentanaMenu8Bit) Fabrica8Bit.FabricarVMenu();
        }  
    }
}
