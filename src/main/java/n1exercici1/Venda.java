package n1exercici1;

import java.util.ArrayList;

public class Venda {

    // ATRIBUTS

    private ArrayList<Producte> productes;
    private double preuTotalVenda;

    // CONSTRUCTOR

    public Venda( ){
        this.productes      = new ArrayList<>();
        this.preuTotalVenda = 0.0;
    }

    // GETTERS & SETTERS

    public double getPreuTotalVenda() {
        return preuTotalVenda;
    }

    public ArrayList<Producte> getProductes() {
        return productes;
    }

    // ALTREA MÈTODES

    public void calcularTotal() throws VendaBuidaException{
        if (productes.isEmpty()){
            throw new VendaBuidaException();
        } else {
            preuTotalVenda = 0.0;
            for(Producte producte : productes){
                preuTotalVenda += producte.getPreu();
            }
            System.out.println("El preu total de la venda és de: " + preuTotalVenda + " euros.");
        }
    }
}
