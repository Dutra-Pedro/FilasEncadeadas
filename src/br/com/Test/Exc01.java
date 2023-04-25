package br.com.Test;

import br.com.Filas.FilaInt;

import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        int valor;
        System.out.println("Digite um valor:");
        valor = S.nextInt();
        fila.enqueue(valor);
        while (valor > 0){
                System.out.println("Digite um valor:");
                valor = S.nextInt();
                fila.enqueue(valor);
        }

        System.out.println("Encerrando...");

        while (!fila.isEmpty()){
            System.out.println(fila.dequeue());
        }

        S.close();
    }
}
