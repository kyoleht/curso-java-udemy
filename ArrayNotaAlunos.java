public class ArrayNotaAlunos {
    double[] ArrayNotaAlunos = new double[5];
    
    public ArrayNotaAlunos() {
        ArrayNotaAlunos[0] = 7.5;
        ArrayNotaAlunos[1] = 8.0;
        ArrayNotaAlunos[2] = 6.5;
        ArrayNotaAlunos[3] = 9.0;
        ArrayNotaAlunos[4] = 5.5;
        
        for (int i = 0; i < ArrayNotaAlunos.length; i++) {
            System.out.println("Nota do aluno " + (i + 1) + ": " + ArrayNotaAlunos[i]);
        }
    }
    public static void main(String[] args) {
        new ArrayNotaAlunos();
    }
}
