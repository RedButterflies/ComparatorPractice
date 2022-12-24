import java.util.ArrayList;
import java.util.List;

public class SortTheList {
    public static ArrayList<Integer>numberList= new ArrayList<>(List.of(-4,132,-43,2341,55,23,65,765,34324));
    public static void sortYourList(List<Integer> listOfNumbers)
    {
        listOfNumbers.sort((object1, object2)->
        {
            if(object1<object2)
            {
                return -1;
            }
            else if(object1.equals(object2))
            {
                return 0;
            }
            else
            {
                return 1;
            }
        });
    }

    public static void main(String[] args) {
        System.out.println(numberList);
        sortYourList(numberList);
        System.out.println(numberList);
    }

}
