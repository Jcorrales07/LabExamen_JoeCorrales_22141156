package labexamenjoecorrales;

import java.awt.Color;
import static java.awt.MouseInfo.getPointerInfo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame implements Runnable {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarPlanetasPublicos();
        llenarComboBoxCientifico();
        actualizarComboxBoxCientifico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Planeta = new javax.swing.JPopupMenu();
        Planeta1 = new javax.swing.JMenuItem();
        Planeta2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jpColision = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPlanetas = new javax.swing.JTree();
        txtPlaneta1 = new javax.swing.JTextField();
        txtPlaneta2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbCientificos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCientifico = new javax.swing.JTextField();
        jcheckboxPPublicos = new javax.swing.JCheckBox();
        btnAddCientifico = new javax.swing.JButton();
        btnColisionar = new javax.swing.JButton();

        Planeta1.setText("Planeta 1");
        Planeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta1ActionPerformed(evt);
            }
        });
        Planeta.add(Planeta1);

        Planeta2.setText("Planeta 2");
        Planeta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta2ActionPerformed(evt);
            }
        });
        Planeta.add(Planeta2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Planetas");
        jtPlanetas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtPlanetas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtPlanetasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPlanetasFocusLost(evt);
            }
        });
        jtPlanetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPlanetasMouseClicked(evt);
            }
        });
        jtPlanetas.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jtPlanetasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jtPlanetas);

        txtPlaneta1.setEditable(false);

        txtPlaneta2.setEditable(false);

        jLabel1.setText("Cientificos: ");

        cbCientificos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCientificosActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jcheckboxPPublicos.setText("Publicos");
        jcheckboxPPublicos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jcheckboxPPublicosStateChanged(evt);
            }
        });
        jcheckboxPPublicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckboxPPublicosActionPerformed(evt);
            }
        });

        btnAddCientifico.setText("Añadir Cientifico");
        btnAddCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCientificoActionPerformed(evt);
            }
        });

        btnColisionar.setText("Colisionar");
        btnColisionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColisionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcheckboxPPublicos)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(btnAddCientifico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPlaneta1)
                                    .addComponent(txtPlaneta2)
                                    .addComponent(cbCientificos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnColisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jpColision, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpColision, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPlaneta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPlaneta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnColisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbCientificos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnAddCientifico))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jcheckboxPPublicos)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcheckboxPPublicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckboxPPublicosActionPerformed
        // TODO add your handling code here:
        DefaultTreeModel modelo = (DefaultTreeModel) jtPlanetas.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Planetas");
        
        for (Planeta p : planetas) {
            DefaultMutableTreeNode hojaPlaneta = new DefaultMutableTreeNode(p.getNombre());
            root.add(hojaPlaneta);
        }
        modelo.setRoot(root);
    }//GEN-LAST:event_jcheckboxPPublicosActionPerformed

    private void cbCientificosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCientificosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbCientificosActionPerformed

    private void btnAddCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCientificoActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombreCientifico.getText();
        
        if(nombre != null) {
            cientificos.add(new Cientifico(nombre));
            guardarCientificos();
        } else JOptionPane.showMessageDialog(this, "Campo: Nombre Vacio!");
        
    }//GEN-LAST:event_btnAddCientificoActionPerformed

    private void jcheckboxPPublicosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jcheckboxPPublicosStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckboxPPublicosStateChanged
    
    String subPlaneta;
    private void jtPlanetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPlanetasMouseClicked
        // TODO add your handling code here:
        Planeta.setVisible(true);
        String planeta = jtPlanetas.getSelectionPath().toString();
        subPlaneta = planeta.substring(11, planeta.length()-1);
        System.out.println(subPlaneta);
    }//GEN-LAST:event_jtPlanetasMouseClicked

    private void jtPlanetasValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jtPlanetasValueChanged
        // TODO add your handling code here:
        Planeta.setLocation(getPointerInfo().getLocation());
    }//GEN-LAST:event_jtPlanetasValueChanged

    private void Planeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planeta1ActionPerformed
        // TODO add your handling code here:
        txtPlaneta1.setText(subPlaneta);
    }//GEN-LAST:event_Planeta1ActionPerformed

    private void Planeta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planeta2ActionPerformed
        // TODO add your handling code here:
        txtPlaneta2.setText(subPlaneta);
    }//GEN-LAST:event_Planeta2ActionPerformed

    private void jtPlanetasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPlanetasFocusLost
        // TODO add your handling code here:
        Planeta.setVisible(false);
    }//GEN-LAST:event_jtPlanetasFocusLost

    Thread hilo;
    double distancia;
    boolean collision = false;
    Random rd = new Random();
    
    @Override
    public void run() {
        jpColision.setForeground(Color.ORANGE);
        
        while(!collision) {
            try {
                for (int i = 0; i < (int) distancia+1; i++) {
                    jpColision.setValue(i);
                    Thread.sleep(5);
                }
                collision = true;
                int numeroRandomP = cP1.probabilidad();
                System.out.println("Numero random de planeta: "+ numeroRandomP);
//                int numeroRandom = rd.nextInt();
//                System.out.println("Numero random: "+ numeroRandom);
                if(numeroRandomP == 25 || numeroRandomP == 20) {
                    jpColision.setValue(0);
                    String nombrePlaneta = JOptionPane.showInputDialog(this, "Los planestas colisionaron!"
                                                                        + "\nNuevo planeta descubierto!"
                                                                        + "\nNombre del planeta: ");
                }
            } catch(Exception ex) {
            }
        }
        collision = false;
    }
    
    Planeta cP1;
    Planeta cP2;
    
    private void btnColisionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColisionarActionPerformed
        // TODO add your handling code here:
        hilo = new Thread(this);
        hilo.start();
        
        
        String nPlaneta1 = txtPlaneta1.getText();
        String nPlaneta2 = txtPlaneta2.getText();
        
        cP1 = buscarPlaneta(nPlaneta1);
        cP2 = buscarPlaneta(nPlaneta2);
        
        distancia = Math.sqrt(((Math.pow(cP2.getCoorX(), 2)) - (Math.pow(cP1.getCoorX(), 2))) + (Math.pow(cP2.coorY, 2))-(Math.pow(cP1.coorY, 2)) );
        System.out.println("Distancia: "+distancia);
    }//GEN-LAST:event_btnColisionarActionPerformed

    private Planeta buscarPlaneta(String planeta) {
        for(Planeta p : planetas) {
            if(p.getNombre().equals(planeta)) 
                return p;
        }
        return null;
    }
    
    
    private void jtPlanetasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPlanetasFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtPlanetasFocusGained

    private void guardarCientificos() {
        try {
            
            FileOutputStream fos = new FileOutputStream("./cientificos.jco");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(Cientifico c : cientificos) 
                oos.writeObject(c);
            
            actualizarComboxBoxCientifico();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    private void llenarComboBoxCientifico() {
        try {
            
            FileInputStream fis = new FileInputStream("./cientificos.jco");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Cientifico cientifico;
            
            while( (cientifico = (Cientifico) ois.readObject()) != null) {
                System.out.println(cientifico);
                cientificos.add(cientifico);
            }
            
        } catch (IOException | ClassNotFoundException ex) {}
    }
    
    private void actualizarComboxBoxCientifico() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbCientificos.getModel();
        modelo.removeAllElements();
        
        for(Cientifico c : cientificos)
            modelo.addElement(c);
    }
    
    
    private void llenarPlanetasPublicos() {
        planetas.add(new Terrestre(5000, 13000, "Mercurio", 400, 300));
        planetas.add(new Terrestre(100000, 15000, "Venus", 640, 260));
        planetas.add(new Terrestre(140000, 17000, "Tierra", 760, 570));
        planetas.add(new Terrestre(90000, 12000, "Marte", 360, 360));
        planetas.add(new Gaseoso(400000, 40000, "Jupiter", 340, 310));
        planetas.add(new Gaseoso(300000, 30000, "Saturno", 560, 450));
        planetas.add(new Gaseoso(200000, 20000, "Urano", 670, 690));
        planetas.add(new Gaseoso(200000, 20000, "Neptuno", 840, 900));
        //HEY BUENAS A TODOS GUAPISIMOSSSS AQUI VEGETTA 777
        planetas.add(new Terrestre(777777, 7777777, "Planeta Vegetta", 777, 777));
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Planeta;
    private javax.swing.JMenuItem Planeta1;
    private javax.swing.JMenuItem Planeta2;
    private javax.swing.JButton btnAddCientifico;
    private javax.swing.JButton btnColisionar;
    private javax.swing.JComboBox<String> cbCientificos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcheckboxPPublicos;
    private javax.swing.JProgressBar jpColision;
    private javax.swing.JTree jtPlanetas;
    private javax.swing.JTextField txtNombreCientifico;
    private javax.swing.JTextField txtPlaneta1;
    private javax.swing.JTextField txtPlaneta2;
    // End of variables declaration//GEN-END:variables
    public ArrayList<Planeta> planetas = new ArrayList<>();
    public ArrayList<Cientifico> cientificos = new ArrayList<>();

    
}
