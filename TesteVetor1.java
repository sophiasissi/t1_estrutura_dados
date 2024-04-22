import java.util.Date;

public class TesteVetor1 {
    public static void main(String[] args) {
        int[] vetores = {200000, 400000, 600000, 800000, 1000000, 1200000, 1400000};
        long[] tempo_bubble = new long[vetores.length];
        long[] tempo_insert = new long[vetores.length];
        long[] tempo_select = new long[vetores.length];
        int testes = 20; 

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
        }

        System.out.println("Tempo total de cada tamanho de vetor nos 20 testes do método bubble:  ");
        for ( int i = 0; i < tempo_bubble.length; i++) {
            System.out.println(tempo_bubble[i]);
        }
        
        System.out.println("Tempo total de cada tamanho de vetor nos 20 testes do método insert:  ");
        for ( int i = 0; i < tempo_insert.length; i++) {
            System.out.println(tempo_insert[i]);
        }

        System.out.println("Tempo total de cada tamanho de vetor nos 20 testes do método select:  ");
        for ( int i = 0; i < tempo_select.length; i++) {
            System.out.println(tempo_select[i]);
        }

    }
}

        


            


        // MeuVetor v_200 = new MeuVetor(200000);
        // MeuVetor v_400 = new MeuVetor(400000);
        // MeuVetor v_600 = new MeuVetor(600000);
        // MeuVetor v_800 = new MeuVetor(800000);
        // MeuVetor v_1m = new MeuVetor(1000000);
        // MeuVetor v_12m = new MeuVetor(1200000);
        // MeuVetor v_14m = new MeuVetor(1400000);
        // int testes = 20; 

        // //TESTES COM O VETOR DE 200.000 ELEMENTOS
        // //BubbleSort  
        // long tempo_bubble_200 = 0;
        // for (int i = 0; i < testes; i++) {
        //     v_200.preencheVetor();
        //     long inicio = new Date().getTime();
        //     v_200.bubbleSort();
        //     long fim = new Date().getTime();
        //     tempo_bubble_200 += (fim - inicio);
        //     v_200.esvaziaVetor();
        // }
        // System.out.println("Demorou " + tempo_bubble_200 + " ms nos 20 testes do método bubble no vetor de 200.000");

        // //InsertionSort
        // long tempo_insert_200 = 0;    
        // for (int i = 0; i < testes; i++) {
        //     v_200.preencheVetor();
        //     long inicio = new Date().getTime();
        //     v_200.insertionSort();
        //     long fim = new Date().getTime();
        //     tempo_insert_200 += (fim - inicio);
        //     v_200.esvaziaVetor();
        // }
        // System.out.println("Demorou " + tempo_insert_200 + " ms nos 20 testes do método insert no vetor de 200.000");
        
        // //SelectionSort
        // long tempo_select_200 = 0;    
        // for (int i = 0; i < testes; i++) {
        //     v_200.preencheVetor();
        //     long inicio = new Date().getTime();
        //     v_200.selectionSort();
        //     long fim = new Date().getTime();
        //     tempo_select_200 += (fim - inicio);
        //     v_200.esvaziaVetor();
        // }
        // System.out.println("Demorou " + tempo_select_200 + " ms nos 20 testes do método select no vetor de 200.000");

//     } 
// }