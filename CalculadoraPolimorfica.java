abstract class Operacao {
    abstract int calcular();
    int a;
    int b;

    public Operacao(int a, int b) {
        this.a = a;
        this.b = b;
    }
}


class Soma extends Operacao {
    public Soma(int a, int b) {
        super(a, b);
    }

    @Override
    int calcular() {
        return a + b;
    }
}

class Subtracao extends Operacao {
    public Subtracao(int a, int b) {
        super(a, b);
    }

    @Override
    int calcular() {
        return a - b;
    }
}

class Multiplicacao extends Operacao {
    public Multiplicacao(int a, int b) {
        super(a, b);
    }

    @Override
    int calcular() {
        return a * b;
    }
}

class Divisao extends Operacao {
    public Divisao(int a, int b) {
        super(a, b);
    }

    @Override
    int calcular() {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}

public class CalculadoraPolimorfica {
    public static void main(String[] args) {
        Operacao[] operacoes = {
            new Soma(10, 5),
            new Subtracao(10, 5),
            new Multiplicacao(10, 5),
            new Divisao(10, 5)
        };

        String[] nomes = {"Soma", "Subtração", "Multiplicação", "Divisão"};

        for (int i = 0; i < operacoes.length; i++) {
            System.out.println(nomes[i] + ": " + operacoes[i].calcular());
        }
    }
}