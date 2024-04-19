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
        long tempo_bubble_200 = 0;
        for (int i = 0; i < testes; i++) {
            v_200.preencheVetor();
            long inicio = new Date().getTime();
            v_200.bubbleSort();
            long fim = new Date().getTime();
            tempo_bubble_200 += (fim - inicio);
            v_200.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_bubble_200 + " ms nos 20 testes do método bubble no vetor de 200.000");

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
        System.out.println("Demorou " + tempo_insert_200 + " ms nos 20 testes do método insert no vetor de 200.000");
        
        //SelectionSort
        long tempo_select_200 = 0;    
        for (int i = 0; i < testes; i++) {
            v_200.preencheVetor();
            long inicio = new Date().getTime();
            v_200.selectionSort();
            long fim = new Date().getTime();
            tempo_select_200 += (fim - inicio);
            v_200.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_select_200 + " ms nos 20 testes do método select no vetor de 200.000");




        //TESTES COM O VETOR DE 400.000 ELEMENTOS
        //BubbleSort  
        long tempo_bubble_400 = 0;
        for (int i = 0; i < testes; i++) {
            v_400.preencheVetor();
            long inicio = new Date().getTime();
            v_400.bubbleSort();
            long fim = new Date().getTime();
            tempo_bubble_400 += (fim - inicio);
            v_400.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_bubble_400 + " ms nos 20 testes do método bubble no vetor de 400.000");

        //InsertionSort
        long tempo_insert_400 = 0;    
        for (int i = 0; i < testes; i++) {
            v_400.preencheVetor();
            long inicio = new Date().getTime();
            v_400.insertionSort();
            long fim = new Date().getTime();
            tempo_insert_400 += (fim - inicio);
            v_400.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_insert_400 + " ms nos 20 testes do método insert no vetor de 400.000");

    //     //SelectionSort
        long tempo_select_400 = 0;    
        for (int i = 0; i < testes; i++) {
            v_400.preencheVetor();
            long inicio = new Date().getTime();
            v_400.selectionSort();
            long fim = new Date().getTime();
            tempo_select_400 += (fim - inicio);
            v_400.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_select_400 + " ms nos 20 testes do método select no vetor de 400.000");





        //TESTES COM O VETOR DE 600.000 ELEMENTOS
        //BubbleSort  
        long tempo_bubble_600 = 0;
        for (int i = 0; i < testes; i++) {
            v_600.preencheVetor();
            long inicio = new Date().getTime();
            v_600.bubbleSort();
            long fim = new Date().getTime();
            tempo_bubble_600 += (fim - inicio);
            v_600.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_bubble_600 + " ms nos 20 testes do método bubble no vetor de 600.000");

        //InsertionSort
        long tempo_insert_600 = 0;    
        for (int i = 0; i < testes; i++) {
            v_600.preencheVetor();
            long inicio = new Date().getTime();
            v_600.insertionSort();
            long fim = new Date().getTime();
            tempo_insert_600 += (fim - inicio);
            v_600.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_insert_600 + " ms nos 20 testes do método insert no vetor de 600.000");

        //SelectionSort
        long tempo_select_600 = 0;    
        for (int i = 0; i < testes; i++) {
            v_600.preencheVetor();
            long inicio = new Date().getTime();
            v_600.selectionSort();
            long fim = new Date().getTime();
            tempo_select_600 += (fim - inicio);
            v_600.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_select_600 + " ms nos 20 testes do método select no vetor de 600.000");







        //TESTES COM O VETOR DE 800.000 ELEMENTOS
        //BubbleSort  
        long tempo_bubble_800 = 0;
        for (int i = 0; i < testes; i++) {
            v_800.preencheVetor();
            long inicio = new Date().getTime();
            v_800.bubbleSort();
            long fim = new Date().getTime();
            tempo_bubble_800 += (fim - inicio);
            v_800.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_bubble_800 + " ms nos 20 testes do método bubble no vetor de 800.000");

        //InsertionSort
        long tempo_insert_800 = 0;    
        for (int i = 0; i < testes; i++) {
            v_800.preencheVetor();
            long inicio = new Date().getTime();
            v_800.insertionSort();
            long fim = new Date().getTime();
            tempo_insert_800 += (fim - inicio);
            v_800.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_insert_800 + " ms nos 20 testes do método insert no vetor de 800.000");

        //SelectionSort
        long tempo_select_800 = 0;    
        for (int i = 0; i < testes; i++) {
            v_800.preencheVetor();
            long inicio = new Date().getTime();
            v_800.selectionSort();
            long fim = new Date().getTime();
            tempo_select_800 += (fim - inicio);
            v_800.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_select_800 + " ms nos 20 testes do método select no vetor de 800.000");








        //TESTES COM O VETOR DE 1.000.000 ELEMENTOS
        //BubbleSort  
        long tempo_bubble_1m = 0;
        for (int i = 0; i < testes; i++) {
            v_1m.preencheVetor();
            long inicio = new Date().getTime();
            v_1m.bubbleSort();
            long fim = new Date().getTime();
            tempo_bubble_1m += (fim - inicio);
            v_1m.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_bubble_1m + " ms nos 20 testes do método bubble no vetor de 1.000.000");

        //InsertionSort
        long tempo_insert_1m = 0;    
        for (int i = 0; i < testes; i++) {
            v_1m.preencheVetor();
            long inicio = new Date().getTime();
            v_1m.insertionSort();
            long fim = new Date().getTime();
            tempo_insert_1m += (fim - inicio);
            v_1m.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_insert_1m + " ms nos 20 testes do método insert no vetor de 1.000.000");

        //SelectionSort
        long tempo_select_1m = 0;    
        for (int i = 0; i < testes; i++) {
            v_1m.preencheVetor();
            long inicio = new Date().getTime();
            v_1m.selectionSort();
            long fim = new Date().getTime();
            tempo_select_1m += (fim - inicio);
            v_1m.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_select_1m + " ms nos 20 testes do método select no vetor de 1.000.000");










        //TESTES COM O VETOR DE 1.200.000 ELEMENTOS
        //BubbleSort  
        long tempo_bubble_12m = 0;
        for (int i = 0; i < testes; i++) {
            v_12m.preencheVetor();
            long inicio = new Date().getTime();
            v_12m.bubbleSort();
            long fim = new Date().getTime();
            tempo_bubble_12m += (fim - inicio);
            v_12m.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_bubble_12m + " ms nos 20 testes do método bubble no vetor de 1.200.000");

        //InsertionSort
        long tempo_insert_12m = 0;    
        for (int i = 0; i < testes; i++) {
            v_12m.preencheVetor();
            long inicio = new Date().getTime();
            v_12m.insertionSort();
            long fim = new Date().getTime();
            tempo_insert_12m += (fim - inicio);
            v_12m.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_insert_12m + " ms nos 20 testes do método insert no vetor de 1.200.000");

        //SelectionSort
        long tempo_select_12m = 0;    
        for (int i = 0; i < testes; i++) {
            v_12m.preencheVetor();
            long inicio = new Date().getTime();
            v_12m.selectionSort();
            long fim = new Date().getTime();
            tempo_select_12m += (fim - inicio);
            v_12m.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_select_12m + " ms nos 20 testes do método select no vetor de 1.200.000");













        //TESTES COM O VETOR DE 1.400.000 ELEMENTOS
        //BubbleSort  
        long tempo_bubble_14m = 0;
        for (int i = 0; i < testes; i++) {
            v_14m.preencheVetor();
            long inicio = new Date().getTime();
            v_14m.bubbleSort();
            long fim = new Date().getTime();
            tempo_bubble_14m += (fim - inicio);
            v_14m.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_bubble_14m + " ms nos 20 testes do método bubble no vetor de 1.400.000");

        //InsertionSort
        long tempo_insert_14m = 0;    
        for (int i = 0; i < testes; i++) {
            v_14m.preencheVetor();
            long inicio = new Date().getTime();
            v_14m.insertionSort();
            long fim = new Date().getTime();
            tempo_insert_14m += (fim - inicio);
            v_14m.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_insert_14m + " ms nos 20 testes do método insert no vetor de 1.400.000");

        //SelectionSort
        long tempo_select_14m = 0;    
        for (int i = 0; i < testes; i++) {
            v_14m.preencheVetor();
            long inicio = new Date().getTime();
            v_14m.selectionSort();
            long fim = new Date().getTime();
            tempo_select_14m += (fim - inicio);
            v_14m.esvaziaVetor();
        }
        System.out.println("Demorou " + tempo_select_14m + " ms nos 20 testes do método select no vetor de 1.400.000");


    }
}

