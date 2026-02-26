package ejercicio3;

public class App {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3 - Línea modificada en feature-conflict");
        lineaFeature();
        lineaMain();
    }
    public static void lineaFeature() {
        System.out.println("Línea agregada en feature-no-conflict");
    }
    public static void lineaMain() {
        System.out.println("Línea agregada en main");
    }
}