package paquete01;

public class MenuNiños extends Menu {

    private double valorPorcionHelado;
    private double valorPorcionPastel;
    
    
    public MenuNiños(String n, double vI, double vH, double vP) {
        super(n, vI);
        valorPorcionHelado = vH;
        valorPorcionPastel = vP;
    }
    
    
    public double obtenerValorPorcionHelado() {
        return valorPorcionHelado;
    }
    
    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }
    
    public void establecerValorPorcionHelado(double x) {
        valorPorcionHelado = x;
    }
    
    public void establecerValorPorcionPastel(double x) {
        valorPorcionPastel = x;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorPorcionHelado + valorPorcionPastel;
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("\nMenú de Niños:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicual: $%.2f\n"
                + "\tValor Helado: $%.2f\n"
                + "\tValor Pastel: $%.2f\n"
                + "\tValor Menú: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorPorcionHelado,
                valorPorcionPastel,
                valorMenu);
        return cadena;
    }
}