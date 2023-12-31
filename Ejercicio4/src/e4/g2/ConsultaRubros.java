
package e4.g2;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class ConsultaRubros extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();
    
    public boolean isCellEditable(int f, int c){
        
        return false;
    }
    public ConsultaRubros() {
        initComponents();
        crearCabecera();
        cargarBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcSelecRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaRubro = new javax.swing.JTable();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de Productos por Rubro");

        jLabel2.setText("Elija rubro:");

        jcSelecRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSelecRubroActionPerformed(evt);
            }
        });

        jtTablaRubro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaRubro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jcSelecRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcSelecRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcSelecRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSelecRubroActionPerformed
        
        //borrarFilas();
        modelo.setRowCount(0);
        for(Producto produ:Menu.listaProducto){

                if(produ.getRubro().equals(jcSelecRubro.getSelectedItem()))

                    modelo.addRow(new Object[]{
                        produ.getDescripcion(),
                        produ.getCodigo(),
                        produ.getStock(),
                        produ.getPrecio(),
                        produ.getRubro()
                    });
                    
        }
          
    }//GEN-LAST:event_jcSelecRubroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Categoria> jcSelecRubro;
    private javax.swing.JTable jtTablaRubro;
    // End of variables declaration//GEN-END:variables
    
    
    private void crearCabecera(){
            modelo.addColumn("DESCRIPCION");
            modelo.addColumn("CODIGO");
            modelo.addColumn("STOCK");
            modelo.addColumn("PRECIO");
            modelo.addColumn("RUBRO");
            jtTablaRubro.setModel(modelo);

    }
    private void cargarBox(){
        
        jcSelecRubro.setModel(new DefaultComboBoxModel<>(Categoria.values()));
        jcSelecRubro.setSelectedIndex(-1);
    }
    /* private void borrarFilas(){
    
        int fila = jtTablaRubro.getRowCount()-1;
        for(int f=fila;f>=0;f--){
            
            modelo.removeRow(f);
        }


    }*/
    
 
}
