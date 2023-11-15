import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Expenses;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual foi o salário recebido?");
        double valorRecebido = scan.nextDouble();

        System.out.println("Quantas despesas para pagar neste mês?");
        int quantidadeDespesas = scan.nextInt();


        List<Expenses> listaDespesas = new ArrayList<Expenses>();

        for(int i=0; i < quantidadeDespesas; i++){
            scan.nextLine();
            System.out.println("Nome da despesa número "+(i+1)+"?");
            String nomeDespesa = scan.nextLine();
            System.out.println("Qual o valor da despesa número "+(i+1)+"?");
            double valorDespesa = scan.nextDouble();

            listaDespesas.add(new Expenses(nomeDespesa, valorDespesa));
        }

        for(Expenses despesa : listaDespesas){
            System.out.println(despesa);
        }

        scan.close();
    }
}