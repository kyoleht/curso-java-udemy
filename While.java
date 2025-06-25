// O objetivo deste exercício é criar um programa em Java que conte quantos doces o filho pode comer enquanto a condição estabelecida pela mãe for verdadeira (ou seja, no máximo 3 doces).

public class While {
    public static void main(String[] args) {
        var contadorDoces = 3;
        var crianca = 0;

        while (crianca < contadorDoces) {
            crianca++;

            System.out.println("A criança comeu " + crianca + " doces");
        }
    }
}

