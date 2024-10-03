import pizza.Pizza;
import pizza.PizzaBuilder;

public class Main {
    public static void main(String[] args) {
        comBuilder();
    }
    public static void comBuilder(){
        Pizza daora = new PizzaBuilder()
                .setTamanho("grande")
                .addIngrediente("maçã")
                .build();
        System.out.println(daora.toString());
    }

    public static void semBuilder(){
        Pizza daora = new Pizza("maçã", "maçã");

        System.out.println(daora.toString());
    }
}