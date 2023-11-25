/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

/**
 *
 * @author David Membreño
 */
import Controlador.ControlProveedores;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import paneles.pnlAgregarProveedor;
import principal.Principal;
public class pnlProveedores extends javax.swing.JPanel {

    /**
     * Creates new form pnlClientes
     */
    ControlProveedores cp = new ControlProveedores();
    Principal p = new Principal();
    public pnlProveedores() throws SQLException {
        initComponents();
        cp.LlenarTablaProveedores(tableProveedores);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new RoundedPanel(20, Color.WHITE);
        myButton3 = new metodos.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myButton3.setForeground(new java.awt.Color(255, 255, 255));
        myButton3.setText("Añadir proveedor");
        myButton3.setBorderColor(new java.awt.Color(19, 102, 217));
        myButton3.setColor(new java.awt.Color(19, 102, 217));
        myButton3.setColorClick(new java.awt.Color(19, 102, 217));
        myButton3.setColorOver(new java.awt.Color(66, 139, 225));
        myButton3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        myButton3.setRadius(10);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(myButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 147, 41));

        tableProveedores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ClienteID", "Nombre del Cliente", "DNI", "Email", "RTN"
            }
        ));
        tableProveedores.setEnabled(false);
        jScrollPane1.setViewportView(tableProveedores);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 92, 1180, 580));

        jLabel21.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel21.setText("Proveedores");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        openFormPanel(572, 480, "Ingresar nuevo proveedor");
    }//GEN-LAST:event_myButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private metodos.MyButton myButton3;
    public javax.swing.JTable tableProveedores;
    // End of variables declaration//GEN-END:variables

    private void openFormPanel(int width, int height, String title) {
        pnlAgregarProveedor proveedores = new pnlAgregarProveedor();
        // Lógica para abrir el panel tipo formulario aquí
        // Puedes crear un nuevo marco (JFrame) o un diálogo modal (JDialog) para mostrar el formulario.
        // Aquí solo crearé un JFrame simple como ejemplo:

        JFrame formFrame = new JFrame(title);
        formFrame.setSize(width, height);
        formFrame.setLocationRelativeTo(p); // Centra el formulario con respecto al marco principal

        JPanel formPanel = new JPanel();
        // Agrega aquí los elementos del formulario que desees

        formFrame.add(proveedores.pnlProveedores);
        formFrame.setVisible(true);
    }
    
class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }

    }
}