package Project;

import resources.GeraSenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        GeraSenha rd=new GeraSenha();

        System.out.println("Insira a quantidade de caracteres que sua senha terá: \n");
        int quantidade=sc.nextInt();
        System.out.println(rd.senha(quantidade));

    }
}
