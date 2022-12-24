import java.util.ArrayList;
import java.util.List;

public class Sortowanie1 {
    public static void posortujListe(List<Integer> lista)
    {
        lista.sort((elementA, elementB)->
        {
            if(elementA<elementB)
            {
                return -1;
            }
            else if(elementA.equals(elementB))
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
        List<Integer>numbers= new ArrayList<>(List.of(33,12,1,2345,22,443,312,-9,-53,-7));
        System.out.println(numbers);
        posortujListe(numbers);
        System.out.println(numbers);
    }
}
