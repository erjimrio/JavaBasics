class Animal {
    void speak(){
        System.out.println("The animal makes a sound.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks.");
    }
}
public class AnimalChecker{
    public static void main(String[] args){
        Animal myAnimal = new Dog(); // upcasting
        if(myAnimal instanceof Dog){
            System.out.println("myAnimal is a Dog!");
            Dog myDog=(Dog) myAnimal; // safe downcast
            myDog.bark();
        }
        else if (myAnimal instanceof Animal){
            System.out.println("myAnimal is just an Animal.");
            myAnimal.speak();
        }
        // Adaptación: usar Object en lugar de Animal
        Object obj = myAnimal;
        if(obj instanceof String){
          System.out.println("This will not print!");
        }
    }
}