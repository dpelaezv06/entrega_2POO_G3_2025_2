package com.mycompany;

import javax.swing.*;
import java.awt.*;

public class VentanaEquipo extends JFrame {

    private JTextField txtNombreEquipo;
    private JTextField txtUniversidad;
    private JTextField txtLenguaje;

    private JTextField txtNombre1;
    private JTextField txtApellidos1;

    private JTextField txtNombre2;
    private JTextField txtApellidos2;

    private JTextField txtNombre3;
    private JTextField txtApellidos3;

    public VentanaEquipo() {
        super("Equipo Maratón de Programación");  // título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null); // Centrar pantalla

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtNombreEquipo = new JTextField();
        txtUniversidad = new JTextField();
        txtLenguaje = new JTextField();

        txtNombre1 = new JTextField();
        txtApellidos1 = new JTextField();

        txtNombre2 = new JTextField();
        txtApellidos2 = new JTextField();

        txtNombre3 = new JTextField();
        txtApellidos3 = new JTextField();

        panel.add(new JLabel("Nombre del equipo:"));
        panel.add(txtNombreEquipo);

        panel.add(new JLabel("Universidad:"));
        panel.add(txtUniversidad);

        panel.add(new JLabel("Lenguaje de programación:"));
        panel.add(txtLenguaje);

        panel.add(new JLabel("Nombre integrante 1:"));
        panel.add(txtNombre1);

        panel.add(new JLabel("Apellidos integrante 1:"));
        panel.add(txtApellidos1);

        panel.add(new JLabel("Nombre integrante 2:"));
        panel.add(txtNombre2);

        panel.add(new JLabel("Apellidos integrante 2:"));
        panel.add(txtApellidos2);

        panel.add(new JLabel("Nombre integrante 3:"));
        panel.add(txtNombre3);

        panel.add(new JLabel("Apellidos integrante 3:"));
        panel.add(txtApellidos3);

        JButton btnCrear = new JButton("Crear equipo");
        btnCrear.addActionListener(e -> crearEquipo());

        JPanel panelBoton = new JPanel();
        panelBoton.add(btnCrear);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(panelBoton, BorderLayout.SOUTH);
    }

    private void crearEquipo() {
        try {
            String nombreEquipo = txtNombreEquipo.getText().trim();
            String universidad = txtUniversidad.getText().trim();
            String lenguaje = txtLenguaje.getText().trim();

            EquipoMaratonProgramacion equipo =
                    new EquipoMaratonProgramacion(nombreEquipo, universidad, lenguaje);

            String n1 = txtNombre1.getText().trim();
            String a1 = txtApellidos1.getText().trim();
            EquipoMaratonProgramacion.validarCampo(n1);
            EquipoMaratonProgramacion.validarCampo(a1);
            Programador p1 = new Programador(n1, a1);
            equipo.añadir(p1);

            String n2 = txtNombre2.getText().trim();
            String a2 = txtApellidos2.getText().trim();
            EquipoMaratonProgramacion.validarCampo(n2);
            EquipoMaratonProgramacion.validarCampo(a2);
            Programador p2 = new Programador(n2, a2);
            equipo.añadir(p2);

            String n3 = txtNombre3.getText().trim();
            String a3 = txtApellidos3.getText().trim();
            EquipoMaratonProgramacion.validarCampo(n3);
            EquipoMaratonProgramacion.validarCampo(a3);
            Programador p3 = new Programador(n3, a3);
            equipo.añadir(p3);

            StringBuilder sb = new StringBuilder();
            sb.append("Equipo creado correctamente.\n\n");
            sb.append("Nombre del equipo: ").append(equipo.nombreEquipo).append("\n");
            sb.append("Universidad: ").append(equipo.universidad).append("\n");
            sb.append("Lenguaje: ").append(equipo.lenguajeProgramacion).append("\n\n");
            sb.append("Integrantes:\n");
            for (Programador prog : equipo.programadores) {
                if (prog != null) {
                    sb.append(" - ").append(prog.nombre).append(" ").append(prog.apellidos).append("\n");
                }
            }

            JOptionPane.showMessageDialog(this, sb.toString(),
                    "Equipo creado", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
