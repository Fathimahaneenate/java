import java.util.Scanner;
class main
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the value of a");
                int a=sc.nextInt();
                System.out.println("enter the value of b");
                int b=sc.nextInt();
                try
                {
                        int c=a/(a-b);
                        System.out.println("the value of c="+c);
                }
                /*catch(Exception e)
                {
                        System.out.println("caught by Exception:.."+e);
                }*/
                catch(ArithmeticException e)
                {
                        System.out.println("arithematic Exception:.."+e);
                }
                finally
                {
                        System.out.println("final block");
                }
                        System.out.println("a is="+a);
                        System.out.println("b is="+b);
                        System.out.println("end bye");

        }
}
