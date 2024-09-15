/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import javax.swing.SwingUtilities;
import client.TiendaUI;

/**
 *
 * @author jhona
 */
public class TiendaDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TiendaUI tiendaui = new TiendaUI();
                tiendaui.setVisible(true);
            }
        });
    }
}
