package exerciciosExtra01;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioRetAntPos {
    public static void main(String[] args) {
        System.out.println("Digite um número");
        int numero = new Scanner(System.in).nextInt();

        System.out.println(Arrays.toString(retornaArray(numero)));

    }

    public static int[] retornaArray(int num){
        int resultado[] = new int[3];
        for (int i = 0; i < 3; i ++){
            if (i ==0 ){
                resultado[i] = (num - 1);
            }else if (i == 1){
                resultado[i] = (num);
            }else{
                resultado[i] = (num + 1);
            }

        }
        return resultado;
    }

}
