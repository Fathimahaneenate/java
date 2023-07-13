import java.util.Scanner;
class Topper
{
int s1,s2,s3,total,rollno;
String name;
Topper(int rollno,String name,int s1,int  s2,int s3)
{
this.rollno=rollno;
this.name=name;
this.s1=s1;
this.s2=s2;
this.s3=s3;
}
void Cal()
{
total=s1+s2+s3;
}
}
class MCATopper
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Topper arr[]=new Topper[3];
for(int i=0;i<3;i++)
{
System.out.println("enter roll number:");
int r=sc.nextInt();
System.out.println("enter the name:");
String n=sc.next();
System.out.println("enter the mark of subject 1:");
int sub1=sc.nextInt();
System.out.println("enter the mark of subject 2:");
int sub2=sc.nextInt();
System.out.println("enter the mark of subject 3:");
int sub3=sc.nextInt();
arr[i]=new Topper(r,n,sub1,sub2,sub3);
arr[i].Cal();
}
for(int i=0;i<3;i++)
{
for(int j=i+1;j<3;j++)
{
if(arr[i].total>arr[j].total)
{
Topper temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
}
System.out.println("class topper is:");
System.out.println("rollno:"+arr[2].rollno);
System.out.println("name:"+arr[2].name);
System.out.println("percentage:"+(arr[2].total/3));
}
}

-- INSERT --               