package CRUD;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        ArrayList<Usuario> lista = new ArrayList<>();

        while (cond = true){
            Usuario.MostrarMenu();
            System.out.println("Digite a sua opcao: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Deseja cadastrar quantos usuarios: ");
                    Instant dataCriacao = Instant.now();
                    int quantUser = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < quantUser; i++){
                        String nome = "";
                        String senha1 = "";
                        String senha2 = "";
                        System.out.println("Digite o usuario: ");
                        nome = sc.nextLine();
                        boolean senhaCorreta = false;
                        while (!senhaCorreta){
                            System.out.println("Digite a senha:");
                            senha1 = sc.nextLine();
                            System.out.println("Digite a senha novamente:");
                            senha2 = sc.nextLine();
                            if (senha1.equals(senha2)){
                                System.out.println("concluido");
                                senhaCorreta = true;
                            } else{
                                System.out.println("senhas incorretas!");
                            }
                        }
                        lista.add(new Usuario(nome, senha1));
                    }
                    break;

                case 2:
                    cond = true;
                    while (cond = true){
                        System.out.println("Usuario: ");
                        String usuario = sc.nextLine();
                        System.out.println("Senha: ");
                        String senha = sc.nextLine();

                        boolean encontrado = false;

                        for (int i = 0; i < lista.size(); i++){
                            if (lista.get(i).getUsuario().equals(usuario)){
                                lista.remove(i);
                                encontrado = true;
                                System.out.println("Usuario removido!");
                                cond = false;
                                break;
                            }
                        }

                        if (!encontrado){
                            System.out.println("usuario nao encontrado");
                        }
                    }
                    break;

                case 3:
                    cond = true;
                    while(cond = true){
                        System.out.print("Usuario: ");
                        String usuario = sc.nextLine();

                        System.out.print("Senha: ");
                        String senha = sc.nextLine();

                        for (int i = 0; i < lista.size(); i++){
                            if (lista.get(i).getUsuario().equals(usuario) && lista.get(i).getSenha().equals(senha)){
                                cond = false;
                            } else {
                                System.out.println("algo errado");
                            }
                        }
                    }

                    // continuacao da conta a fazer

                    break;

                case 4:
                    System.out.println("usuario: ");
                    String usuario = sc.nextLine();
                    System.out.println("senha: ");
                    String senha = sc.nextLine();


                    break;

                case 5:
                    cond = false;
                    break;
            }


        }
    }
}
