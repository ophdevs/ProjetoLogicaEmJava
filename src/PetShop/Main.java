package PetShop;

import PetShop.entities.Dono;
import PetShop.entities.Pet;
import PetShop.entities.ServicoPet;
import PetShop.entities.ennum.TiposServicos;
import java.text.ParseException; // se der erro no parse

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class petshop {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nome do seu pet: ");
        String nomePet = sc.nextLine();
        System.out.print("Especie do seu pet: ");
        String especiePet = sc.nextLine();
        System.out.print("Nome do Dono: ");
        String nomeDono = sc.nextLine();

        Dono dono = new Dono(nomeDono);
        Pet pet = new Pet(nomePet, especiePet, dono);

        System.out.print("Quantos servicos ?");
        int quantServ = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantServ; i++){
            System.out.println("Servico #" + (i + 1));
            System.out.println("digite a data: ");
            Date data = sdf.parse(sc.next()); //criar date
            System.out.print("Qual o tipo de serviço (BANHO/VETERINARIO/TOSA): ");
            TiposServicos servicoEnum = TiposServicos.valueOf(sc.next().toUpperCase()); // value do enum e toUper para deixar maiusculo
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            System.out.print("qual a duracao em minutos: ");
            int minutos = sc.nextInt();
            sc.nextLine();
            System.out.println(" ");
            ServicoPet servico = new ServicoPet(data, servicoEnum, preco,minutos); // cria o servico
            pet.addServicos(servico); // passa o servico para metodo
        }

        System.out.print("coloque o mes e ano para calcular (MM/yyyy): ");
        int mes = sc.nextInt();
        int ano = sc.nextInt();




    }
}
