package sesion11;

public class Singleton {

    /**
     * La única instancia de la clase Singleton.
     */
    private static Singleton instance;

    /**
     * Constructor privado para prevenir la instanciación directa.
     */
    private Singleton() {
    }

    /**
     * Método para obtener la única instancia de la clase Singleton.
     * Si la instancia aún no existe, se crea una nueva.
     *
     * @return La única instancia de Singleton.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}