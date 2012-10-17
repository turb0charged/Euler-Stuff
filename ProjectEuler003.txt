public class ProjectEuler003{
    public static void main (String[] args){
        PrimeNumber p = new PrimeNumber();
        final long x=600851475143l;
        for( long z=2; z<x; z++){
            if(p.PrimeorNot(z)==0){
                if(x%z==0){
                    System.out.println(z+" is prime factor");
                }
            }
        }
    }
}