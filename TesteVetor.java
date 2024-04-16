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

        v_200.preencheVetor();

        //Testes com BubbleSort  
        long tempo_total = 0;    

        for (int i = 0; i < testes; i++) {
            long inicio = new Date().getTime();
            v_200.bubbleSort();
            long fim = new Date().getTime();

            tempo_total += (fim - inicio);
        }

        long media_tempo_bubble = tempo_total / testes; 
        System.out.println("Tamanho  = 200.000, demorou " + media_tempo_bubble + " ms em cada teste");

        // System.out.println(v_200.toString());
    }

}

