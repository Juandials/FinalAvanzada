/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author INTEL
 */
public class AApruebacombate extends javax.swing.JFrame {

    /**
     * Creates new form AApruebacombate
     */
    public AApruebacombate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonRegresar = new javax.swing.JButton();
        BotonDeshacer = new javax.swing.JButton();
        BotonAtaqueEspecial = new javax.swing.JButton();
        BotonRendirse = new javax.swing.JButton();
        BotonAtaqueCargado = new javax.swing.JButton();
        BotonAtaqueBasico = new javax.swing.JButton();
        HPHeroe = new javax.swing.JLabel();
        MPHeroe = new javax.swing.JLabel();
        AtaqueHeroe = new javax.swing.JLabel();
        DefensaHeroe = new javax.swing.JLabel();
        HPEnemigo = new javax.swing.JLabel();
        MPEnemigo = new javax.swing.JLabel();
        AtaqueEnemigo = new javax.swing.JLabel();
        DefensaEnemigo = new javax.swing.JLabel();
        RecompensaEnemigo = new javax.swing.JLabel();
        LabelStatsHeroe = new javax.swing.JLabel();
        LabelStatsEnemigos = new javax.swing.JLabel();
        CuadroDialogoAni = new javax.swing.JLabel();
        LabelHeroe = new javax.swing.JLabel();
        LabelEnemigo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 576));
        getContentPane().setLayout(null);

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonRegresarAni.png"))); // NOI18N
        BotonRegresar.setBorder(null);
        BotonRegresar.setBorderPainted(false);
        BotonRegresar.setContentAreaFilled(false);
        getContentPane().add(BotonRegresar);
        BotonRegresar.setBounds(10, 10, 45, 49);

        BotonDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonDeshacer.png"))); // NOI18N
        BotonDeshacer.setBorder(null);
        BotonDeshacer.setBorderPainted(false);
        BotonDeshacer.setContentAreaFilled(false);
        getContentPane().add(BotonDeshacer);
        BotonDeshacer.setBounds(80, 470, 45, 49);

        BotonAtaqueEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonAtaqueEspecialAni.png"))); // NOI18N
        BotonAtaqueEspecial.setBorder(null);
        BotonAtaqueEspecial.setBorderPainted(false);
        BotonAtaqueEspecial.setContentAreaFilled(false);
        getContentPane().add(BotonAtaqueEspecial);
        BotonAtaqueEspecial.setBounds(540, 480, 170, 40);

        BotonRendirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonRendirseAni.png"))); // NOI18N
        BotonRendirse.setBorder(null);
        BotonRendirse.setBorderPainted(false);
        BotonRendirse.setContentAreaFilled(false);
        BotonRendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRendirseActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRendirse);
        BotonRendirse.setBounds(730, 480, 170, 40);

        BotonAtaqueCargado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonAtaqueCargadoAni.png"))); // NOI18N
        BotonAtaqueCargado.setBorder(null);
        BotonAtaqueCargado.setBorderPainted(false);
        BotonAtaqueCargado.setContentAreaFilled(false);
        getContentPane().add(BotonAtaqueCargado);
        BotonAtaqueCargado.setBounds(350, 480, 170, 40);

        BotonAtaqueBasico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonAtaqueSimpleAni.png"))); // NOI18N
        BotonAtaqueBasico.setBorder(null);
        BotonAtaqueBasico.setBorderPainted(false);
        BotonAtaqueBasico.setContentAreaFilled(false);
        getContentPane().add(BotonAtaqueBasico);
        BotonAtaqueBasico.setBounds(160, 480, 170, 40);

        HPHeroe.setText("HP:");
        getContentPane().add(HPHeroe);
        HPHeroe.setBounds(420, 270, 110, 14);

        MPHeroe.setText("MP: ");
        getContentPane().add(MPHeroe);
        MPHeroe.setBounds(420, 290, 110, 14);

        AtaqueHeroe.setText("AT:");
        getContentPane().add(AtaqueHeroe);
        AtaqueHeroe.setBounds(420, 310, 110, 14);

        DefensaHeroe.setText("DE:");
        getContentPane().add(DefensaHeroe);
        DefensaHeroe.setBounds(420, 330, 110, 14);

        HPEnemigo.setText("HP:");
        getContentPane().add(HPEnemigo);
        HPEnemigo.setBounds(600, 60, 110, 14);

        MPEnemigo.setText("MP: ");
        getContentPane().add(MPEnemigo);
        MPEnemigo.setBounds(600, 80, 110, 14);

        AtaqueEnemigo.setText("AT:");
        getContentPane().add(AtaqueEnemigo);
        AtaqueEnemigo.setBounds(600, 100, 110, 14);

        DefensaEnemigo.setText("DE:");
        getContentPane().add(DefensaEnemigo);
        DefensaEnemigo.setBounds(600, 120, 110, 14);

        RecompensaEnemigo.setText("RP:");
        getContentPane().add(RecompensaEnemigo);
        RecompensaEnemigo.setBounds(600, 140, 110, 14);

        LabelStatsHeroe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/StatsAni.png"))); // NOI18N
        getContentPane().add(LabelStatsHeroe);
        LabelStatsHeroe.setBounds(390, 240, 170, 150);

        LabelStatsEnemigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/StatsAni.png"))); // NOI18N
        getContentPane().add(LabelStatsEnemigos);
        LabelStatsEnemigos.setBounds(570, 30, 170, 150);

        CuadroDialogoAni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CuadroDialogoCombateAni.png"))); // NOI18N
        getContentPane().add(CuadroDialogoAni);
        CuadroDialogoAni.setBounds(40, 410, 948, 151);

        LabelHeroe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/HeroeEspadaEscudoAni.png"))); // NOI18N
        getContentPane().add(LabelHeroe);
        LabelHeroe.setBounds(70, 160, 280, 300);

        LabelEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DemonioDagaArmaduraAni.png"))); // NOI18N
        getContentPane().add(LabelEnemigo);
        LabelEnemigo.setBounds(700, 20, 300, 300);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoBatallaAni.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRendirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRendirseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AApruebacombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AApruebacombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AApruebacombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AApruebacombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AApruebacombate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtaqueEnemigo;
    private javax.swing.JLabel AtaqueHeroe;
    private javax.swing.JButton BotonAtaqueBasico;
    private javax.swing.JButton BotonAtaqueCargado;
    private javax.swing.JButton BotonAtaqueEspecial;
    private javax.swing.JButton BotonDeshacer;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton BotonRendirse;
    private javax.swing.JLabel CuadroDialogoAni;
    private javax.swing.JLabel DefensaEnemigo;
    private javax.swing.JLabel DefensaHeroe;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel HPEnemigo;
    private javax.swing.JLabel HPHeroe;
    private javax.swing.JLabel LabelEnemigo;
    private javax.swing.JLabel LabelHeroe;
    private javax.swing.JLabel LabelStatsEnemigos;
    private javax.swing.JLabel LabelStatsHeroe;
    private javax.swing.JLabel MPEnemigo;
    private javax.swing.JLabel MPHeroe;
    private javax.swing.JLabel RecompensaEnemigo;
    // End of variables declaration//GEN-END:variables
}
