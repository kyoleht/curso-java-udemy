abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}

class Onibus extends Veiculo {
    public int assentos;
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;

    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Assentos: " + assentos);
    }
}

class Caminhao extends Veiculo {
    public int eixos;
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Eixos: " + eixos);
    }
}

class GerenciadorVeiculos {
    public static void main(String[] args) {
        Onibus myBus = new Onibus("BUS1234" ,2020, 60);
        Caminhao myTruck = new Caminhao("TRK5678", 2025, 6);

        myBus.exibirInformacoes();
        myTruck.exibirInformacoes();
    }
}

