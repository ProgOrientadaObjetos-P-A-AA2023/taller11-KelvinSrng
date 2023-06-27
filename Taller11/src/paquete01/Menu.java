package paquete01;

public abstract class Menu {
    
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;
    
    
    public Menu(String nP, double vI) {
        nombrePlato = nP;
        valorInicialMenu = vI;
    }
    
    
    public void establecerNombrePlato(String x) {
        nombrePlato = x;
    }

    public void establecerValorInicialMenu(double x) {
        valorInicialMenu = x;
    }
    
    // clase abstracta

    public abstract void calcularValorMenu();

    
    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }
    
    
}
