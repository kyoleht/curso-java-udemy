
/* public class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco; // default

    public void construtor1() {
        System.out.println("parte 1 do código");
    }

    public void construtor2(String titulo, String autor) {
        System.out.println("parte 2 do código");
    }
}




Crie uma classe Livro com os seguintes atributos: titulo, autor, anoPublicacao e preco. Utilize diferentes modificadores de acesso para cada atributo e implemente três construtores diferentes para a classe:

Um construtor "padrão" que não recebe parâmetros.

Um construtor que recebe titulo e autor.

Um construtor que recebe titulo, autor, anoPublicacao e preco.

Passos para Realizar o Exercício
Crie uma nova classe Java chamada Livro.

Declare os atributos titulo, autor, anoPublicacao e preco na classe Livro com os seguintes modificadores de acesso:

titulo: public

autor: private

anoPublicacao: protected

preco: default (sem modificador)

Implemente os três construtores na classe Livro. Esses construtores permitem criar objetos Livro com diferentes níveis de detalhe, dependendo das informações disponíveis no momento da criação.

Construtor "padrão": Inicializa os atributos titulo, autor, anoPublicacao e preco com valores padrão (“Desconhecido”, “Desconhecido”, 0, 0.0).

Construtor com dois parâmetros: Permite definir os atributos titulo e autor, enquanto anoPublicacao e preco são inicializados com valores padrão (0 e 0.0).

Construtor com quatro parâmetros: Permite definir todos os atributos (titulo, autor, anoPublicacao e preco) com valores fornecidos.

Crie uma classe Aplicacao com o método main para testar os diferentes construtores e acessar diretamente as variáveis membro.
*/