class Veiculo {
    public void acelerar() {
        System.out.println("Veículo acelerando");
    }
}

class Carro extends Veiculo {
    @Override
    public void acelerar() {
        super.acelerar();
        System.out.println("Carro acelerando");
        
    }
}

