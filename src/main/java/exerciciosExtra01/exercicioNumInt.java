package exerciciosExtra01;

import java.util.Scanner;

public class exercicioNumInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        String texto = retornaSituacao(num);
        System.out.printf(texto);

    }

    public static String  retornaSituacao(int num){

        String texto;

        if (num == 0){
            texto = "Zero";
        } else if (num < 0) {
            texto = "Negativo";
        } else {
            texto = "Positivo";
        }

        return texto;
    }
}
