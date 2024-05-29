package n1exercici1.models.exeptions;

public class VendaBuidaException extends Exception{

    public VendaBuidaException(){
        super("Per fer una venda primer has d’afegir productes");
    }
}
