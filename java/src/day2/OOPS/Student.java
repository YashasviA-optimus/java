package day2.OOPS;

public class Student {
    // Declaring attributes
   String name;
   int rollNo;
   String section;

   // initialize attributes with the help of parameterized constructor
   Student(String name, int rollNo, String section){
    // this keyword refer to the 
      this.name= name;
      this.rollNo = rollNo;
      this.section = section;
   }
   // print details	  
   public void printDetails() {
      System.out.print("Student Details: ");
      System.out.println(this.name+ ", " + this.rollNo + ", " + section);
   }

   public static void main(String[] args) {
      // create student class objects to access the properties(attributes) and functionalities(methods) of student class
      Student student1 = new Student("Robert", 1, "IX Blue");
      Student student2 = new Student("Adam", 2, "IX Red");
      Student student3 = new Student("Julie", 3, "IX Blue");

      // print student details
      student1.printDetails();
      student2.printDetails();
      student3.printDetails();
   }
}
