import java.util.ArrayList;
import java.util.List;

public class Sortowanie {
    public static List<Integer>listOfNumbers=new ArrayList<>(List.of(99,22,121,-5,7,8,16));
    public static void main(String[] args) {
        System.out.println(listOfNumbers);
        compare(listOfNumbers);
        System.out.println(listOfNumbers);
    }
    public static void compare(List<Integer> listOfNumbers)
    {
        listOfNumbers.sort((t1,t2)->
        {
            if(t1<t2)
            {
                //System.out.println("t1<t2 || t1==null");
                return -1;
            }
            else if(t1.equals(t2))
            {
                //System.out.println("t1.equals(t2)");
                return 0;
            }
            else
            {
                //System.out.println("t1>t2 || t2==null");
                return 1;
            }

        });

    }
}
