import java.util.Scanner;
class Complexnum
{
int real,img;
Complexnum(int real,int img)
{
this.real=real;
this.img=img;
}
Complexnum Add(Complexnum c1,Complexnum c2)
{
Complexnum temp=new Complexnum(0,0);
temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}
}
class Main
{
public static void main(String args[])
{
Complexnum c1=new Complexnum(4,2);
Complexnum c2=new Complexnum(7,3);
Complexnum c3=new Complexnum(0,0);
c3=c3.Add(c1,c2);
System.out.println("result is"+c3.real+"+"+c3.img+"img");
}
}
