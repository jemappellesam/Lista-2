package ExercicioNove;

public class Circulo {
    public double raio;
    public int area(){
        return (int) (Math.PI*Math.pow(this.raio,2));
    }
}
