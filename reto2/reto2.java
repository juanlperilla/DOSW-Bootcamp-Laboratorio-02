import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class reto2 {
    public static class Ingredient{
        String name;
        private double price;

        public Ingredient(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
    public static class Burguer{
        private ArrayList<Ingredient> ingredients;
        
        public Burguer(ArrayList<Ingredient> ingredients) {
            this.ingredients = ingredients;
        }

        public List<Ingredient> getIngredients() {
            return ingredients;
        }

        public double calculatePrice() {
            return ingredients.stream()
                .mapToDouble(Ingredient::getPrice)
                .sum();
        }

        public void mostrar() {
            System.out.println("\n--- HAMBURGUESA PERSONALIZADA ---");
            System.out.print("Ingredientes seleccionados: ");
            ingredients.forEach(i -> System.out.print(i.getName() + ", "));
            System.out.println("\nPrecio total: $" + calculatePrice());
            System.out.println("-------------------------------");
            System.out.println("¡Disfrute su hamburguesa!");
        }
    }





    
}