//Program to find some of even numbers in the Fibonacci sequence less than 4mil\
lion
public class ProjectEuler002
{
    public static void main (String[] args)
    {
        int sum=0, number1=0, number2=1, number3=0;

        while(number3<4000001){
            number3=number1+number2;
            if(number3%2==0){
                sum=sum+number3;
            }
            number1=number2;
            number2=number3;
        }
        System.out.println ("The sum of even numbers in the Fibonacci sequence \
less than 4million is " + sum);
    }
}