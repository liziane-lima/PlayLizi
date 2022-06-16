package exerciciosExtra01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicioConsertoCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos consertos deseja incluir:");
        int num = sc.nextInt();

        int[] numeros = new int[num];
        for (int i = 0; i < num; i++ ){
            System.out.println("Digite um conserto");
            numeros[i] = new Scanner(System.in).nextInt();
        }
        int menor = obtemMenorNumero(numeros);
        System.out.println("O menor conserto foi: " + menor);
    }
    public static int obtemMenorNumero(int[] numeros){
        int menor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0){
                menor = numeros[i];
            }else {
                if (menor > numeros[i]){
                    menor = numeros[i];
                }
            }
        }
        return menor;
    }
}
