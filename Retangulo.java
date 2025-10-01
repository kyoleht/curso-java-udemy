abstract class FiguraGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

public class Retangulo extends FiguraGeometrica {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
    }
}