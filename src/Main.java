
abstract class Figura {
    // Método abstracto para el cálculo del área
    public abstract double area();

    // Método abstracto para el cálculo del perímetro
    public abstract double perimetro();
}

// Clase Círculo que hereda de Figura
class Circulo extends Figura {
    private double radio; // Atributo radio del círculo

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para obtener el radio del círculo
    public double getRadio() {
        return radio;
    }

    // Método para establecer el radio del círculo
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementación del método para calcular el área del círculo
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    // Implementación del método para calcular el perímetro del círculo
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(5.0); // Crear un círculo con radio 5.0
        System.out.println("Área del círculo: " + miCirculo.area());
        System.out.println("Perímetro del círculo: " + miCirculo.perimetro());
    }
}
