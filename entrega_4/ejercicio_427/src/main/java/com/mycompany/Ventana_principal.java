package com.mycompany;
/**
 *
 * @author julián pérez carvajal
 */
public class Ventana_principal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName());

    // ruta al txt
    private static final String RUTA_ARCHIVO = "C:/Users/Usuario/Desktop/GitHub/perezJulian_PelaezDaniel_POO_G3_2025_2/entrega_4/ejercicio_427/prueba.txt";


    public Ventana_principal() {
        initComponents();
    }

    private void initComponents() {

        label_contenido = new javax.swing.JLabel();
        scroll_contenido = new javax.swing.JScrollPane();
        area_contenido = new javax.swing.JTextArea();
        boton_mostrar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        label_mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_contenido.setText("Contenido del archivo");

        area_contenido.setColumns(20);
        area_contenido.setRows(5);
        area_contenido.setEditable(false);
        scroll_contenido.setViewportView(area_contenido);

        boton_mostrar.setText("Mostrar");
        boton_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_mostrarActionPerformed(evt);
            }
        });

        boton_limpiar.setText("Limpiar");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        label_mensaje.setText("Pulse \"Mostrar\" para leer el archivo C:.../prueba.txt.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_mensaje)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_contenido)
                        .addGap(18, 18, 18)
                        .addComponent(scroll_contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_mostrar)
                        .addGap(18, 18, 18)
                        .addComponent(boton_limpiar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_contenido)
                    .addComponent(scroll_contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_mostrar)
                    .addComponent(boton_limpiar))
                .addGap(18, 18, 18)
                .addComponent(label_mensaje)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void boton_mostrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String contenido = LectorArchivo.leerArchivo(RUTA_ARCHIVO);
            area_contenido.setText(contenido);
            label_mensaje.setText("Archivo leído correctamente.");
        } catch (java.io.IOException ex) {
            System.out.println("No se pudo leer el archivo.");
            area_contenido.setText("No se pudo leer el archivo.");
            label_mensaje.setText("No se pudo leer el archivo.");
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {
        area_contenido.setText("");
        label_mensaje.setText("Pulse \"Mostrar\" para leer el archivo C:/prueba.txt.");
    }


    private javax.swing.JTextArea area_contenido;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JButton boton_mostrar;
    private javax.swing.JLabel label_contenido;
    private javax.swing.JLabel label_mensaje;
    private javax.swing.JScrollPane scroll_contenido;
}
