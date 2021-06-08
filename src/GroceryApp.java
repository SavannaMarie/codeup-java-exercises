import util.Input;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryApp {
    public static Input input = new Input();
    private String items;
    private String category;
    private int itemAmount;

    public GroceryApp(String item, String category, int itemAmount) {
        this.items = item;
        this.category = category;
        this.itemAmount = itemAmount;
    }
    public String getItem() {
        return this.items;
    }
    public String getCategory() {
        return this.category;
    }
    public int getItemAmount() {
        return this.itemAmount;
    }

    private static void displayCategories(){
        System.out.println("Select from one of our categories: ");
        System.out.println("=======================");
        System.out.println("1 - Dairy");
        System.out.println("2 - Meat");
        System.out.println("3 - Deli");
        System.out.println("4 - Produce");
        System.out.println("5 - Baked Goods");
        System.out.println("6 - Other");
    }
    private static String groceryCategory() {
        int categorySelection = input.getInt();
        switch (categorySelection) {
            case 1:
                return "Dairy";
            case 2:
                return "Meat";
            case 3:
                return "Deli";
            case 4:
                return "Produce";
            case 5:
                return "Baked Goods";
            case 6:
                return "Other";
            default:
                System.out.println("Invalid selection. Please try again");
                return groceryCategory();
        }
    }



    public static void main(String[] args) {
        ArrayList<GroceryApp> newList = new ArrayList<>();
        System.out.println("Welcome! Thank you for using our service!");
        boolean createList = input.yesNo("Would you like to create a list for your groceries?");

        if (createList){
            Scanner scanner = new Scanner(System.in);
            displayCategories();
            String category = groceryCategory();
            System.out.println("How many would you like?");
            int quantity = input.getInt();
            System.out.println("What is the name of your product?");
            String groceryItem = scanner.nextLine();
            newList.add(new GroceryApp(groceryItem, category, quantity));
            for (GroceryApp items : newList) {
                System.out.printf("%s %s %s", items.getItemAmount(), items.getCategory(), items.getItem());
            }

        }

    }
}