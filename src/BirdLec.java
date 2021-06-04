public class BirdLec {
    //Can it fly?
    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    //what kind of bird?
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("tweet tweet");
    }
    public void move(){
        System.out.println("flap flap");
    }
}
