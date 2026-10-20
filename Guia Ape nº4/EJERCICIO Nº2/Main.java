public class Main {
    public static void main(String[] args) {
        Producto[] prod = {
            new Producto("Cuaderno", 2.50, 10),
            new Producto("Lapiz", 0.50, 20),
            new Producto("Mochila", 25.00, 6),
            new Producto("Regla", 1.00, 8)
        };
        for (Producto p : prod) {
            System.out.printf("%s : %.2f%n", p.nombre, p.precio);
        }

    
        prod[0].stock -= 3;
        prod[2].stock -= 3;

        double total = 0;
        for (Producto p : prod) {
            String aviso = p.stock < 5 ? " Reponer" : "";
            System.out.println(p.nombre + " : " + p.stock + " unidades" + aviso);
            total += p.precio * p.stock;
        }
        System.out.printf("Valor total del inventario: %.2f%n", total);
    }
}
