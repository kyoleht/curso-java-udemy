public class OperadoresUnários {
    public static void main(String[] args) {
        var a = 10; 
        var b = ++a; // ++a faz com que o b tenha o mesmo valor de a, acrescentado mais um -> 10 + 1;
        var c = a++; // a++ faz com que o c tenha o valor antigo de a e acrescente +1 ao a -> a = 12, c = 11 (valor antigo);

        System.out.println("valor de a: " + a);
        System.out.println("valor de b: " + b);
        System.out.println("valor de c: " + c);
    }
}
