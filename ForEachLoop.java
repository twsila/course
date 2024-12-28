public class ForEachLoop {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.stdId=100;
    s1.stdName = "Waleed";
    s1.stdMark = 65;
    Student s2 = new Student();
    s2.stdId=101;
    s2.stdName = "Ayman";
    s2.stdMark = 81;    
    Student s3 = new Student();
    s3.stdId=102;
    s3.stdName = "Hamad";
    s3.stdMark = 88;    

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;


    for(Student std : students){
      System.out.println(std.stdId+" : "+std.stdName+" : "+std.stdMark);
    }    
  }
}
