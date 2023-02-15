public class Student {
     private int age;
     private String  name;
     public static int numberofstudents;

     void  setAge(int age) {
         if (age > 0 && age < 100) {
             this.age = age;
         } else {
             System.out.println("Incorrect age");
         }
     }
     int getAge(){
         return  this.age;

     }
     void setName(String Name) {
         this.name = Name;
     }
     String getName() {
      return  this.name;
     }
     char height;
     Student() {
        this.age = 16;
        this.name = "Ivan";
        this.height = 176;
        numberofstudents++;
        System.out.println("Student Ivan Constructor");
    }
    Student(int Age, String Name) {
        this.age = Age;
        this.name = Name;
        numberofstudents++;
        System.out.println("Student age&name Constructor");

    }
    Student(String Name,int Age) {
        this.age = Age;
        this.name = Name;
        numberofstudents++;
        System.out.println("Student age&name Constructor");

    }
    Student(Student s) {
        this.age = s.age;
        this.name = s.name;
        numberofstudents++;
        System.out.println("Student Copy Constructor");


    }
    Student birthday() {
        this.age++;
        System.out.println("Happy " +  this.age + " Birthday," +  this.name + "!");
        return this;


    }
    Student growing()  {
        this.height++;
        System.out.println("Wow " +  this.name + " your height " +  this.height + "!");
        return this;


    }
}





