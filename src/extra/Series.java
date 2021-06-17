package extra;

public interface Series {




    int max = 10;
    String ERRORMSG = "Can't go over value " + max;

    int getNext();
    //you can override a default method
    default void printStuff(){
        System.out.println("Printing!");
       printMoreStuff();
    }

    private void printMoreStuff(){
        System.out.println("More stuff!");
    }
}

