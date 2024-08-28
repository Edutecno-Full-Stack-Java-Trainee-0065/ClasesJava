package comprobacion;

public class Calculo {

    public void imc(float peso, float altura) {
        float imc = peso / (altura * altura);
        System.out.println("El IMC es de: " + imc);
    }

    public void verificacionEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else if (edad < 18) {
            System.out.println("No es mayor de edad");
        }
    }

}
