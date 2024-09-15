/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import factory.ItemFactory;
import flyweight.Arma;
import flyweight.Escudo;
import flyweight.Item;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author jhona
 */
public class TiendaUI extends JFrame {
    private JPanel mainPanel;
    private JTextArea textArea;
    private JButton ordenarButton;

    public TiendaUI() {
        setTitle("Tienda de Armas y Escudos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece un layout más flexible
        mainPanel = new JPanel(new BorderLayout(10, 10));  // Añadir padding entre los componentes
        mainPanel.setBackground(new Color(230, 240, 255)); // Fondo claro
        add(mainPanel);

        // Área de texto para mostrar los pedidos
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14)); // Fuente legible
        textArea.setForeground(Color.DARK_GRAY);  // Texto en gris oscuro
        textArea.setBackground(Color.WHITE);  // Fondo blanco
        textArea.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));  // Borde con color
        JScrollPane scrollPane = new JScrollPane(textArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Botón para hacer pedidos
        ordenarButton = new JButton("Hacer Pedido");
        ordenarButton.setFont(new Font("Arial", Font.BOLD, 16));  // Fuente más grande y negrita
        ordenarButton.setForeground(Color.WHITE);  // Texto del botón en blanco
        ordenarButton.setBackground(new Color(100, 150, 200));  // Fondo del botón azul
        ordenarButton.setFocusPainted(false);  // Remover el borde de selección del botón
        ordenarButton.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));  // Borde azul
        ordenarButton.setPreferredSize(new Dimension(200, 40));  // Tamaño del botón
        ordenarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarPedidos();
            }
        });

        // Añadir el botón a un panel con layout centrado
        JPanel botonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        botonPanel.setBackground(new Color(230, 240, 255)); // Fondo que coincida con el panel principal
        botonPanel.add(ordenarButton);
        mainPanel.add(botonPanel, BorderLayout.SOUTH);
    }

    // Método que realiza los pedidos
    private void realizarPedidos() {
        String[] tiposArma = {"Espada", "Lanza", "Arco"};
        String[] materialesEscudo = {"Madera", "Hierro", "Acero"};

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            Item arma = ItemFactory.getArma(tiposArma[(int) (Math.random() * tiposArma.length)]);
            Item escudo = ItemFactory.getEscudo(materialesEscudo[(int) (Math.random() * materialesEscudo.length)]);

            resultado.append("Pedido ").append(i + 1).append(":\n");
            resultado.append("Arma: ").append(((Arma) arma).getTipo()).append("\n");
            resultado.append("Escudo: ").append(((Escudo) escudo).getMaterial()).append("\n\n");
        }

        textArea.setText(resultado.toString());
    }
}
