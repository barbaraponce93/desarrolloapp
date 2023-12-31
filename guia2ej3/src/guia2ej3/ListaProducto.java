/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ej3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pc
 */
public class ListaProducto extends javax.swing.JFrame {
        private DefaultTableModel modelo=new DefaultTableModel();
        
    /**
     * Creates new form ListaProducto
     */
    public ListaProducto() {
        initComponents();
        mostrarCategoria();
        cabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jccategoria = new javax.swing.JComboBox<>();
        jbAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jccategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jccategoriaActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar Producto");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jLabel1.setText("Nombre");

        jLabel3.setText("Precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64)
                        .addComponent(jtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
                    .addComponent(jccategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(jtNombre)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jccategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbAgregar)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jccategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jccategoriaActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_jccategoriaActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        borrarFilas();
        try {
             if (jtNombre.getText().isEmpty() ||jtPrecio.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            
            String nombre=jtNombre.getText();
             Double precio=Double.parseDouble(jtPrecio.getText());
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el precio en numeros");
        }
       

        agregarProducto();
        jtNombre.setText("");
          jtPrecio.setText("");
    }//GEN-LAST:event_jbAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JComboBox<Producto> jccategoria;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
       private void mostrarCategoria(){
           jccategoria.addItem(new Electronica());
            jccategoria.addItem(new Ropa());
             jccategoria.addItem(new Comestibles());
             
             
       }
       private void cabecera(){
           modelo.addColumn("Categoria");
           modelo.addColumn("Nombre");
           modelo.addColumn("Precio");
           jtTabla.setModel(modelo);
       }
       private void borrarFilas(){
           int filas=jtTabla.getRowCount()-1;
           for(int f=filas;f>=0;f--){
               modelo.removeRow(f);
               
           }
       }
               
       
       private void agregarProducto(){
           switch(jccategoria.getSelectedItem().toString()){
               case "Electronica": { Electronica elec1=new Electronica(jtNombre.getText(), Double.parseDouble(jtPrecio.getText()));
                       modelo.addRow(new Object[]{jccategoria.getSelectedItem().toString(),elec1.getNombre(),elec1.getPrecio()}); 
                       }
               break;
               case "Ropa":{Ropa ropita=new Ropa(jtNombre.getText(), Double.parseDouble(jtPrecio.getText()));
               modelo.addRow(new Object[]{jccategoria.getSelectedItem().toString(),ropita.getNombre(),ropita.getPrecio()}); 
               }
               break;
               case "Comestibles":{Comestibles comida=new Comestibles(jtNombre.getText(), Double.parseDouble(jtPrecio.getText()));
               modelo.addRow(new Object[]{jccategoria.getSelectedItem().toString(),comida.getNombre(),comida.getPrecio()}); 
           }
               break;
  
          
           }  
       }
}
    
    




