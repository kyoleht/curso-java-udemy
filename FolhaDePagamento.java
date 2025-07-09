import empresa.dados.*;

class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Sérgio", 3500);
        System.out.println(func.obterInfo());

        func.aumentarSalario(3000);
        System.out.println(func.salario);
    }
}

