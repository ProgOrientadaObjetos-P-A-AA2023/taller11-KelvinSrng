package paquete01;

public class MenuEconomico extends Menu {

    private double porcentajeDescuento;
    
    
    public MenuEconomico(String n, double vI, double p) {
        super(n, vI);
        porcentajeDescuento = p;
    }
    
    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    public void establecerPorcentajeDescuento(double x) {
        porcentajeDescuento = x;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu - (valorInicialMenu * (porcentajeDescuento/100));
    }
    

    
    @Override
    public String toString() {
        String cadena = String.format("\nMenú Económico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicual: $%.2f\n"
                + "\tPorcentaje Descuento: %.2f%%\n"
                + "\tValor Menú: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                porcentajeDescuento,
                valorMenu);
        return cadena;
    }
}