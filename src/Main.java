
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.lang.Integer;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Danna Casco
 */
public class Main extends javax.swing.JFrame {

    private ArrayList<Personajes> dc = new ArrayList();
    ArrayList<Personajes> Marvel = new ArrayList();
    ArrayList<Personajes> capcom = new ArrayList();
    ArrayList<Personajes> MG = new ArrayList();

    public Main() {

        initComponents();
        DefaultComboBoxModel modelo
                = (DefaultComboBoxModel) cb_universe.getModel();
        modelo.removeElementAt(0);
        modelo.removeElementAt(0);
        modelo.removeElementAt(0);
        modelo.removeElementAt(0);
        modelo.addElement("DC");
        modelo.addElement("Marvel");
        modelo.addElement("Capcom");
        modelo.addElement("MG");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        JP_agregar = new javax.swing.JPanel();
        CrearTxt = new java.awt.Label();
        name = new java.awt.TextField();
        power = new java.awt.TextField();
        cb_universe = new javax.swing.JComboBox<>();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        addBot = new javax.swing.JButton();
        fuerza = new javax.swing.JSpinner();
        debilidad = new javax.swing.JSpinner();
        agilidadf = new javax.swing.JSpinner();
        vida = new javax.swing.JSpinner();
        agilidadm = new javax.swing.JSpinner();
        JP_listar = new javax.swing.JPanel();
        listarTxt = new javax.swing.JLabel();
        JT_universos = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        JP_simulación = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JP_agregar.setBackground(new java.awt.Color(0, 51, 51));

        CrearTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        CrearTxt.setForeground(new java.awt.Color(255, 255, 255));
        CrearTxt.setText("Creación de Personaje");

        name.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N

        power.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N

        cb_universe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        label2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Nombre :");

        label4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Universo:");

        label5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Poder:\n");

        label6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Fuerza :");

        label7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Debilidad:");

        label8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Agilidad Mental:");

        label9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Agilidad:");

        label10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("Vida:");

        addBot.setText("Agregar");
        addBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBotMouseClicked(evt);
            }
        });

        fuerza.setValue(20);

        debilidad.setValue(20);

        agilidadf.setValue(20);

        vida.setValue(20);

        agilidadm.setValue(20);

        javax.swing.GroupLayout JP_agregarLayout = new javax.swing.GroupLayout(JP_agregar);
        JP_agregar.setLayout(JP_agregarLayout);
        JP_agregarLayout.setHorizontalGroup(
            JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_agregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_agregarLayout.createSequentialGroup()
                        .addComponent(addBot)
                        .addGap(340, 340, 340))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_agregarLayout.createSequentialGroup()
                        .addComponent(CrearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_agregarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(power, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_universe, javax.swing.GroupLayout.Alignment.LEADING, 0, 380, Short.MAX_VALUE))
                    .addGroup(JP_agregarLayout.createSequentialGroup()
                        .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(debilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agilidadf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agilidadm, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(JP_agregarLayout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JP_agregarLayout.setVerticalGroup(
            JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_agregarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JP_agregarLayout.createSequentialGroup()
                        .addComponent(CrearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_universe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agilidadf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(debilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agilidadm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(JP_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(addBot)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Agregar", JP_agregar);

        JP_listar.setBackground(new java.awt.Color(0, 51, 51));

        listarTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        listarTxt.setForeground(new java.awt.Color(255, 255, 255));
        listarTxt.setText("LISTAR");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("ROOT");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("DC");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("MARVEL");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("CAPCOM");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("MG");
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JT_universos.setViewportView(jTree1);

        jScrollPane4.setViewportView(jList2);

        javax.swing.GroupLayout JP_listarLayout = new javax.swing.GroupLayout(JP_listar);
        JP_listar.setLayout(JP_listarLayout);
        JP_listarLayout.setHorizontalGroup(
            JP_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_listarLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(JT_universos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(JP_listarLayout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(listarTxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP_listarLayout.setVerticalGroup(
            JP_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_listarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(listarTxt)
                .addGap(28, 28, 28)
                .addComponent(JT_universos, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_listarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar", JP_listar);

        JP_simulación.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout JP_simulaciónLayout = new javax.swing.GroupLayout(JP_simulación);
        JP_simulación.setLayout(JP_simulaciónLayout);
        JP_simulaciónLayout.setHorizontalGroup(
            JP_simulaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        JP_simulaciónLayout.setVerticalGroup(
            JP_simulaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Simulación", JP_simulación);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBotMouseClicked

        String s = (String) cb_universe.getSelectedItem();

        if (s.equals("CD")) {

            dc.add(new Personajes(name.getText(),
                    (String) power.getText(),
                    (String) cb_universe.getSelectedItem(),
                    (Integer) debilidad.getValue(),
                    (Integer) fuerza.getValue(),
                    (Integer) agilidadf.getValue(),
                    (Integer) agilidadm.getValue(),
                    (Integer) vida.getValue()));

            DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("DC");
            for (Personajes o : dc) {
                DefaultMutableTreeNode nom = new DefaultMutableTreeNode(dc.get(0).getNombre());
                nom.add(nom);
            }
            DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) jTree1.getModel().getRoot();
            rootNode.add(n1);
            ((DefaultTreeModel) jTree1.getModel()).reload(rootNode);
        }

    

    else if (s.equals ( 
        "Marvel")) {
            Marvel.add(new Personajes(name.getText(),
                (String) power.getText(),
                (String) cb_universe.getSelectedItem(),
                (Integer) debilidad.getValue(),
                (Integer) fuerza.getValue(),
                (Integer) agilidadf.getValue(),
                (Integer) agilidadm.getValue(),
                (Integer) vida.getValue()));

        fuerza.setValue(0);

        DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("Marvel");

    }

    else if (s.equals ( 
        "Capcom")) {
            capcom.add(new Personajes(name.getText(),
                (String) power.getText(),
                (String) cb_universe.getSelectedItem(),
                (Integer) debilidad.getValue(),
                (Integer) fuerza.getValue(),
                (Integer) agilidadf.getValue(),
                (Integer) agilidadm.getValue(),
                (Integer) vida.getValue()));

        fuerza.setValue(0);
        DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("Capcom");

    }

    
        else {
            MG.add(new Personajes(name.getText(),
                (String) power.getText(),
                (String) cb_universe.getSelectedItem(),
                (Integer) debilidad.getValue(),
                (Integer) fuerza.getValue(),
                (Integer) agilidadf.getValue(),
                (Integer) agilidadm.getValue(),
                (Integer) vida.getValue()));

        fuerza.setValue(0);
        DefaultMutableTreeNode n4 = new DefaultMutableTreeNode("MG");
    }


     }//GEN-LAST:event_addBotMouseClicked

public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label CrearTxt;
    private javax.swing.JPanel JP_agregar;
    private javax.swing.JPanel JP_listar;
    private javax.swing.JPanel JP_simulación;
    private javax.swing.JScrollPane JT_universos;
    private javax.swing.JButton addBot;
    private javax.swing.JSpinner agilidadf;
    private javax.swing.JSpinner agilidadm;
    private javax.swing.JComboBox<String> cb_universe;
    private javax.swing.JSpinner debilidad;
    private javax.swing.JSpinner fuerza;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTree jTree1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JLabel listarTxt;
    private java.awt.TextField name;
    private java.awt.TextField power;
    private javax.swing.JSpinner vida;
    // End of variables declaration//GEN-END:variables

}
