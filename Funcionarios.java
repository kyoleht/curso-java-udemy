

 class Funcionarios {
    String nome;
    double salario;
    double valor;
    public void addAumento (double valor) {
        salario += valor;
    }
    public void ganhoAnual() {
        System.out.println("Ganho anual: " + (salario * 12));
    }
}

class Assistente extends Funcionarios {
    public void ganhoAnual() {
        super.ganhoAnual();
        double bonus = 1000;
        System.out.println("Bônus anual: " + (salario * 12 + bonus));
    }
}