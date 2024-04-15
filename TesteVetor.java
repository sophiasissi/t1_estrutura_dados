public class TesteVetor {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(5);

        v1.adiciona(3);
        v1.adiciona(20);
        v1.adiciona(9);
        v1.adiciona(6);
        v1.adiciona(15);

        System.out.println(v1.toString());

    }
}
