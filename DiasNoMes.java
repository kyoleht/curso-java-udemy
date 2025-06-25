public class DiasNoMes {
    public static void main(String[] args) {
        var mes = "Dezembro";
        System.out.println(mes);

        switch (mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> System.out.println("31 dias no mês");
            case "Abril", "Junho", "Setembro", "Novembro" -> System.out.println("30 dias no mês");
            case "Fevereiro" -> System.out.println("28 dias no mês");
                default -> System.out.println("Mês desconhecido");
        }
    }
}
