package Vistas;

import Utilidades.Messages;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import modelo.Respuesta;

/**
 */
public class VistaHacerTest extends javax.swing.JFrame {

    public jcPanel mi_panel = new jcPanel();
    private int totalSegundos;
    public boolean tiempoAcabado = false;

    /** Creates new form interfaz */
    public VistaHacerTest(int totalSegundos, String title) {
        this.totalSegundos = totalSegundos;
        initComponents();
        this.setTitle(title);
        btnSiguiente.setText(Messages.getString("siguiente"));
       
    }
    
    public ButtonGroup getButtoGroupPreguntas() {
        return buttonGroupPreguntas;
    }
    
    public boolean isAcabado() {
        return vistaCronometro.isAcabado();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPreguntas = new javax.swing.ButtonGroup();
        labelPregunta = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        vistaCronometro = new Vistas.VistaCronometro(totalSegundos, btnSiguiente);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Test");
        setResizable(false);

        labelPregunta.setText("jLabel2");

        btnSiguiente.setText("Siguiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPregunta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 286, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vistaCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vistaCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(labelPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup buttonGroupPreguntas;
    private javax.swing.JLabel labelPregunta;
    public Vistas.VistaCronometro vistaCronometro;
    // End of variables declaration//GEN-END:variables

        
    public void setPregunta(String texto, ArrayList<Respuesta> listaRespuestas, int totalPreguntas, int preguntaActual) {
        labelPregunta.setText("("+Integer.toString(preguntaActual+1)+" / "+Integer.toString(totalPreguntas)+") "+texto);
        if (totalPreguntas == preguntaActual+1)
            btnSiguiente.setText(Messages.getString("btnFinalizar"));
        //se añade componente al JFrame
        add(mi_panel);
        //posicion del panel para no sobreponer al boton
        mi_panel.setLocation(10, 100);
        mi_panel.vaciar();
        for (int i =0; i<listaRespuestas.size(); i++){
            mi_panel.Mi_Componente(this.buttonGroupPreguntas,listaRespuestas.get(i).getTexto());
        }
        revalidate();
    }
}

