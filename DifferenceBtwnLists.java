import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DifferenceBtwnLists {
    List<Integer> listOne = new ArrayList<>();
    List<Integer> listTwo = new ArrayList<>();
    List<Integer> newListTwo = new ArrayList<>();
    List<Integer> newListOne = new ArrayList<>();

    public DifferenceBtwnLists(List<Integer> listOne, List<Integer> listTwo){
        this.listOne = listOne;
        this.listTwo = listTwo;
    }

    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public List<Integer> rearrangeListOne(){
            while (!listOne.isEmpty() && listOne.size() != 1){
                newListOne.add(Collections.min(listOne));
                listOne.remove(listOne.indexOf(Collections.min(listOne)));
                System.out.println(newListOne);
            }
            newListOne.add(listOne.getFirst());

        return newListOne;
    }

    public List<Integer> rearrangeListTwo(){
            while (!listTwo.isEmpty() && listTwo.size() != 1){
                newListTwo.add(Collections.min(listOne));
                listTwo.remove(listTwo.indexOf(Collections.min(listTwo)));
                System.out.println(newListTwo);
            }
            newListTwo.add(listTwo.getFirst());

        return newListTwo;
    }

    public int differences(){
        int sum = 0;
        for (int m = 0; m < newListOne.size(); m++){
            sum += (Math.abs(newListOne.get(m) - newListTwo.get(m)));
        }
        return sum;
    }

}
