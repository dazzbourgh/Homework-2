/**
 * Created by Leonid on 07.07.2016.
 */
public class Factorial {
    public static final int main(String arg){
        int n = 0;
        try{
            n = Integer.parseInt(arg);
        }
        catch (Exception e){
            System.out.println("Invalid input");
            System.out.println(arg);
        }
        if(n == 1)
            return 1;
        int mult = 1, fact = 1;
        for(int i = 1; i < n; i++){
            mult *= (i+1);
            fact *= mult;
        }
        System.out.println(fact);
        return fact;
    }
}
