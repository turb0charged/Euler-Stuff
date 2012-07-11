//Program to find the sum of all multiples of 3 and 5 under 1000
public class ProjectEuler001
{
    public static void main (String[] args)
    {
        int counter=1, sum=0;

        while(counter<1000)
            {
                if(counter%3 == 0)
                    {
                        sum=sum+counter;
                        counter++;
                    }
                else
                    {
                        if(counter%5==0)
                            {
                                sum=sum+counter;
                                counter++;
                            }
                        else
                            {
                        counter++;
                            }
                    }

            }
        System.out.println ("The sum of all multiples of 3 and 5 under 1000 is " +sum);
    }
}