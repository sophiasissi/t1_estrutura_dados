import java.util.Date;

public class TesteVetor {
    public static void main(String[] args) {
        MeuVetor v_200 = new MeuVetor(200000);
        MeuVetor v_400 = new MeuVetor(400000);
        MeuVetor v_600 = new MeuVetor(600000);
        MeuVetor v_800 = new MeuVetor(800000);
        MeuVetor v_1m = new MeuVetor(1000000);
        MeuVetor v_12m = new MeuVetor(1200000);
        MeuVetor v_14m = new MeuVetor(1400000);
        int testes = 20;

        //TESTES COM O VETOR DE 200.000 ELEMENTOS
        //BubbleSort  
        long tempo_total_bubble = 0;    
        for (int i = 0; i < testes; i++) {
            v_200.preencheVetor();
            long inicio = new Date().getTime();
            v_200.bubbleSort();
            long fim = new Date().getTime();
            tempo_total_bubble += (fim - inicio);
            v_200.esvaziaVetor();
        }
        long media_tempo_bubble = tempo_total_bubble / testes; 
        System.out.println("Tamanho  = 200.000, demorou " + media_tempo_bubble + " ms em cada teste");

        //InsertionSort
        long tempo_total_insert = 0;    
        for (int i = 0; i < testes; i++) {
            v_200.preencheVetor();
            long inicio = new Date().getTime();
            v_200.insertionSort();
            long fim = new Date().getTime();
            tempo_total_insert += (fim - inicio);
            v_200.esvaziaVetor();
        }
        long media_tempo_insert = tempo_total_insert/ testes; 
        System.out.println("Tamanho  = 200.000, demorou " + media_tempo_insert + " ms em cada teste");


        //SelectionSort
        long tempo_total_select = 0;    
        for (int i = 0; i < testes; i++) {
            v_200.preencheVetor();
            long inicio = new Date().getTime();
            v_200.selectionSort(14, 13);
            long fim = new Date().getTime();
            tempo_total_select += (fim - inicio);
            v_200.esvaziaVetor();
        }
        long media_tempo_select = tempo_total_select/ testes; 
        System.out.println("Tamanho  = 200.000, demorou " + media_tempo_select + " ms em cada teste");




    }
}

