
class Student{
  int stdId;
  String stdName;
  int stdMark;
}
public class ArrayOfObject {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.stdId=100;
    s1.stdName = "Ahmed";
    s1.stdMark = 82;
    Student s2 = new Student();
    s2.stdId=101;
    s2.stdName = "Ali";
    s2.stdMark = 90;    
    Student s3 = new Student();
    s3.stdId=102;
    s3.stdName = "Saad";
    s3.stdMark = 81;    

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

     for(int i=0;i<students.length;i++){
       System.out.println(students[i].stdId+" : "+students[i].stdName+" : "+students[i].stdMark);
     }

  }
}
