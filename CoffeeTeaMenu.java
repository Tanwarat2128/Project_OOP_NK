import java.util.Scanner;

public class CoffeeTeaMenu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreItems = true;
        int totalPrice = 0;
        
        // Ask for customer's name
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        while (moreItems) {
            System.out.println("\n1.) Coffee ");
            System.out.println("2.) Tea");
            System.out.print("Please choose number of menu coffee or tea : ");          
            String drinkType = sc.nextLine();

            if (drinkType.equalsIgnoreCase("1")) {
                System.out.println("\n1.) Cappuccino ");
                System.out.println("2.) Mocha");
                System.out.print("Please choose number of menu : ");
                String coffeeType = sc.nextLine();
                
                System.out.println("\nPlease choose the size small, medium, or large ");
                System.out.print("Type only the smallest, front : ");
                String size = sc.nextLine();
                Coffee coffee = new Coffee(coffeeType, size);
                
                System.out.print("\nWould you like whipped cream? (y/n) : ");
                String whippedCream = sc.nextLine();
                coffee.setWhippedCream(whippedCream.equalsIgnoreCase("y"));

                System.out.print("\nWould you like bubbles? (y/n) : ");
                String bubbles = sc.nextLine();
                coffee.setBubbles(bubbles.equalsIgnoreCase("y"));

                totalPrice += coffee.getPrice();
                
            } 
            
            else if (drinkType.equalsIgnoreCase("2")) {
                System.out.println("\n1.) Green Tea");
                System.out.println("2.) Milk Tea");
                System.out.print("Please choose number of menu : ");
                String teaType = sc.nextLine();
                
                System.out.println("\nPlease choose the size: small, medium, or large: ");
                System.out.print("Type only the smallest, front : ");
                String size = sc.nextLine();
                Tea tea = new Tea(teaType, size);
                
                System.out.println("\nWould you like whipped cream? (y/n) : ");
                String whippedCream = sc.nextLine();
                tea.setWhippedCream(whippedCream.equalsIgnoreCase("y"));

                System.out.println("\nWould you like pearls? (y/n) : ");
                String pearls = sc.nextLine();
                tea.setPearls(pearls.equalsIgnoreCase("y"));

                totalPrice += tea.getPrice();
            }
            System.out.println("\n-------------------------------------------------");
            System.out.println("Your current total is: " + totalPrice +"Bath");
            System.out.println("-------------------------------------------------");
            
            
            System.out.print("\nWould you like to order more? (y/n): ");
            
            String more = sc.nextLine();
            if (more.equalsIgnoreCase("n")) {
                moreItems = false;
            }
        }
        System.out.println("\n********************************************************");
        System.out.println("Thank you, "+name+" for your order! Your total is: " + totalPrice + "Bath");
        System.out.println("********************************************************");
    }
}
