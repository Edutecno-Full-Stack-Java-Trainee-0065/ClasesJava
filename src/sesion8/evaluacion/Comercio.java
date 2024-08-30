package sesion8.evaluacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Comercio implements Carrito {

    private static List<Producto> stock = new ArrayList<>();
    private List<Producto> carrito = new ArrayList<>();

    static {
        // Creación de objetos Vegetales
        stock.add(new Vegetales("Tomate", "V001", 800, new Date(2024-1900, 7, 20), new Date(2024-1900, 9, 15)));
        stock.add(new Vegetales("Lechuga", "V002", 500, new Date(2024-1900, 7, 18), new Date(2024-1900, 8, 25)));
        stock.add(new Vegetales("Zanahoria", "V003", 600, new Date(2024-1900, 7, 21), new Date(2024-1900, 9, 10)));
        stock.add(new Vegetales("Pimiento", "V004", 700, new Date(2024-1900, 7, 22), new Date(2024-1900, 9, 20)));
        stock.add(new Vegetales("Cebolla", "V005", 550, new Date(2024-1900, 7, 19), new Date(2024-1900, 8, 30)));

        // Creación de objetos Vestuario
        stock.add(new Vestuario("Camiseta", "C001", 12000, "M", "Rojo"));
        stock.add(new Vestuario("Jeans", "C002", 20000, "32", "Azul"));
        stock.add(new Vestuario("Chaqueta", "C003", 35000, "L", "Negro"));
        stock.add(new Vestuario("Zapatos", "C004", 25000, "42", "Marrón"));
        stock.add(new Vestuario("Sombrero", "C005", 8000, "Única", "Beige"));
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Ingrese su nombre: ");
        String nombreVendedor = sc.nextLine();

        System.out.println("Ingrese su apellido: ");
        String RUT = sc.nextLine();

        while (continuar) {
            System.out.println("\n*** Menú de Comercio ***");
            System.out.println("1. Listar stock");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Mostrar carrito");
            System.out.println("4. Pagar carrito");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    listarStock();
                    break;
                case 2:
                    elegirProducto();
                    break;
                case 3:
                    mostrarCarrito();
                    break;
                case 4:
                    pagarCarrito(nombreVendedor, RUT);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Gracias por su visita.");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese opciones del 1 al 5.");
            }
        }
    }

    public void listarStock() {
        for (Producto p : stock) {
            System.out.println(p);
        }
    }

    private void elegirProducto() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            listarStock();

            System.out.println("Ingrese el codigo del producto que desea agregar al carrito: ");
            String codigoProducto = sc.nextLine();

            if (codigoProducto.equalsIgnoreCase("salir")) {
                continuar = false;
                break;
            }

            Producto productoSeleccionado = null;
            for (Producto p : stock) {
                if (p.getCodigo().equalsIgnoreCase(codigoProducto)) {
                    productoSeleccionado = p;
                    break;
                }
            }

            if (productoSeleccionado != null) {
                agregarCarrito(productoSeleccionado);
            } else {
                System.out.println("Producto no encontrado en el stock.");
            }
        }
    }


    @Override
    public void agregarCarrito(Producto producto) {
        if (stock.contains(producto)) {
            carrito.add(producto);
            System.out.println(producto.getNombre() + "ha sido agregado al carrito.");
        } else {
            System.out.println("El producto no esta disponible en el stock.");
        }
    }

    @Override
    public void mostrarCarrito() {
        if (carrito.isEmpty()) {
            System.out.println("El carrito esta vacio.");
        } else {
            System.out.println("Productos en el carrito: ");
            for (Producto p : carrito) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void pagarCarrito(String nombre, String rut) {
        Vendedor vendedor = new Vendedor(nombre, rut);
        int total = 0;
        for (Producto p : carrito) {
            total += p.getPrecio();
        }
        System.out.printf("Fue atendido por el vendedor: %s, rut: %s, el total de su compra es de %d ", vendedor.getNombre(), vendedor.getRUT(), total);

        carrito.clear();
        System.out.println("Gracias por su compra.");
    }
}
