public class Carros {
    String marca;
    String modelo;
    int ano;

    public Carros() {}

    public Carros(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carros(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}
