package ExercicioDez;

public class Cliente {
    public String Nome;
    public String Endereco;
    public String Telefone;

    public void PrintInformation(){
        System.out.println("Nome: "+this.Nome);
        System.out.println("Endereço: "+this.Endereco);
        System.out.println("Telefone: "+this.Telefone);
    }
}
