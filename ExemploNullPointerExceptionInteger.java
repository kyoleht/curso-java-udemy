class ExemploNullPointerExceptionInteger {
    Integer numero = null;
    public static void main(String[] args) {
        try { 
            ExemploNullPointerExceptionInteger exemplo = new ExemploNullPointerExceptionInteger();
            System.out.println("O valor é: " + exemplo.numero.toString());
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar um objeto nulo.");
        }
    }

}
