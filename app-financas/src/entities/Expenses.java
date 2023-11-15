package entities;

public class Expenses {
    private String name;
    private double value;

    public Expenses(String name, double value){
        this.name = name;
        this.value = value;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return String.format("""
                Despesa: %s
                Valor: %.2f
                """, this.name, this.value);
    }

}
