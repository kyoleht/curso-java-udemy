// Demonstrar a aplicação prática dos comandos continue e break em uma estrutura de repetição em Java, usando uma lista de códigos de carteirinha de convênio médico. O objetivo é entender como essas palavras-chave podem controlar o fluxo de execução de um laço for e como elas podem ser usadas para pular iterações ou interromper o loop com base em condições específicas.

public class ContinueBreak {
    public static void main(String[] args) {
        var codigoDeSaida = 9;

        for (var codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {
            System.out.println(codigoCarteirinha);
            if (codigoCarteirinha == codigoDeSaida) {
                System.out.println("Encontrado. Encerrando...");
                break;
            } if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
                System.out.println("Código " + codigoCarteirinha + " aceito pelo Hospital Santa Clara.");
            } else {
                System.out.println("Código " + codigoCarteirinha + " não aceito.");
            }  
        } 
    }
}
