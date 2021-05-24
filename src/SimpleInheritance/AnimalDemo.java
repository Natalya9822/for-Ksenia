package SimpleInheritance;

class Animal {
    private String name;

    public Animal(){
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void getVoice(){
        System.out.println("Some voice");
    }
}
class Dog extends Animal{
    String owner;

    public Dog() {
    }

    public Dog(String name, String owner) {
        super(name);
        this.owner = owner;
    }

    @Override
    void getVoice() {
        System.out.println("Gav");
    }

    void findSomething(){

    }
}

class Cat extends Animal{
    String owner;

    @Override
    void getVoice() {
        System.out.println("Meou");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.setName("Jack");
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.getVoice();
        animal2.getVoice();

        Animal[] animals = new Animal[2];    //полиморфный массив
        animals[0] = new Cat();
        animals[1] = new Dog();

        for (Animal a:animals) {
            a.getVoice();
        }
        AnimalDemo.doSomething(animals[0]);
    }

    static void polymorphMethod (Animal animal){
        //...
        animal.getVoice();                  //для каждого конкретного объекта будет вызвана
                                            //своя переопределенная версия метода getVoice().
    }


    static void doSomething (Object o){
        //...
        if (o instanceof Dog) {             //Список доступных полей и методов для объекта
            Dog animal1 = (Dog) o;          //определяется типом ссылки, а не фактическим типом объекта.
            animal1.findSomething();        //Необходимо явное приведение типов.
        }
    }
}
