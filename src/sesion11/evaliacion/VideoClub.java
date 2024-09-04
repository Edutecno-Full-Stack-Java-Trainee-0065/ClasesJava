package sesion11.evaliacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class VideoClub {
    private static VideoClub instance;
    private String tipoCobro;
    private List<Pelicula> peliculas = new ArrayList<>();

    {
        Calendar cal = Calendar.getInstance();

        // 1. El Padrino
        cal.set(1972, Calendar.MARCH, 24);
        peliculas.add(new Pelicula("El Padrino", cal.getTime(), true));

        // 2. Titanic
        cal.set(1997, Calendar.DECEMBER, 19);
        peliculas.add(new Pelicula("Titanic", cal.getTime(), true));

        // 3. Avatar
        cal.set(2009, Calendar.DECEMBER, 18);
        peliculas.add(new Pelicula("Avatar", cal.getTime(), true));

        // 4. Star Wars: Episodio IV - Una nueva esperanza
        cal.set(1977, Calendar.MAY, 25);
        peliculas.add(new Pelicula("Star Wars: Episodio IV - Una nueva esperanza", cal.getTime(), false));

        // 5. Jurassic Park
        cal.set(1993, Calendar.JUNE, 11);
        peliculas.add(new Pelicula("Jurassic Park", cal.getTime(), true));

        // 6. El Señor de los Anillos: El retorno del Rey
        cal.set(2003, Calendar.DECEMBER, 17);
        peliculas.add(new Pelicula("El Señor de los Anillos: El retorno del Rey", cal.getTime(), true));

        // 7. Forrest Gump
        cal.set(1994, Calendar.JULY, 6);
        peliculas.add(new Pelicula("Forrest Gump", cal.getTime(), false));

        // 8. Inception
        cal.set(2010, Calendar.JULY, 16);
        peliculas.add(new Pelicula("Inception", cal.getTime(), true));

        // 9. Matrix
        cal.set(1999, Calendar.MARCH, 31);
        peliculas.add(new Pelicula("Matrix", cal.getTime(), true));

        // 10. Pulp Fiction
        cal.set(1994, Calendar.OCTOBER, 14);
        peliculas.add(new Pelicula("Pulp Fiction", cal.getTime(), false));
    }

    private VideoClub() {}

    public static VideoClub getInstance() {
        if (instance == null) {
            instance = new VideoClub();
        }
        return instance;
    }

    private void listarPeliculas() {
        System.out.println("Lista de todas las peliculas.");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    private void listarPeliculasDisponibles() {
        System.out.println("Peliculas disponibles.");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.isDisponible()) {
                System.out.println(pelicula);
            }
        }
    }

    private Pelicula buscarpelicula(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return pelicula;
            }
        }
        return null;
    }

    private void arrendarPelicula(Scanner sc) {
        listarPeliculasDisponibles();
        System.out.println("Ingrese el titulo de la pelicula que desea arrendar: ");
        String titulo = sc.nextLine();

        tipoPago(sc); // Asigna el tipo de instancia de pago a usar.

        Pelicula pelicula = buscarpelicula(titulo);
        if (pelicula != null && pelicula.isDisponible()) {
            pelicula.setDisponible(false);

            Cobro cobro = crearCobro();
            if (cobro != null) {
                System.out.println(cobro.pago());
                System.out.println("Titulo: " + pelicula.getTitulo() + " ha sido arrendado exitosamente.");
            } else {
                System.out.println("Tipo de cobro no valido.");
            }
        } else {
            System.out.println("El pelicula no existe o no esta disponible.");
        }
    }

    private void devolverPelicula(Scanner sc) {
        System.out.println("Ingrese el titulo de la pelicula que desea devolver: ");
        String titulo = sc.nextLine();

        Pelicula pelicula = buscarpelicula(titulo);
        if (pelicula != null && !pelicula.isDisponible()) {
            pelicula.setDisponible(true);
            System.out.println("Ha devuelto la pelicula: " + pelicula.getTitulo());
        } else {
            System.out.println("La pelicula no esta arrendada o no existe.");
        }
    }

    private Cobro crearCobro() {
        if (tipoCobro == null) {
            throw new IllegalStateException("Tipo de cobro no establecido");
        }
        switch (tipoCobro.toLowerCase()) {
            case "efectivo":
                return new CobroEfectivo();
            case "tarjeta":
                return new CobroTarjeta();
            default:
                return null;
        }
    }

    private void tipoPago(Scanner sc) {
        System.out.println("""
                Selecciona una opcion de pago:
                1. Efectivo.
                2. Tarjeta de Credito.
                """);
        String pago = sc.nextLine();
        if (pago.equals("1")) {
            this.tipoCobro= "Efectivo";
        } else if (pago.equals("2")) {
            this.tipoCobro = "Tarjeta";
        }
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n--- Menú VideoClub ---");
            System.out.println("1. Listar todas las películas");
            System.out.println("2. Listar películas disponibles");
            System.out.println("3. Arrendar película");
            System.out.println("4. Devolver película");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de linea fantasma...

            switch (opcion) {
                case 1:
                    listarPeliculas();
                    break;
                case 2:
                    listarPeliculasDisponibles();
                    break;
                case 3:
                    arrendarPelicula(sc);
                    break;
                case 4:
                    devolverPelicula(sc);
                    break;
                case 5:
                    System.out.println("Usted esta saliendo de la aplicacion...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opcion no valida, ingrese una opcion correcta...");
            }
        }
    }

}
