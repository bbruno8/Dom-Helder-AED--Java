package etapa1;

import java.util.Scanner;

public class C03EX04 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        String nome;
        int anoNasc, anoAtual, idade;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite o ano em que você nasceu: ");
        anoNasc = teclado.nextInt();
        System.out.print("Digite o ano em que estamos: ");
        anoAtual = teclado.nextInt();

        idade = anoAtual - anoNasc;

        System.out.println(nome + ", você tem/terá " + idade + " anos em " + anoAtual);

        teclado.close();
    }
}
