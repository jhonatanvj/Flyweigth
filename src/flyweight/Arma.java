/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

/**
 *
 * @author jhona
 */
public class Arma implements Item {
    private String tipo;

    public Arma(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrar() {
        // Este método se sobreescribirá para mostrar la información en la interfaz gráfica
    }

    public String getTipo() {
        return tipo;
    }
}
