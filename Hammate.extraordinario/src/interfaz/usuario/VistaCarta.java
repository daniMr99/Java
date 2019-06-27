/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.usuario;

import hammate.extraordinario.Carta;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JRadioButton;

/**
 *
 * @author Daniel
 */
public class VistaCarta extends javax.swing.JPanel {

    private int valorRetoHorizontal;
    private int valorRetoVertical;
    private Carta carta;
    
    
    /**
     * Creates new form VistaCarta
     */
    public VistaCarta() {
        initComponents();
    }

    public void setValorRetoHorizontal(int valorRetoHorizontal) {
        this.valorRetoHorizontal = valorRetoHorizontal;
        jLabelIzquierda.setText(String.format("%d", this.valorRetoHorizontal));
        jLabelDerecha.setText(String.format("%d", this.valorRetoHorizontal));
    }

    public void setValorRetoVertical(int valorRetoVertical) {
        this.valorRetoVertical = valorRetoVertical;
        jLabelArriba.setText(String.format("%d", this.valorRetoVertical));
        jLabelAbajo.setText(String.format("%d", this.valorRetoVertical));
    }
    
    public void setSelecciona(boolean selecciona) {
        jRadioButtonSelecciona.setVisible(selecciona);
    }

    public JRadioButton getjRadioButtonSelecciona() {
        return jRadioButtonSelecciona;
    }
    
    
    
    public void setCarta(Carta carta) {
        this.carta = carta;
        
        String ficheroImagen;
        
        if(carta !=null){
        
            setValorRetoHorizontal(carta.getValor_reto_horizontal());
            setValorRetoVertical(carta.getValor_reto_vertical());
            ficheroImagen = "/interfazusuario/cartas/" + carta.getFigura();
                        
        } else {
            setValorRetoHorizontal(0);
            setValorRetoVertical(0);
            ficheroImagen = "/interfazusuario/cartas/frame-1-normal.png";
        }
        URL resource = getClass().getResource(ficheroImagen);
        ImageIcon imagen = new ImageIcon(resource);

        ImageIcon imagenReducida = new ImageIcon(imagen.getImage().getScaledInstance(jLabelCarta.getWidth(), jLabelCarta.getHeight(), Image.SCALE_DEFAULT));

        jLabelCarta.setIcon(imagenReducida);
        
        if (carta!= null && carta.getColor()!=null){
            setColor(carta.getColor());
        } else {
            setColor(null);
        }
    } 
    
    public void setColor(Color color) {
        jLabelCarta.setBackground(color);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCarta = new javax.swing.JLabel();
        jLabelArriba = new javax.swing.JLabel();
        jLabelDerecha = new javax.swing.JLabel();
        jLabelIzquierda = new javax.swing.JLabel();
        jLabelAbajo = new javax.swing.JLabel();
        jRadioButtonSelecciona = new javax.swing.JRadioButton();

        jLabelCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazusuario/cartas/frame-1-normal.png"))); // NOI18N
        jLabelCarta.setText("jLabel1");
        jLabelCarta.setMaximumSize(new java.awt.Dimension(160, 160));
        jLabelCarta.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabelArriba.setText("0");

        jLabelDerecha.setText("0");

        jLabelIzquierda.setText("0");

        jLabelAbajo.setText("0");
        jLabelAbajo.setMaximumSize(new java.awt.Dimension(160, 160));
        jLabelAbajo.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelIzquierda)
                        .addGap(16, 16, 16)
                        .addComponent(jLabelCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDerecha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabelArriba))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonSelecciona)
                            .addComponent(jLabelAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelArriba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIzquierda)
                    .addComponent(jLabelDerecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonSelecciona))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAbajo;
    private javax.swing.JLabel jLabelArriba;
    private javax.swing.JLabel jLabelCarta;
    private javax.swing.JLabel jLabelDerecha;
    private javax.swing.JLabel jLabelIzquierda;
    private javax.swing.JRadioButton jRadioButtonSelecciona;
    // End of variables declaration//GEN-END:variables
}
