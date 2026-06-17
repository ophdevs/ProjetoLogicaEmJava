package CalculadoraRecursiva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            boolean continuar = true;
            while (continuar == true){
                menu();
                int opcao = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite o numero para calculo: ");
                int number = sc.nextInt();
                sc.nextLine();
                if (opcao == 1){
                    System.out.println(Fatorial(number));
                } else if (opcao == 2) {
                    System.out.println(Fibonacci(number));
                } else {
                    throw new RuntimeException("digitar um numero");
                }
                System.out.println("Deseja continuar? S/N ");
                String opcaoInput = sc.nextLine().toLowerCase();
                if (opcaoInput.equals("n")){
                    continuar = false;
                }
            }
        }catch (NumeroNegativoException e) {
            System.out.println("Erro: " + e.getMessage());

        }catch (RuntimeException e){
            System.out.println("Erro na digitacao");

        } finally {
            sc.close();
        }
    }

    public static void menu(){
        System.out.println("------------------------------");
        System.out.println("Digite a opção? ");
        System.out.println("1- Fatorial");
        System.out.println("2- Fibonacci");
        System.out.println("------------------------------");
        System.out.print("Digite um numero: ");

    }

    public static int Fatorial(int n){
        if (n < 0) {
            throw new NumeroNegativoException("Numero negativo");
        }
        if (n == 0){
            return 1;
        } else {
            return n *  Fatorial(n - 1);
        }
    }

    public static int Fibonacci(int n){
        if ( n < 0){
            throw new NumeroNegativoException("Numero negativo");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        return Fibonacci(n-1) + Fibonacci(n - 2);
    }
}
