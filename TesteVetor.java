public class TesteVetor {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(5);

        v1.adiciona(3);
        // v1.adiciona(9);
        v1.adiciona(6);
        v1.adiciona(9);
        v1.adiciona(15);
        // v1.adiciona(9);


        System.out.println(v1.toString());
        System.out.println(v1.length);

        // System.out.println(v1.adiciona(12,0));
        // System.out.println("Apareceu " + v1.aparece(9) + " vezes");
        // System.out.println(v1.remove(3));
        // System.out.println(v1.primeiraOco(9));
        
        System.out.println(v1.removePrimeiraOco(9));

        // System.out.println(v1.removeTodasOcorrências(9));

        System.out.println(v1.toString());

        System.out.println(v1.getUltimaPos());

    }
}
