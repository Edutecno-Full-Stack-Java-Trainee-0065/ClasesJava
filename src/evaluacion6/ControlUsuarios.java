package evaluacion6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlUsuarios {

    // Genero una lista para almacenar personas, al ser static este valor se comparte
    // en todas las instancias de la clase ControlUsuarios
    private static List<Persona> personas = new ArrayList<>();
    // Genera valores para inicializar la lista con contenido.
    static {
        personas.add(new Persona("usuario1", "contra1", "Rigoberto Del Campo", "04-03-1995"));
        personas.add(new Persona("usuario2", "contra2", "Gaty el Caracol", "06-12-1997"));
        personas.add(new Persona("usuario3", "contra3", "Patricio Estrella", "04-10-1990"));

    }

    private void mostrarLista() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void registrarUsuarios() {
        if (personas.size() > 10) {
            System.out.println("La lista debe de contener un maximo de 10 registros.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        String usuario;
        String contrasena; // VALIDAR CONTRASEÑA
        String nombreCompleto;
        String fechaNacimiento; // VALIDAR FECHA DE NACIMIENTO

        System.out.println("Bienvenido al gestor de usuarios\n" );

        System.out.println("Ingrese nuevo nombre de usuario: ");
        usuario = sc.nextLine();

        do {
            System.out.print("Ingrese contraseña: ");
            contrasena = sc.nextLine();
        } while (!validarContrasenaCompleta(contrasena));

        System.out.println("Ingrese nombre completo: ");
        nombreCompleto = sc.nextLine();

        do {
            System.out.println("Ingrese fecha de nacimiento (formato: dd-mm-yyyy): ");
            fechaNacimiento = sc.nextLine();
            if (!validarFormatoFechaNacimiento(fechaNacimiento)) {
                System.out.println("Fecha de nacimiento inválida. Intente de nuevo.");
            } else {
                break; // Si la fecha es válida, salir del bucle
            }
        } while (true);

        sc.close();
        personas.add(new Persona(usuario, contrasena, nombreCompleto, fechaNacimiento));

        System.out.println("Usuario registrado exitosamente");
        mostrarLista();
    }

    private boolean validarContrasenaCompleta(String contrasena) {
        if (!validarLongitudMinima(contrasena, 10)) {
            System.out.println("La contraseña debe tener al menos 10 caracteres.");
            return false;
        }
        if (!validarMayusculasMinimas(contrasena, 2)) {
            System.out.println("La contraseña debe contener al menos 2 letras mayúsculas.");
            return false;
        }
        if (!validarCaracteresNoLetristicos(contrasena)) {
            System.out.println("La contraseña debe contener al menos 3 caracteres que sean números o símbolos.");
            return false;
        }
        return true;
    }

    private boolean validarLongitudMinima(String contrasena, int min) {
        return contrasena.length() >= min;
    }

    private boolean validarMayusculasMinimas(String contrasena, int min) {
        int contador = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isUpperCase(contrasena.charAt(i))) {
                contador++;
            }
        }
        return contador >= min;
    }

    private boolean validarCaracteresNoLetristicos(String contrasena) {
        int contador = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (Character.isDigit(c) || !Character.isLetter(c)) {
                contador++;
            }
        }
        return contador >= 3;
    }

    private boolean validarFormatoFechaNacimiento(String fechaNacimiento) {
        // Validación básica para asegurarse de que la fecha tenga el formato correcto
        return fechaNacimiento.matches("\\d{2}-\\d{2}-\\d{4}");
    }
}
