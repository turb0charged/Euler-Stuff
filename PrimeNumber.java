public class PrimeNumber{
    public long PrimeorNot(long num){
        for(long i=2; i<num; i++){
            if(num%i==0){
                return 1;
            }
        }
        return 0;
    }
}
