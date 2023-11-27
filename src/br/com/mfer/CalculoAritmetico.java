package br.com.mfer;

public class CalculoAritmetico {

    public static void main(String args[]) {

        int num1 = 8;
        int num2 = 6;
        int num3 = 3;
        int num4 = 7;

        int media = (num1 + num2 + num3 + num4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

}
