public class Main {
    public static void main(String[] args) {
        System.out.println(Student.numberofstudents + " Student" );
        Student student1 = new Student();
        Student student2 = new Student(15,"Ivan");
        Student student3 = new Student("Artem", 16);
        System.out.println(Student.numberofstudents + " Student" );

}
    }