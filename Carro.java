    public class Carro {  

    int quantidadeCavalos;
 
            public static void main(String[] args) {  

                Carro dodgeCharger = new Carro();
                dodgeCharger.quantidadeCavalos = 800;

                Carro mustangGt = new Carro();
                mustangGt.quantidadeCavalos = 488;

                System.out.println("O Dodge Charger possui " + dodgeCharger.quantidadeCavalos + " cavalos");
                System.out.println("O Mustang GT possui " + mustangGt.quantidadeCavalos + " cavalos");
    }       
}   