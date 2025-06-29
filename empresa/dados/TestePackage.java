package empresa.dados;

public class TestePackage {
    public TestePackage() {
        Funcionario func = new Funcionario(); // tendo acesso ao protected Funcionario
        System.out.println(func);
    }
}
