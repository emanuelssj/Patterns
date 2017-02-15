/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.gui;

import blok.simulator.AdapterJBox2D;
import java.awt.Dimension;

/**
 *
 * @author sandroandrade
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        Dimension size = new Dimension(1000, 600);

        MainPanel mainPanel = new MainPanel();
        mainPanel.setPreferredSize(size);
        mainPanel.setMinimumSize(size);
        mainPanel.setMaximumSize(size);
        mainPanel.setSize(size);
        setContentPane(mainPanel);

        setResizable(false);
        pack();
        
        AdapterJBox2D simulator = new AdapterJBox2D(mainPanel);
        mainPanel.setSimulator(simulator);
        simulator.init();
        //simulator.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
