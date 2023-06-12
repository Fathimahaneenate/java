import java.util.Scanner;
class Students
{
 String name;
 int roll_no,mark;
 Students()
 {
  Scanner n=new Scanner(System.in);
  System.out.println("details of students:");
  System.out.println("enter the name of student:");
  name=n.next();
  System.out.println("enter the roll_no of student:");
  roll_no=n.nextInt();
  System.out.println("enter the mark of student:");
  mark=n.nextInt();
 }
void display()
 {
  System.out.println("student name is:"+name);
  System.out.println("student roll_no is:"+roll_no);
  System.out.println("student mark is:"+mark);
 }
class Sports
{
String Sports_name;
int Sports_rollno;
Sports()
{
Scanner m=new Scanner(System.in);
System.out.println("enter the sports name:");
Sports_name=m.next();
System.out.println("enter the sports rollno:");
Sports_rollno=m.nextInt();
}
void show()
{
System.out.println("sports name is:"+Sports_name);
System.out.println("sports rollno is:"+Sports_rollno);
}
}
}
class Main
{
public static void main(String args[])
{
Students a=new Students();
Students.Sports a1=a.new Sports();
a.display();
a1.show();
}
}