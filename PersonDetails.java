class Person{
   private String name;
   private final int age = 18;
   public Person(String name, int age){
       this.name = name;
   }
   public void display(){
        System.out.println("Name : " + name + "\nAge = " + age);
   }
}
class PersonDetails{
    public static void main(String[] args) {
        Person p1 = new Person("Ayushi", 20);
        p1.display();  
    }
}