// Abstract Animal class
abstract class Animal {

    public void animalSound(){
        System.out.println("Animal makes no sound...");
    }
    public abstract void legs(); 

}

// Dog class (inherited from animal class)
class Dog extends Animal { 
    public void legs() {
        System.out.println("Dog has 4 legs");
    }

    public void animalSound(){
        System.out.println("Dog sound: Woof woof");
    }
}

// Ant class (inherited from animal class)
class Ant extends Animal { 
    public void legs() {
        System.out.println("Ant has 6 legs");
    }
}


// DRIVER CLASS
public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Ant ant = new Ant();
        System.out.println("DOG:");
        dog.animalSound();
        dog.legs();
        System.out.println("-----------------------------");
        System.out.println("ANT:");
        ant.animalSound();
        ant.legs();
    }
}
