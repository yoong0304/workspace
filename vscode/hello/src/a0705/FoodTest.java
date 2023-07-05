package a0705;

public class FoodTest {
    public static void main(String[] args) {
        Food chicken = new Food("치킨",19800);
        Food pizza = new Food("피자", 29700);
        System.out.printf("Food { name: %s, price: %d원 }\n", chicken.getName(), chicken.getPrice());
        System.out.printf("Food { name: %s, price: %d원 }\n", pizza.getName(), pizza.getPrice());
        
    }
}
class Food {
    String name;
    int price;

    public Food(String n, int p) {
        name = n;
        price = p;
    }
    
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    
}
