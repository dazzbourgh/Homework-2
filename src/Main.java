/**
 * Created by Leonid on 07.07.2016.
 */
public class Main {
    public static final void main(String[] args) {
        System.out.println("Factorial:");
        new Factorial().main("3");
        System.out.println("----------------");
        System.out.println("Sort 2 arrays without sorting:");
        String[] argsSortArrays = new String[2];
        argsSortArrays[0] = "10";
        argsSortArrays[1] = "4";
        new SortArrays().main(argsSortArrays);
        System.out.println("----------------");
        System.out.println("Find j:");
        new FindJ().main("7");
        System.out.println("----------------");
    }
}
