import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Leonid on 07.07.2016.
 */
public class FindJ {
    public static final void main(String arg){
        int n = 0;
        int[] A;
        int k;
        int value = 0;
        int result = 0;

        try{
            n = Integer.parseInt(arg);
        }
        catch (Exception e){
            System.out.println("Invalid input");
            System.out.println(arg);
            return;
        }
        A = new int[n - 1];
        k = (int)(Math.random()*n);
        //initialize
        for(int i = 0; i < n - 1; i++){
            if(i == k)
                value++;
            A[i] = value;
            value++;
        }
        //suffle
        Collections.shuffle(Arrays.asList(A));
        //find j

        for(int i = 0; i < n; i++){
            if(i < n - 1) {
                result += i - A[i];
                System.out.println("A[" + i + "] = " + A[i]);
            }
            else
                result += i;
        }
        System.out.println("Result = " + result);

    }
}
