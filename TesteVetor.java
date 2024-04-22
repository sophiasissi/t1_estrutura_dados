import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class TesteVetor {
    public static void main(String[] args) {
        int[] vetores = {200000, 400000, 600000, 800000, 1000000, 1200000, 1400000};
        long[] tempo_bubble = new long[vetores.length];
        long[] tempo_insert = new long[vetores.length];
        long[] tempo_select = new long[vetores.length];
        int testes = 20; 

        try {
            FileWriter writer = new FileWriter("dados.csv");

            writer.append("Tamanho do Vetor,Tempo Bubble (ms),Tempo Insertion (ms),Tempo Selection (ms)\n");

            for (int i = 0; i < vetores.length; i++) {
                MeuVetor v = new MeuVetor(vetores[i]);

                for (int j = 0; j < testes; j++) {
                    //BubbleSort
                    v.preencheVetor();
                    long inicio_b = new Date().getTime();
                    v.bubbleSort();
                    long fim_b = new Date().getTime();
                    tempo_bubble[i] += (fim_b - inicio_b);
                    v.esvaziaVetor();

                    //InsertionSort
                    v.preencheVetor();
                    long inicio_i = new Date().getTime();
                    v.insertionSort();
                    long fim_i = new Date().getTime();
                    tempo_insert[i] += (fim_i - inicio_i);
                    v.esvaziaVetor();
                    
                    //SelectionSort
                    v.preencheVetor();
                    long inicio_s = new Date().getTime();
                    v.selectionSort();
                    long fim_s = new Date().getTime();
                    tempo_select[i] += (fim_s - inicio_s);
                    v.esvaziaVetor();
                    
                }

                writer.append(String.format("%d,%d,%d,%d\n", vetores[i], tempo_bubble[i], tempo_insert[i], tempo_select[i]));

                //Tabela de tempos para cada método
                System.out.println("Tamanho do Vetor | Tempo Bubble (ms) | Tempo Insertion (ms) | Tempo Selection (ms)");
                System.out.printf("%16d | %17d | %20d | %20d\n", vetores[i], tempo_bubble[i], tempo_insert[i], tempo_select[i]);

            }
            writer.flush();
            writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}

