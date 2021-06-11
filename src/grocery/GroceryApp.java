package grocery;
import util.Input;
import java.util.ArrayList;
import java.util.HashMap;

public class GroceryApp {

    public static void addToShoppingList(HashMap<String, ArrayList<Item>> list, Input in) {
        System.out.println("Please select a department:");
        int num = 1;
        for (String department : list.keySet()) {
            System.out.printf("%d: %s%n", num, department);
            num++;
        }
        String selectedDepartment = "";
        while (!list.containsKey(selectedDepartment)) {
            selectedDepartment = in.getString("Please enter the name of the item's department:");
            if (!list.containsKey(selectedDepartment)) {
                System.out.println("Input invalid.\nPlease try again.");
            }
        }
        String itemName = in.getString("Please enter the name of the item:");
        int itemQuantity = in.getInt("Please enter item quantity:");
        float itemPrice = (float) in.getDouble("Please enter individual item price:");
        in.getString();
        System.out.printf("Please review the following item:%nItem Name: %s%nItem Department: %s%nItem Quantity: %d%nItem Price: $%.2f%nWould you like to add this item to your grocery list?%n", itemName, selectedDepartment, itemQuantity, itemPrice);
        if (in.yesNo()) {
            System.out.println("Item has been saved to list.");
            list.get(selectedDepartment).add(new Item(itemName, itemQuantity, itemPrice));
        } else {
            System.out.println("Item discarded.\nWould you like to add a different item?");
            if (in.yesNo()) {
                addToShoppingList(list, in);
            }
        }
    }

    public static void printList(HashMap<String, ArrayList<Item>> list) {
        System.out.println("Here is your current list of items:");
        int categoriesGathered = 0;
        for (HashMap.Entry<String, ArrayList<Item>> pair : list.entrySet()) {
            if (!pair.getValue().isEmpty()) {
                categoriesGathered++;
                System.out.printf("%s:\n" , pair.getKey());
                for (Item item : pair.getValue()) {
                    if (item.getQuantity() > 1) {
                        System.out.printf("    %s, %d, $%.2f each, $%.2f total%n", item.getName(), item.getQuantity(), item.getPrice(), (item.getQuantity() * item.getPrice()));
                    } else {
                        System.out.printf("    %s, $%.2f%n", item.getName(), item.getPrice());
                    }
                }
                System.out.println();
            }
        }
        if (categoriesGathered == 0) {
            System.out.println("\nList is currently empty.\nPlease add items to your grocery list.\n");
        }
    }

    public static void runApp(HashMap<String, ArrayList<Item>> list, Input in) {
        System.out.println("Welcome to Happy Market Grocery List Builder!\n-----\n");
        boolean run = true;
        while (run) {
            System.out.println("Please make your selection:");
            System.out.println("1. Add New Item To List");
            System.out.println("2. View List");
            System.out.println("3. Quit");
            int userResp = in.getInt("Please enter either 1, 2, or 3 into your terminal.",1,3);
            in.getString();
            switch(userResp) {
                case 1:
                    addToShoppingList(list, in);
                    System.out.println("Returning to menu...\n");
                    break;
                case 2:
                    printList(list);
                    System.out.println("Returning to menu...\n");
                    break;
                default:
                    System.out.println("Are you sure you want to quit?");
                    if (in.yesNo()) {
                        System.out.println("Thank you for choosing Happy Market.\nWe'll see you soon!");
                        run = false;
                    } else {
                        System.out.println("Returning to menu...\n");
                    }
            }
        }
    }

    public static void main(String[] args) {
        // Building the grocery list and menu of categories
        HashMap<String, ArrayList<Item>> list = new HashMap<>();
        list.put("Produce", new ArrayList<>());
        list.put("Bakery", new ArrayList<>());
        list.put("Butcher's Shop", new ArrayList<>());
        list.put("Seafood", new ArrayList<>());
        list.put("Beer & Wine", new ArrayList<>());
        list.put("Pantry Goods", new ArrayList<>());
        list.put("Frozen Goods", new ArrayList<>());
        list.put("Dairy", new ArrayList<>());
        list.put("Drug Store & Pharmacy", new ArrayList<>());
        list.put("Pet Food", new ArrayList<>());

        // calling runApp
        runApp(list, new Input());
    }
}













//import util.Input;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class grocery.GroceryApp {
//    public static Input input = new Input();
//    private String items;
//    private String category;
//    private int itemAmount;
//
//    public grocery.GroceryApp(String item, String category, int itemAmount) {
//        this.items = item;
//        this.category = category;
//        this.itemAmount = itemAmount;
//    }
//    public String getItem() {
//        return this.items;
//    }
//    public String getCategory() {
//        return this.category;
//    }
//    public int getItemAmount() {
//        return this.itemAmount;
//    }
//
//    private static void displayCategories(){
//        System.out.println("Select from one of our categories: ");
//        System.out.println("=======================");
//        System.out.println("1 - Dairy");
//        System.out.println("2 - Meat");
//        System.out.println("3 - Deli");
//        System.out.println("4 - Produce");
//        System.out.println("5 - Baked Goods");
//        System.out.println("6 - Other");
//    }
//    private static String groceryCategory() {
//        int categorySelection = input.getInt();
//        switch (categorySelection) {
//            case 1:
//                return "Dairy";
//            case 2:
//                return "Meat";
//            case 3:
//                return "Deli";
//            case 4:
//                return "Produce";
//            case 5:
//                return "Baked Goods";
//            case 6:
//                return "Other";
//            default:
//                System.out.println("Invalid selection. Please try again");
//                return groceryCategory();
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        ArrayList<grocery.GroceryApp> newList = new ArrayList<>();
//        System.out.println("Welcome! Thank you for using our service!");
//        boolean createList = input.yesNo("Would you like to add groceries to your list?");
//
//        do {
//            Scanner scanner = new Scanner(System.in);
//            displayCategories();
//            String category = groceryCategory();
//            System.out.println("How many would you like?");
//            int quantity = input.getInt();
//            System.out.println("What is the name of your product?");
//            String groceryItem = scanner.nextLine();
//            newList.add(new grocery.GroceryApp(groceryItem, category, quantity));
//            for (grocery.GroceryApp items : newList) {
//                System.out.printf("%s %s %s", items.getItemAmount(), items.getCategory(), items.getItem());
//                System.out.println("\nWould you like to add more?");
//                createList = scanner.nextBoolean();
//
//            } if (createList == false) {
//                System.out.println("Thank you come again!");
//            }
//        } while (input.yesNo());
////        System.out.println(newList);
//    }
//}