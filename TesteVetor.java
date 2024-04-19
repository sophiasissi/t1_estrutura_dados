import java.util.Date;

public class TesteVetor {
    public static void main(String[] args) {
        MeuVetor v_200 = new MeuVetor(200000);
        // MeuVetor v_400 = new MeuVetor(400000);
        // MeuVetor v_600 = new MeuVetor(600000);
        // MeuVetor v_800 = new MeuVetor(800000);
        // MeuVetor v_1m = new MeuVetor(1000000);
        // MeuVetor v_12m = new MeuVetor(1200000);
        // MeuVetor v_14m = new MeuVetor(1400000);
        int testes = 20; 

        //TESTES COM O VETOR DE 200.000 ELEMENTOS
        //BubbleSort  
        long tempo_bubble_200 = 0;
        for (int i = 0; i < testes; i++) {
            v_200.preencheVetor();
            long inicio = new Date().getTime();
            v_200.bubbleSort();
            long fim = new Date().getTime();
            tempo_bubble_200 += (fim - inicio);
            v_200.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_bubble_200 + " ms nos 20 testes do método bubble");

        //InsertionSort
        long tempo_insert_200 = 0;    
        for (int i = 0; i < testes; i++) {
            v_200.preencheVetor();
            long inicio = new Date().getTime();
            v_200.insertionSort();
            long fim = new Date().getTime();
            tempo_insert_200 += (fim - inicio);
            v_200.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_insert_200 + " ms nos 20 testes do método insert");

    //     //SelectionSort
        long tempo_select_200 = 0;    
        for (int i = 0; i < testes; i++) {
            v_200.preencheVetor();
            long inicio = new Date().getTime();
            v_200.selectionSort();
            long fim = new Date().getTime();
            tempo_select_200 += (fim - inicio);
            v_200.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_select_200 + " ms nos 20 testes do método select");




    }
}

