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
//        Person newPerson = new Person("Savanna");
////        newPerson.setName("Savanna2");
//        newPerson.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}
