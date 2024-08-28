package evaluacion5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlProductos {

    // Se declara una lista estatica.
    private static List<Producto> productos = new ArrayList<>();

    // Se agregan valores por defecto al arreglo
    static {
        productos.add(new Producto("Chocolate", 500, "Chocolate amargo, 500gr"));
        productos.add(new Producto("Leche", 800, "leche entera, 1lt"));
        productos.add(new Producto("Arroz", 900, "Arroz grado 2, 1kg"));
    }

    private void verProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    private void agregarProductos(Scanner sc) {
        if (productos.size() >= 7) {
            System.out.println("No se pueden agregar mas de 7 productos y actualmente hay: " + productos.size());
            return;
        }
        sc.nextLine();

        System.out.println("Ingrese el nombre del nuevo producto: ");
        String nombre = sc.nextLine();

        int precio = 0;
        boolean precioValido = false;

        while (!precioValido) {
            System.out.println("Ingrese el precio del nuevo producto(min: 100 - max: 100000): ");
            precio = sc.nextInt();

            if (precio >= 100 && precio <= 100000) {
                precioValido = true;
            } else {
                System.out.println("Precio no valido, ingrese un valor entre 100 y 100000");
            }

        }

        sc.nextLine();

        System.out.println("Ingrese el descripcion del producto: ");
        String descripcion = sc.nextLine();

        productos.add(new Producto(nombre, precio, descripcion));
        System.out.println("Producto agregado con exito.");
    }

    private void editarProucto(Scanner sc) {
        // revisar lista
        if (productos.isEmpty()) {
            System.out.println("No hay productos para editar.");
            return;
        }

        // seleccionar productos
        System.out.println("Seleccione el numero del producto a editar: ");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i).getNombre());
        }
        int seleccion = sc.nextInt() - 1;

        // validar seleccion
        if (seleccion < 0 || seleccion >= productos.size()) {
            System.out.println("Seleccion no valida, se encuentra fuera de los indices habilitados.");
            return;
        }
        Producto productoSeleccionado = productos.get(seleccion);
        sc.nextLine();

        // re-asignar los valores
        System.out.println("Ingrese el nuevo nombre del producto (actual: " + productoSeleccionado.getNombre() + ")");
        String nombre = sc.nextLine();

        int precio = 0;
        boolean precioValido = false;

        while (!precioValido) {
            System.out.println("Ingrese el precio del nuevo producto(min: 100 - max: 100000): ");
            precio = sc.nextInt();

            if (precio >= 100 && precio <= 100000) {
                precioValido = true;
            } else {
                System.out.println("Precio no valido, ingrese un valor entre 100 y 100000");
            }

        }

        sc.nextLine(); // se limpia el scanner

        System.out.println("Ingrese la nueva descripcion del producto (actual: " + productoSeleccionado.getDescripcion() + ")");
        String descripcion = sc.nextLine();

        // re-insertar producto
        productoSeleccionado.setNombre(nombre);
        productoSeleccionado.setValor(precio);
        productoSeleccionado.setDescripcion(descripcion);

        System.out.println("Producto actualizado con exito.");
    }

    private int menu(Scanner sc, String menu) {
        int opcion = 0;
        boolean opcionValida = false;

        while(!opcionValida) {
            System.out.println(menu);
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                opcionValida = true;
            } else {
                System.out.println("Opcion no permitida, ingrese una opcion entre 1 y 4.");
            }
        }
        return opcion;
    }

    public void gestionarProductos() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            String mensaje = """
                    1- Ver productos
                    2- Agregar productos
                    3- Editar productos
                    4- Salir
                    """;

            int opcion = menu(sc, mensaje);
            switch (opcion) {
                case 1:
                    verProductos();
                    break;
                case 2:
                    agregarProductos(sc);
                    break;
                case 3:
                    editarProucto(sc);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
        sc.close();
    }
}
