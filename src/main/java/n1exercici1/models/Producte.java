package n1exercici1.models;

public class Producte {

    // ATRIBUTS

    private String nom;
    private double preu;

    // CONSTRUCTOR

    public Producte (String nom, double preu){
        this.nom = nom;
        this.preu = preu;
    }

    // GETTERS & SETTERS

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }
}
