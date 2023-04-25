package br.com.Filas;

public class FilaInt {
    private class NO {
        int dado;
        NO prox;
    }
    private NO ini, fim;

    public void init() {
        ini = fim = null;
    }
    public boolean isEmpty() {
        return ini == null && fim == null;
    }
    public void enqueue(int dado){
        NO novo = new NO();
        novo.dado = dado;
        novo.prox = null;

        if (isEmpty())
            ini = novo;
        else
            fim.prox = novo;

        fim = novo;
    }
    public int dequeue() {
        int valor;
        valor = ini.dado;
        ini = ini.prox;
        if (ini == null) {
            System.out.println("Fila vazia");
            fim = ini;
        }
        return valor;
    }
}
