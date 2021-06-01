public class Person {

    //initializing the name string
    private String name;

    //Setting the name of the Person
    public Person(String personName){
        this.name = personName;
    }

    //Getting name from person
    public String getName(){
        return name;
    }

    //Setting new name
    public void setName(String personName) {
        name = personName;
    }

    //sayHello method
    public void sayHello(){
        System.out.printf("Hello, %s!", this.name);
    }


//    public void person(){};

    public static void main(String[] args) {
        Person person1 = new Person("Savanna");
//      person1.setName("Savanna2");
        person1.sayHello();
    }

}
