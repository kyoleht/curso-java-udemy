public class Personagem {
    public String nome;
    public int numeroDePoder;

    public static void main(String[] args) {
        Personagem perso1 = new Personagem();
        perso1.nome = "Goku";
        perso1.numeroDePoder = 8001;
        // antes de atualizar
        System.out.println("Nome do Persoagem: " + perso1.nome);
        System.out.println("Numero de Poder aumentado: " + perso1.numeroDePoder);

        // mudanças de informações
        aumentarNumerodePoder(perso1); // chamando o método para aumentar o poder
        mudarNome(perso1);

        // depois de atualizar
        System.out.println("Nome do Persoagem: " + perso1.nome);
        System.out.println("Numero de Poder aumentado: " + perso1.numeroDePoder);
    }

    public static void mudarNome(Personagem perso1) {
        perso1.nome = "Vegeta";
    }
    
    public static void aumentarNumerodePoder(Personagem perso1) {
        perso1.numeroDePoder += 1000;
    }

    
    
}
