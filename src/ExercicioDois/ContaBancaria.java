package ExercicioDois;

public class ContaBancaria {
    public double saldo;
    public String titular;

    public void WithDraw(int amount){
        this.saldo-=amount;
    }
    public void Deposit(int amount){
        this.saldo+=amount;
    }
}
