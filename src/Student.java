public class Student {
    String name;
    int age;
    // Constructor
    public Student(String n, int a){
        name = n;
        age = a;
    }
    // instance method
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // instance method
    public int nextYearAge(){
        return age + 1;
    }
    public static void main(String[] args){
        Student s1 = new Student("EMma", 20);
        Student s2 = new Student("Noah", 22);
        s1.displayInfo();
        System.out.println("Next year age: " + s1.nextYearAge());
        s2.displayInfo();
        System.out.println("Next year age: " + s2.nextYearAge());
    }
}
