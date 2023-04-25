package br.com.Filas;

public class FilaString {
    private class NO {
        String dado;
        NO prox;
    }
    private NO ini, fim;

    public void init() {
        ini = fim = null;
    }
    public boolean isEmpty() {
        return ini == null && fim == null;
    }
    public void enqueue(String dado){
        NO novo = new NO();
        novo.dado = dado;
        novo.prox = null;

        if (isEmpty())
            ini = novo;
        else
            fim.prox = novo;

        fim = novo;
    }
    public String dequeue() {
        String valor;
        valor = ini.dado;
        ini = ini.prox;
        if (ini == null) {
            System.out.println("Fila vazia");
            fim = ini;
        }
        return valor;
    }
}
