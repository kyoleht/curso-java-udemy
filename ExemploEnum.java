public class ExemploEnum {
    enum JogosFavoritos {
        VALORANT, UNCHARTED, MINECRAFT, GOD_OF_WAR, LEAGUE_OF_LEGENDS, CSGO, FORZA_HORIZON;
    }

    public static void main(String[] args) {
        JogosFavoritos jogo1 = JogosFavoritos.VALORANT;
        System.out.println("Atualmente, meu jogo COMPETITIVO favorito é " + jogo1);

        JogosFavoritos jogo2 = JogosFavoritos.UNCHARTED;
        System.out.println("Meu jogo SINGLE favorito é " + jogo2);
    }
}
