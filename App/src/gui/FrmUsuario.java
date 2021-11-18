/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author lolyc
 */
public class FrmUsuario extends javax.swing.JFrame {
     public class Imagen extends javax.swing.JPanel {
    public String ruta;
        public Imagen(String ruta,int width,int height) {
            this.ruta=ruta;
            this.setSize(400, 500); //se selecciona el tamaño del panel
        }
        public void paint(Graphics grafico) {
            //Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/cuenta.png"));
            grafico.drawImage(Img.getImage(), 0, 0, 50, 50, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }
    
    public class RoundedBorder implements Border {
        private int radius;
        RoundedBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }
    /**
     * Creates new form FrmUsuario
     */
    public FrmUsuario() {
        initComponents();
        ImageIcon icinicio=new ImageIcon(getClass().getResource("/Imagenes/home.png"));
        Icon iconoinicio=new ImageIcon(icinicio.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        btnInicio.setIcon(iconoinicio);
        btnInicio.setBorder(new FrmUsuario.RoundedBorder(5)); 
        ImageIcon icba=new ImageIcon(getClass().getResource("/Imagenes/balbum.png"));
        Icon iconoba=new ImageIcon(icba.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        btnBAlbum.setIcon(iconoba);
        btnBAlbum.setBorder(new FrmUsuario.RoundedBorder(5)); 
        ImageIcon icbc=new ImageIcon(getClass().getResource("/Imagenes/bcancion.png"));
        Icon iconobc=new ImageIcon(icbc.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        btnBCancion.setIcon(iconobc);
        btnBCancion.setBorder(new FrmUsuario.RoundedBorder(5)); 
        ImageIcon icbar=new ImageIcon(getClass().getResource("/Imagenes/bartista.png"));
        Icon iconobar=new ImageIcon(icbar.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        btnBArtista.setIcon(iconobar);
        btnBArtista.setBorder(new FrmUsuario.RoundedBorder(5)); 
        ImageIcon icg=new ImageIcon(getClass().getResource("/Imagenes/bgenero.png"));
        Icon iconog=new ImageIcon(icg.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        btnBGenero.setIcon(iconog);
        btnBGenero.setBorder(new FrmUsuario.RoundedBorder(5)); 
        ImageIcon icbi=new ImageIcon(getClass().getResource("/Imagenes/biblioteca.png"));
        Icon iconobi=new ImageIcon(icbi.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        btnBiblioteca.setIcon(iconobi);
        btnBiblioteca.setBorder(new FrmUsuario.RoundedBorder(5)); 
        FrmUsuario.Imagen Imagen = new FrmUsuario.Imagen("src/Imagenes/cuenta.png",250,250);
        lblUsuario.add(Imagen, BorderLayout.CENTER);
        lblUsuario.repaint();
        btnCuenta.setText("User Name");
        btnCuenta.setBorder(new FrmUsuario.RoundedBorder(5));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        btnCuenta = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnInicio = new javax.swing.JButton();
        btnBAlbum = new javax.swing.JButton();
        btnBCancion = new javax.swing.JButton();
        btnBArtista = new javax.swing.JButton();
        btnBGenero = new javax.swing.JButton();
        btnBiblioteca = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WUSIC");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator1.setBackground(new java.awt.Color(221, 198, 164));
        jSeparator1.setForeground(new java.awt.Color(221, 198, 164));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));

        btnCuenta.setBackground(new java.awt.Color(0, 0, 0));
        btnCuenta.setForeground(java.awt.Color.white);
        btnCuenta.setText("Cuenta");
        btnCuenta.setBorder(null);
        btnCuenta.setBorderPainted(false);
        btnCuenta.setFocusable(false);
        btnCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jToolBar1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(null);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        btnInicio.setBackground(new java.awt.Color(0, 0, 0));
        btnInicio.setForeground(new java.awt.Color(240, 240, 240));
        btnInicio.setText("Inicio");
        btnInicio.setBorderPainted(false);
        btnInicio.setFocusable(false);
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnInicio);

        btnBAlbum.setBackground(new java.awt.Color(0, 0, 0));
        btnBAlbum.setForeground(new java.awt.Color(240, 240, 240));
        btnBAlbum.setText("Buscar Album");
        btnBAlbum.setBorderPainted(false);
        btnBAlbum.setFocusable(false);
        btnBAlbum.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBAlbum.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnBAlbum);

        btnBCancion.setBackground(new java.awt.Color(0, 0, 0));
        btnBCancion.setForeground(new java.awt.Color(240, 240, 240));
        btnBCancion.setText("Buscar Cancion");
        btnBCancion.setBorderPainted(false);
        btnBCancion.setFocusable(false);
        btnBCancion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBCancion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnBCancion);

        btnBArtista.setBackground(new java.awt.Color(0, 0, 0));
        btnBArtista.setForeground(new java.awt.Color(240, 240, 240));
        btnBArtista.setText("Buscar Artista");
        btnBArtista.setBorderPainted(false);
        btnBArtista.setFocusable(false);
        btnBArtista.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBArtista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnBArtista);

        btnBGenero.setBackground(new java.awt.Color(0, 0, 0));
        btnBGenero.setForeground(new java.awt.Color(240, 240, 240));
        btnBGenero.setText("Buscar Genero");
        btnBGenero.setBorderPainted(false);
        btnBGenero.setFocusable(false);
        btnBGenero.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBGenero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnBGenero);

        btnBiblioteca.setBackground(new java.awt.Color(0, 0, 0));
        btnBiblioteca.setForeground(new java.awt.Color(240, 240, 240));
        btnBiblioteca.setText("Biblioteca");
        btnBiblioteca.setBorderPainted(false);
        btnBiblioteca.setFocusable(false);
        btnBiblioteca.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBiblioteca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnBiblioteca);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jSeparator2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(445, 445, 445))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBAlbum;
    private javax.swing.JButton btnBArtista;
    private javax.swing.JButton btnBCancion;
    private javax.swing.JButton btnBGenero;
    private javax.swing.JButton btnBiblioteca;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}