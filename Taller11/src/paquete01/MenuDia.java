package paquete01;

/**
 *
 * @author Jhonder
 */
public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;
    
    
    public MenuDia(String n, double vI, double vP, double vB) {
        super(n, vI);
        valorPostre = vP;
        valorBebida = vB;
    }
    
    public double obtenerValorPostre() {
        return valorPostre;
    }
    
    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    public void establecerValorPostre(double x) {
        valorPostre = x;
    }
    
    public void establecerValorBebida(double x) {
        valorBebida = x;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nMenú del Día:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicual: $%.2f\n"
                + "\tValor Bebida: $%.2f\n"
                + "\tValor Postre: $%.2f\n"
                + "\tValor Menú: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorBebida,
                valorPostre,
                valorMenu);
        return cadena;
    }
}
