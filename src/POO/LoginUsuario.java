package POO;

import java.util.Scanner;

public class LoginUsuario {
    public String Usuario;
    public String Senha;

    public LoginUsuario() {

    }

    public LoginUsuario(String usuario, String senha) {
        Usuario = usuario;
        Senha = senha;
    }

    public static void MostrarMenu() {
        System.out.println("_________________________________________");
        System.out.println("|                                        |");
        System.out.println("|    Projeto de Cadastro de Usuarios     |");
        System.out.println("|                                        |");
        System.out.println("-----------------------------------------");
        System.out.println("|        1- Cadastrar Usuario            |");
        System.out.println("|        2- Entrar na conta              |");
        System.out.println("|        3- Remover conta                |");
        System.out.println("|        4- Painel Admin                 |");
        System.out.println("|        5- Sair                         |");
        System.out.println("-----------------------------------------");
    }

    public void Login(String usuario, String senha) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o usuario: ");
        String usuarioDig = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDig = sc.nextLine();

        if (this.Usuario.equals(usuario) && this.Senha.equals(senha)) {
            System.out.println("logado com sucesso");
        } else {
            System.out.println("falha");
        }

    }
}


