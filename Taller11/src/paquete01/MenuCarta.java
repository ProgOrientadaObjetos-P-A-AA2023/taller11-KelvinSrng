package paquete01;


public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;
    
    
    public MenuCarta(String n, double vI, double vP, double vB,
            double p) {
        super(n, vI);
        valorGuarnicion = vP;
        valorBebida = vB;
        porcentajeAdicional = p;
    }

    public void establecerValorGuarnicion(double x) {
        valorGuarnicion = x;
    }

    public void establecerValorBebida(double x) {
        valorBebida = x;
    }

    public void establecerPorcentajeAdicional(double x) {
        porcentajeAdicional = x;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorGuarnicion + valorBebida +
                (valorInicialMenu * (porcentajeAdicional/100));
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nMenú a la Carta:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicual: $%.2f\n"
                + "\tValor Guarnición: $%.2f\n"
                + "\tValor Bebida: $%.2f\n"
                + "\tPorcentaje Adicional: %.2f%%\n"
                + "\tValor Menú: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
        return cadena;
    }
}
