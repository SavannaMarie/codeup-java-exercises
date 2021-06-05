package extra;

public class Main {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();

        for(int i = 0; i < 5; i++){
            System.out.println(byTwos.getNext());
        }
    }
}
