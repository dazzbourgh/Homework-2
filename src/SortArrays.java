import java.util.Arrays;

/**
 * Created by Leonid on 07.07.2016.
 */
public class SortArrays {
    public static final int main(String[] args){
        int[] A;
        int[] B;

        try {
            A = new int[Integer.parseInt(args[0])];
            B = new int[Integer.parseInt(args[1])];
        }
        catch (Exception e){
            System.out.println("Invalid input");
            return -1;
        }

        for(int i = 0; i < A.length; i++){
            A[i] = (int)(Math.random()*100);
            System.out.println("A["+i+"] = " + A[i]);
        }

        for(int i = 0; i < B.length; i++){
            B[i] = (int)(Math.random()*100);
            System.out.println("B["+i+"] = " + B[i]);
        }

        int aI = 0, bI = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length + B.length - 1; i++){
            if(A[aI] < B[bI] && aI != A.length - 1){
                System.out.println(A[aI]);
                aI++;
            }
            else if(bI != B.length - 1){
                System.out.println(B[bI]);
                bI++;
            }
            else{
                System.out.println(A[aI]);
                aI++;
            }
        }

        return 0;
    }
}
