import java.util.Random;

public class MeuVetor {
    private double[] v;
    private int ultimaPos;

    public MeuVetor (int capacidade) {
        v = new double[capacidade];
        ultimaPos = -1;
    }

    //Métodos de Acesso 
    public int getUltimaPos() {
        return ultimaPos;
    }
    public double[] getV() {
        return v;
    }

    //Métodos Modificadores
    public void setUltimaPosicao(int pos) {
        if (pos >= 0 && pos < v.length) {
            ultimaPos = pos;
        }
        else {
            ultimaPos = v.length - 1;
        }
    }
    public boolean estaCheio () {
        return ultimaPos == v.length-1;
    }
    public boolean estaVazio () {
        return ultimaPos == -1;
    }
    public void resetVetor() {
        ultimaPos = -1;
    }

    //Método para adicionar elementos em um vetor
    public void adiciona (double elemento) {
        if (!estaCheio())
            v[++ultimaPos] = elemento;
    }

    //Método para preencher o vetor
    public void preencheVetor () {
        Random r = new Random();
        for (int i=0; i<v.length; i++) {
            adiciona(r.nextInt(v.length*10)+1);
        }
    }

    //Método para esvaziar um vetor
    public void esvaziaVetor() {
        for(int i = 0; i < v.length; i++) {
            v[i] = 0;
        }
        ultimaPos = -1; 
    }

    //Método Bubble Sort
    public void bubbleSort () {
        for (int i=1; i<v.length; i++) {
            for (int j=0; j<v.length-i; j++) {
                if (v[j] > v[j+1]) {
                    double aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }

    //Método Insertion Sort
    public void insertionSort () {
        int n = v.length;
        for (int j = 1; j < n; ++j) {
            int x = (int) v[j];
            int i;
            for (i = j-1; i >= 0 && v[i] > x; --i) 
                v[i+1] = v[i];
            v[i+1] = x;
       }
    }

    //Método Selection Sort
    public void selectionSort () {
        int n = v.length;
        for (int i = 0; i < n-1; ++i) {
            int min = i;
            for (int j = i+1; j < n; ++j)
                if (v[j] < v[min])  min = j;
            int x = (int) v[i]; v[i] = v[min]; v[min] = x;
       }
    }


    @Override
    public String toString() {
        String s = "";
        if (estaVazio()) {
            s = s + "vetor vazio";
        }
        else {
            for (int i=0; i <= ultimaPos; i++) {
                s = s + String.format("%.0f ", v[i]);
            }
        }
        s = s + "\n";
        return s;
    }

}