package extra;

public class Main {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        ByThrees byThrees = new ByThrees();

        for(int i = 0; i < 5; i++){
//            System.out.println(byTwos.getNext());
            System.out.println(byThrees.getNext());
        }
    }
}
