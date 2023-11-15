import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Expenses;
import entities.User;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nameUser = scan.nextLine();

        System.out.println("Qual foi o salário recebido?");
        double valorRecebido = scan.nextDouble();

        System.out.println("Quantas despesas para pagar neste mês?");
        int quantidadeDespesas = scan.nextInt();


        User user = new User(nameUser, valorRecebido);


        for(int i=0; i < quantidadeDespesas; i++){
            scan.nextLine();
            System.out.println("Nome da despesa número "+(i+1)+"?");
            String nomeDespesa = scan.nextLine();
            System.out.println("Qual o valor da despesa número "+(i+1)+"?");
            double valorDespesa = scan.nextDouble();

            user.addExpense(new Expenses(nomeDespesa, valorDespesa));

        }


        System.out.println(user);

        for(Expenses despesa : user.getListExpense()){
            System.out.println(despesa);
        }

        scan.close();
    }
}