package n1exercici1;

import n1exercici1.models.Producte;
import n1exercici1.models.Venda;
import n1exercici1.models.exeptions.VendaBuidaException;

public class S102n1exercici1 {

    public static void main(String[] args) {

        Venda venda = new Venda();

        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }

        // Afegim productes per comprovar que funciona el mètode

        Producte pc = new Producte("Portàtil", 1500);
        Producte pen = new Producte("Bolígraf vermell", 0.85);
        Producte book = new Producte("Llibre física", 5.75);

        venda.getProductes().add(pc);
        venda.getProductes().add(pen);
        venda.getProductes().add(book);

        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }

        // Generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException

        int[] array = {1, 2, 3, 4, 5};

        try {
            int valor = array[7];
            System.out.println("Valor de l'index 7: " + valor);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error! Índex fora dels límits del Array: " + e.getMessage());
        }
    }
}
