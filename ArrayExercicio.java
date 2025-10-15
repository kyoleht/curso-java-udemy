
class ArrayExercicio {
     int[] numeros = new int[5];

     public static int acessarElemento(int[] numeros, int indice) {
        try {
            return numeros[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
            return -1; // "-1" indica erro
        }
}
     public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Acessando elemento no índice 2: " + acessarElemento(numeros, 2));

        // acessando um índice inválido
        System.out.println("Acessando elemento no índice 10: " + acessarElemento(numeros, 10));
    } 
}
