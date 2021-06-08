import util.Input;
import java.util.ArrayList;

public class GroceryApp {
    public static Input input = new Input();
    private String item;
    private String category;
    private int numberOfItems;

    public GroceryApp(String item, String category, int numberOfItems) {
        this.item = item;
        this.category = category;
        this.numberOfItems = numberOfItems;
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
                return "other";
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
            displayCategories();
            String category = groceryCategory();
            System.out.println(category);

        }


    }
}
