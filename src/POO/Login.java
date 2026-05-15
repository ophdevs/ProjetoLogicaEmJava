package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicao = true;
        ArrayList<LoginUsuario> usuarios = new ArrayList<>();

        LoginUsuario.MostrarMenu();

        System.out.print("Digite a opcao: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("----------------Criando Usuario----------------");
                System.out.print("Usuario: ");
                String user = sc.nextLine();
                System.out.print("Senha: ");
                String senha = sc.nextLine();
                System.out.println("------------------------------------------------");
                System.out.println("usuario criado com sucesso");
                usuarios.add(new LoginUsuario(user, senha));
                condicao = false;


                break;
            case 2:
                System.out.println("----------------Logar----------------");

                break;
        }
    }
}
