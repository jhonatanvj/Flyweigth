/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import flyweight.Arma;
import flyweight.Escudo;
import flyweight.Item;
import java.util.HashMap;

/**
 *
 * @author jhona
 */
public class ItemFactory {
    private static final HashMap<String, Item> itemMap = new HashMap<>();

    public static Item getArma(String tipo) {
        Arma arma = (Arma) itemMap.get("Arma_" + tipo);

        if (arma == null) {
            arma = new Arma(tipo);
            itemMap.put("Arma_" + tipo, arma);
            System.out.println("Creando arma de tipo: " + tipo);
        }
        return arma;
    }

    public static Item getEscudo(String material) {
        Escudo escudo = (Escudo) itemMap.get("Escudo_" + material);

        if (escudo == null) {
            escudo = new Escudo(material);
            itemMap.put("Escudo_" + material, escudo);
            System.out.println("Creando escudo de material: " + material);
        }
        return escudo;
    }

}
