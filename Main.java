interface Veiculos {
    void iniciar();
    void parar();
    void buzinar();
}

class Carro implements Veiculos {
    @Override
    public void iniciar() {
        System.out.println("O carro está iniciando.");
    }

    @Override
    public void parar() {
        System.out.println("O carro está parando.");
    }

    @Override
    public void buzinar() {
        System.out.println("O carro está buzinando: BEEP BEEP!");
    }
}

class Caminhao implements Veiculos {
    @Override
    public void iniciar() {
        System.out.println("O caminhão está iniciando.");
    }

    @Override
    public void parar() {
        System.out.println("O caminhão está parando.");
    }

    @Override
    public void buzinar() {
        System.out.println("O caminhão está buzinando: BEEP BEEP!");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.iniciar();
        meuCarro.buzinar();
        meuCarro.parar();

        Caminhao meuCaminhao = new Caminhao();
        meuCaminhao.iniciar();
        meuCaminhao.buzinar();
        meuCaminhao.parar();
    }
}