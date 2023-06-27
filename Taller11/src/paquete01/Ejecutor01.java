package paquete01;

import java.util.ArrayList;

public class Ejecutor01 {

    public static void main(String[] args) {
        
        ArrayList<Menu> listado = new ArrayList();
        
        // Dos objetos de tipo menú de niños
        MenuNiños mN1 = new MenuNiños("Niños 01",2,1,1.5);
        listado.add(mN1);
        
        MenuNiños mN2 = new MenuNiños("Niños 02",3,1,1.5);
        listado.add(mN2);
        
        // Un objeto de tipo menú de económico
        MenuEconomico mE = new MenuEconomico("Econo 001",4,25);
        listado.add(mE);
        
        // Un objeto de tipo menú del día
        MenuDia mD = new MenuDia("Día 001",5,1,1);
        listado.add(mD);
        
        // Un objeto de tipo menú a la carta
        MenuCarta mC = new MenuCarta("",6,1.5,2,10);
        listado.add(mC);
        
        for (int i = 0; i < listado.size(); i++) {
            listado.get(i).calcularValorMenu();
        }
        
        // Un objeto de tipo Cuenta
        Cuenta c = new Cuenta("René Elizalde",listado,10);
        c.calcularSubtotal();
        c.calcularValorTotal();
        
        // Presentación de datos
        System.out.printf("%s\n",c);
    }
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/