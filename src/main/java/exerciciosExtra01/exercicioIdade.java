package exerciciosExtra01;

import java.util.Scanner;

public class exercicioIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma idade");
        int idade = sc.nextInt();
        String texto = retornaIdade(idade);
        System.out.println(texto);
    }
    public static String retornaIdade(int idade){
        String texto = null;

        if (idade < 12){
            texto = "Criança";
        } else if (idade >= 12 && idade <=18) {
            texto = "Adolescente";
        }else {
            texto = "Adulto";
        }
        return texto;
    }
}
