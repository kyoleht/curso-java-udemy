import empresa.dados.*;

class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Sérgio", 3500.0);
        System.out.println(func.obterInfo());
        
        double aumento = 400.0;
        System.out.println(func.obterInfo());

        System.out.printf("Porcentagem de aumento: %.2f%%\n", func.calcularPorcentagemAumento(aumento));

        func.aumentarSalario(aumento);
        System.out.println(func.obterInfo());
    }
}

