public class AplicacaoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Rafael";
        pessoa1.setIdade(21);
        pessoa1.setEndereco("Rua A, 1234");
        pessoa1.setTelefone(1234567890);

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());
    }
}


