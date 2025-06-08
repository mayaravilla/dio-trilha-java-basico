package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência");
        String branchCode = scanner.nextLine();

        System.out.println("Digite o número da Conta");
        Integer accountNumber = scanner.nextInt();

        System.out.println("Digite o nome do cliente");
        String name = scanner.next();

        System.out.println("Digite o saldo da conta");
        Double balance = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %s e seu saldo %s já está disponível para saque\".", name, branchCode, accountNumber, balance);
    }
}