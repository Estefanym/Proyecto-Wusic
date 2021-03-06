/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
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
public class FrmPrincipal extends javax.swing.JFrame {
    public class Imagen extends javax.swing.JPanel {
    public String ruta;
        public Imagen(String ruta,int width,int height) {
            this.ruta=ruta;
            this.setSize(400, 500); //se selecciona el tamaño del panel
        }
        public void paint(Graphics grafico) {
            //Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
            grafico.drawImage(Img.getImage(), 0, 0, 200, 200, null);
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
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
//        Imagen Imagen = new Imagen();
//        jTextArea1.add(Imagen, BorderLayout.CENTER);
//        jTextArea1.repaint();
        Imagen Imagen = new Imagen("src/Imagenes/logo.png",450,450);
        lblLogo.add(Imagen, BorderLayout.CENTER);
        lblLogo.repaint();
        //Canciones
        ImageIcon iccanciones=new ImageIcon(getClass().getResource("/Imagenes/canciones.png"));
        Icon iconocan=new ImageIcon(iccanciones.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnCanciones.setIcon(iconocan);
        //Artistas
        ImageIcon icartis=new ImageIcon(getClass().getResource("/Imagenes/artista.png"));
        Icon iconoartis=new ImageIcon(icartis.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnArtistas.setIcon(iconoartis);
        //Albums
        ImageIcon icalbums=new ImageIcon(getClass().getResource("/Imagenes/album.png"));
        Icon iconoalbums=new ImageIcon(icalbums.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnAlbumes.setIcon(iconoalbums);
        //Generos
        ImageIcon icongeneros=new ImageIcon(getClass().getResource("/Imagenes/genero.png"));
        Icon iconogeneros=new ImageIcon(icongeneros.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnGeneros.setIcon(iconogeneros);
        //Categorias
        ImageIcon iccategorias=new ImageIcon(getClass().getResource("/Imagenes/categorias.png"));
        Icon iconocat=new ImageIcon(iccategorias.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnCategorias.setIcon(iconocat);
        //Playlist
        ImageIcon icplaylist=new ImageIcon(getClass().getResource("/Imagenes/playlist.png"));
        Icon iconoplaylist=new ImageIcon(icplaylist.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnPlaylist.setIcon(iconoplaylist);
        //Usuarios
        ImageIcon icusuarios=new ImageIcon(getClass().getResource("/Imagenes/usuarios.png"));
        Icon iconousuarios=new ImageIcon(icusuarios.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnUsuarios.setIcon(iconousuarios);
        //Planes
        ImageIcon icplanes=new ImageIcon(getClass().getResource("/Imagenes/planes.png"));
        Icon iconoplanes=new ImageIcon(icplanes.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnPlanes.setIcon(iconoplanes);
        //Pagos
        ImageIcon icpagos=new ImageIcon(getClass().getResource("/Imagenes/pago.png"));
        Icon iconopagos=new ImageIcon(icpagos.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnPagos.setIcon(iconopagos);
        //SALIR
        ImageIcon icsalir=new ImageIcon(getClass().getResource("/Imagenes/exit.png"));
        Icon iconosalir=new ImageIcon(icsalir.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        btnSalir.setIcon(iconosalir);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
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
        pnlIzq = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlDer = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnCanciones = new javax.swing.JButton();
        btnArtistas = new javax.swing.JButton();
        btnAlbumes = new javax.swing.JButton();
        btnGeneros = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnPlaylist = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnPlanes = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WUSIC ADMIN");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        pnlIzq.setBackground(new java.awt.Color(0, 0, 0));
        pnlIzq.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTIÓN DE WUSIC", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poor Richard", 0, 24), new java.awt.Color(221, 198, 164))); // NOI18N
        pnlIzq.setForeground(new java.awt.Color(221, 198, 164));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuario: ADMINISTRADOR");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Integrantes:\nCid Emmanuel Esquivel Gonzalez\nEstefany Montaño Estrada\nIvan Sanchez Esquivel\nKevin Daniel Valdez Mendez\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipo 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout pnlIzqLayout = new javax.swing.GroupLayout(pnlIzq);
        pnlIzq.setLayout(pnlIzqLayout);
        pnlIzqLayout.setHorizontalGroup(
            pnlIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzqLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pnlIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzqLayout.createSequentialGroup()
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzqLayout.createSequentialGroup()
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)))))
        );
        pnlIzqLayout.setVerticalGroup(
            pnlIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzqLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlDer.setBackground(new java.awt.Color(0, 0, 0));

        jToolBar1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        btnCanciones.setBackground(new java.awt.Color(0, 0, 0));
        btnCanciones.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnCanciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCanciones.setText("Canciones");
        btnCanciones.setBorderPainted(false);
        btnCanciones.setFocusable(false);
        btnCanciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCanciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancionesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCanciones);

        btnArtistas.setBackground(new java.awt.Color(0, 0, 0));
        btnArtistas.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnArtistas.setForeground(new java.awt.Color(255, 255, 255));
        btnArtistas.setText("Artistas");
        btnArtistas.setBorderPainted(false);
        btnArtistas.setFocusable(false);
        btnArtistas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnArtistas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtistasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnArtistas);

        btnAlbumes.setBackground(new java.awt.Color(0, 0, 0));
        btnAlbumes.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAlbumes.setForeground(new java.awt.Color(255, 255, 255));
        btnAlbumes.setText("Albumes");
        btnAlbumes.setBorderPainted(false);
        btnAlbumes.setFocusable(false);
        btnAlbumes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAlbumes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlbumes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlbumesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlbumes);

        btnGeneros.setBackground(new java.awt.Color(0, 0, 0));
        btnGeneros.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnGeneros.setForeground(new java.awt.Color(255, 255, 255));
        btnGeneros.setText("Generos");
        btnGeneros.setBorderPainted(false);
        btnGeneros.setFocusable(false);
        btnGeneros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGeneros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGeneros);

