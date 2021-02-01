public class Main {
    public static void main(String args[]){

        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL).
                addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();

        System.out.println("Pizza is " + pizza.getSize() + " topping " + pizza.getToppings().toString());

        Calzone calzone = new Calzone.Builder().addTopping(Pizza.Topping.HAM).sauceInside().build();

        System.out.println("Calzone has sauce " + calzone.isSauceInside() );
    }
}
