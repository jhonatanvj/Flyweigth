/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

/**
 *
 * @author jhona
 */
public class Escudo implements Item {
    private String material;

    public Escudo(String material) {
        this.material = material;
    }

    @Override
    public void mostrar() {
        // Este método se sobreescribirá para mostrar la información en la interfaz gráfica
    }

    public String getMaterial() {
        return material;
    }
}