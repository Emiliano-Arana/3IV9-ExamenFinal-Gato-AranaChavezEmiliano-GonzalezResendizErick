
package gato;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaJuego extends javax.swing.JFrame {

    Archivo arch = new Archivo();
    private String jugador1;
    private String jugador2;
    boolean val;
    String turno;
    JLabel cas[] = new JLabel[9];
    String text[] = new String[9];
    
    public VentanaJuego(String jugador1, String jugador2) {
        initComponents();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        setLocationRelativeTo(null);
        j1.setText(jugador1);
        j2.setText(jugador2);
        turno = "x";
        cas[0] = uno;
        cas[1] = dos;
        cas[2] = tres;
        cas[3] = cuatro;
        cas[4] = cinco;
        cas[5] = seis;
        cas[6] = siete;
        cas[7] = ocho;
        cas[8] = nueve;
        for(int i=0;i<cas.length;i++){
            cas[i].setText("");
        }
    }
    
    public void comprobacion(){
        val = true;
        for(int i=0;i<text.length;i++){
            text[i] = cas[i].getText();
        }
        if(text[0].equals(text[1])&&text[0].equals(text[2])){
            if(val){
                if(text[0].equals("X")||text[0].equals("O")){
                    winner(text[0]);
                    val = false;
                }
            }
        }
        if(text[3].equals(text[4])&&text[3].equals(text[5])){
            if(val){
                if(text[3].equals("X")||text[3].equals("O")){
                    winner(text[3]);
                    val = false;
                }
            }
        }
        if(text[6].equals(text[7])&&text[6].equals(text[8])){
            if(val){
                if(text[6].equals("X")||text[6].equals("O")){
                    winner(text[6]);
                    val = false;
                }
            }
        }
        if(text[0].equals(text[3])&&text[0].equals(text[6])){
            if(val){
                if(text[0].equals("X")||text[0].equals("O")){
                    winner(text[0]);
                    val = false;
                }
            }
        }
        if(text[1].equals(text[4])&&text[1].equals(text[7])){
            if(val){
                if(text[1].equals("X")||text[1].equals("O")){
                    winner(text[1]);
                    val = false;
                }
            }
        }
        if(text[2].equals(text[5])&&text[2].equals(text[8])){
            if(val){
                if(text[2].equals("X")||text[2].equals("O")){
                    winner(text[2]);
                    val = false;
                }
            }
        }
        if(text[0].equals(text[4])&&text[0].equals(text[8])){
            if(val){
                if(text[0].equals("X")||text[0].equals("O")){
                    winner(text[0]);
                    val = false;
                }
            }
        }
        if(text[2].equals(text[4])&&text[2].equals(text[6])){
            if(val){
                if(text[2].equals("X")||text[2].equals("O")){
                    winner(text[2]);
                    val = false;
                }
            }
        }
    }
    
    public void winner(String win){
        if(win.equals("X")){
            arch.SumarPuntos(jugador1);
            Ganar gan = new Ganar(jugador1,jugador2,"X");
            gan.setVisible(true);
            this.dispose();
        }else{
            arch.SumarPuntos(jugador2);
            Ganar gan = new Ganar(jugador1,jugador2,"O");
            gan.setVisible(true);
            this.dispose();
        }
    }
    
    public void click(int n){
        if(cas[n].getText().equals("")){
            if(turno.equals("x")){
                cas[n].setText("X");
                cas[n].setForeground(new Color(204,0,0));
                turno = "o";
                turnO.setText("O");
                turnO.setForeground(new Color(51,153,255));
            }else{
                cas[n].setText("O");
                cas[n].setForeground(new Color(51,153,255));
                turno = "x";
                turnO.setText("X");
                turnO.setForeground(new Color(204,0,0));
            }
            comprobacion();
        }else{
            JOptionPane.showMessageDialog(null, "Esta casilla ya esta ocupada");
        }
    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        turnO = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        cuatro = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        siete = new javax.swing.JLabel();
        nueve = new javax.swing.JLabel();
        ocho = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Turno");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        turnO.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        turnO.setForeground(new java.awt.Color(204, 0, 0));
        turnO.setText("X");
        getContentPane().add(turnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        j1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 150, 30));

        j2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 150, 30));

        uno.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        uno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uno.setOpaque(true);
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unoMouseEntered(evt);
            }
        });
        getContentPane().add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, 70));

        dos.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        dos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dos.setOpaque(true);
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dosMouseEntered(evt);
            }
        });
        getContentPane().add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 70));

        tres.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        tres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres.setOpaque(true);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tresMouseEntered(evt);
            }
        });
        getContentPane().add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 70, 70));

        cuatro.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuatro.setOpaque(true);
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuatroMousePressed(evt);
            }
        });
        getContentPane().add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 70, 70));

        cinco.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cinco.setOpaque(true);
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cincoMousePressed(evt);
            }
        });
        getContentPane().add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 70, 70));

        seis.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        seis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seis.setOpaque(true);
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seisMousePressed(evt);
            }
        });
        getContentPane().add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 70, 70));

        siete.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        siete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        siete.setOpaque(true);
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
        });
        getContentPane().add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 70, 70));

        nueve.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        nueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nueve.setOpaque(true);
        nueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nueveMousePressed(evt);
            }
        });
        getContentPane().add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 70, 70));

        ocho.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        ocho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocho.setOpaque(true);
        ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ochoMousePressed(evt);
            }
        });
        getContentPane().add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 70, 70));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("jLabel11");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 230, 230));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        jLabel4.setText("Vs");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("O");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Ravie", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("X");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu mennu = new Menu();
        mennu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void unoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMouseEntered
        
    }//GEN-LAST:event_unoMouseEntered

    private void dosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMouseEntered
       
    }//GEN-LAST:event_dosMouseEntered

    private void tresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMouseEntered
        
    }//GEN-LAST:event_tresMouseEntered

    private void unoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMousePressed
        click(0);
    }//GEN-LAST:event_unoMousePressed

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
        click(1);
    }//GEN-LAST:event_dosMousePressed

    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMousePressed
        click(2);
    }//GEN-LAST:event_tresMousePressed

    private void cuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMousePressed
        click(3);
    }//GEN-LAST:event_cuatroMousePressed

    private void cincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMousePressed
        click(4);
    }//GEN-LAST:event_cincoMousePressed

    private void seisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMousePressed
        click(5);
    }//GEN-LAST:event_seisMousePressed

    private void sieteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMousePressed
        click(6);
    }//GEN-LAST:event_sieteMousePressed

    private void ochoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ochoMousePressed
        click(7);
    }//GEN-LAST:event_ochoMousePressed

    private void nueveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nueveMousePressed
        click(8);
    }//GEN-LAST:event_nueveMousePressed

    
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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cinco;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nueve;
    private javax.swing.JLabel ocho;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel siete;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel turnO;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables
}
