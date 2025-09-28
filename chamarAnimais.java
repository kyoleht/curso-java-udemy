interface EmitirSom {
    void emitirSom(); // método abstrato
}

class Cachorro implements EmitirSom {
    public void emitirSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

class Gato implements EmitirSom {
    public void emitirSom() {
        System.out.println("O gato faz: Miau Miau!");
    }
}

public class chamarAnimais {
    public static void main(String[] args) {
        EmitirSom Boby = new Cachorro();
        Boby.emitirSom();

        EmitirSom Yuumi = new Gato();
        Yuumi.emitirSom();
    }
}