        btnCategorias.setBackground(new java.awt.Color(0, 0, 0));
        btnCategorias.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnCategorias.setForeground(new java.awt.Color(255, 255, 255));
        btnCategorias.setText("Categorias");
        btnCategorias.setBorderPainted(false);
        btnCategorias.setFocusable(false);
        btnCategorias.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCategorias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCategorias);

        btnPlaylist.setBackground(new java.awt.Color(0, 0, 0));
        btnPlaylist.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaylist.setText("Playlist");
        btnPlaylist.setBorderPainted(false);
        btnPlaylist.setFocusable(false);
        btnPlaylist.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPlaylist.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaylistActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPlaylist);

        btnUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setFocusable(false);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUsuarios);

        btnPlanes.setBackground(new java.awt.Color(0, 0, 0));
        btnPlanes.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnPlanes.setForeground(new java.awt.Color(255, 255, 255));
        btnPlanes.setText("Planes");
        btnPlanes.setBorderPainted(false);
        btnPlanes.setFocusable(false);
        btnPlanes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPlanes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPlanes);

        btnPagos.setBackground(new java.awt.Color(0, 0, 0));
        btnPagos.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagos.setText("Pagos");
        btnPagos.setBorderPainted(false);
        btnPagos.setFocusable(false);
        btnPagos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPagos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPagos);

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        javax.swing.GroupLayout pnlDerLayout = new javax.swing.GroupLayout(pnlDer);
        pnlDer.setLayout(pnlDerLayout);
        pnlDerLayout.setHorizontalGroup(
            pnlDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDerLayout.setVerticalGroup(
            pnlDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(pnlDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btnCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancionesActionPerformed
        new DlgCanciones(this,true).setVisible(true);
    }//GEN-LAST:event_btnCancionesActionPerformed

    private void btnArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtistasActionPerformed
         new DlgArtistas(this,true).setVisible(true);
    }//GEN-LAST:event_btnArtistasActionPerformed

    private void btnAlbumesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlbumesActionPerformed
         new DlgAlbums(this,true).setVisible(true);
    }//GEN-LAST:event_btnAlbumesActionPerformed

    private void btnGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerosActionPerformed
         new DlgGeneros(this,true).setVisible(true);
    }//GEN-LAST:event_btnGenerosActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
         new DlgCategorias(this,true).setVisible(true);
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaylistActionPerformed
         new DlgPlaylist(this,true).setVisible(true);
    }//GEN-LAST:event_btnPlaylistActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        new DlgUsuarios(this,true).setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesActionPerformed
         new DlgPlanes(this,true).setVisible(true);
    }//GEN-LAST:event_btnPlanesActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
         new DlgPagos(this,true).setVisible(true);
    }//GEN-LAST:event_btnPagosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlbumes;
    private javax.swing.JButton btnArtistas;
    private javax.swing.JButton btnCanciones;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnGeneros;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnPlanes;
    private javax.swing.JButton btnPlaylist;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlDer;
    private javax.swing.JPanel pnlIzq;
    // End of variables declaration//GEN-END:variables
}
