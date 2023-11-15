package entities;

import java.util.List;
import java.util.ArrayList;

public class User {

    private String name;
    private double monthlySalary;
    private final List<Expenses> listExpenses = new ArrayList<>();


    //Construtor
    public User(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }


    public void addExpense(Expenses expense){
        this.listExpenses.add(expense);
    }

    public List<Expenses> getListExpense(){
        return this.listExpenses;
    }


    @Override
    public String toString(){
        return String.format("""
                Usuário: %s
                Quantidade de despesas: %d
                """, this.name, this.listExpenses.size());
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

}
