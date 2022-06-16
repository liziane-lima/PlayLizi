package exerciciosExtra01;

import java.util.Scanner;

public class exercicioVoltagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma voltagem: ");
        int voltagem = sc.nextInt();
        String texto = RetornaVoltagem(voltagem);
        System.out.println(texto);
    }

    public static String RetornaVoltagem(int voltagem){

        String texto = null;

        if (voltagem == 110){
            texto = "1";
        } else if (voltagem == 220) {
            texto = "2";
        } else if (voltagem < 110) {
            texto = "Baixa";
        } else if (voltagem > 220) {
            texto = "Alta";
        } else {
            if (voltagem > 110 && voltagem < 220){
                texto = "Indefinido";
            }
        }
        return texto;
    }
}
