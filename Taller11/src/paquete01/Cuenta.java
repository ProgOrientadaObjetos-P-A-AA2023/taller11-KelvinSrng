package paquete01;

import java.util.ArrayList;

public class Cuenta {
    
    private String nombreCliente;
    private double iva;
    private double valorTotal;
    private ArrayList<Menu> menuLista;
    private double subtotal;
    
    public Cuenta(String nC, ArrayList<Menu> lis, double i){
        nombreCliente = nC;
        iva = i;
        menuLista = lis;
    }
    
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
    
    public double obtenerIva() {
        return iva;
    }
    
    public double obtenerValorTotal() {
        return valorTotal;
    }
    
    public ArrayList<Menu> obtenerListaMenu() {
        return menuLista;
    }
    
    public void establecerNombreCliente(String x) {
        nombreCliente = x;
    }
    
    public void establecerIva(double x) {
        iva = x;
    }
    
    public void establecerListaMenu(ArrayList<Menu> x) {
        menuLista = x;
    }
    
    public void calcularSubtotal() {
        double suma = 0;
        
        for(int i = 0; i < menuLista.size(); i++) {
            suma = suma + menuLista.get(i).obtenerValorMenu();
        }
        
        subtotal = suma;
    }
    
    public void calcularValorTotal() {
        valorTotal = subtotal + (subtotal * (iva/100));
    }
    
    public double obtenerSubTotal() {
        return subtotal;
    }
    
    
    
    @Override
    public String toString() {
        String cadena = String.format("FACTURA:\n"
                + "Cliente: %s\n",nombreCliente);
        
        for(int i = 0; i < menuLista.size(); i++) {
           cadena = String.format("%s%s",cadena,
                   menuLista.get(i)); 
        }
        
        cadena = String.format("%s\nSubtotal: $%.2f\n"
                + "IVA: %.2f%%\n"
                + "Total a Pagar: $%.3f",
                cadena,
                subtotal,
                iva,
                valorTotal);
        
        return cadena;
    }
}