public class DescuentoRopa {
    public static void main(String[] args) {

        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;
        double descuentoCamiseta = 0.15;
        double descuentoPantalon = 0.15;
        double precioCamisetaDescuento = precioCamiseta - (precioCamiseta * descuentoCamiseta);

        double precioPantalonDescuento = precioPantalon - (precioPantalon * descuentoPantalon);

        double descuentoAdicionalCamiseta = 0.05;
        double precioSegundaCamisetaDescuento = precioCamisetaDescuento - (precioCamisetaDescuento * descuentoAdicionalCamiseta);

        double precioTotal = precioCamisetaDescuento + precioPantalonDescuento + precioSegundaCamisetaDescuento;

        System.out.println("Precio de la primera camiseta: $" + precioCamisetaDescuento);
        System.out.println("Precio del pantalón: $" + precioPantalonDescuento);
        System.out.println("Precio de la segunda camiseta con descuento adicional: $" + precioSegundaCamisetaDescuento);
        System.out.println("Precio total después de los descuentos: $" + String.format("%.2f", precioTotal));
    }
}

