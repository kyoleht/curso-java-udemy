public class Aplicacao {
    public static void main(String[] args) {
        Carros car1 = new Carros("Ferrari", "Puro Sangue");
        car1.exibirDetalhes();

        Carros car2 = new Carros("Lamborghini", "Revuelto", 2024);
        car2.exibirDetalhes();
        
        Carros car3 = new Carros();
        car3.exibirDetalhes();
    }
}