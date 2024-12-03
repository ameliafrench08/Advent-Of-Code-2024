import java.util.ArrayList;
import java.util.List;

public class DifferenceBtwnLists {
    List<Integer> listOne = new ArrayList<>();
    List<Integer> listTwo = new ArrayList<>();

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

        for (int i = 1; i <= factorial(listOne.size()); i++){
            for (int l = 0; l < listOne.size(); l++){
                if (listOne.get(l) > listOne.get(l+1)) {
                    int toCopy = listOne.get(l + 1);
                    listOne.remove(l + 1);
                    listOne.add(l, toCopy);
                }
            }
        }
        return listOne;
    }

    public List<Integer> rearrangeListTwo(){
        for (int i = 1; i <= factorial(listTwo.size()); i++){
            for (int l = 0; l < listTwo.size(); l++){
                if (listTwo.get(l) > listTwo.get(l+1)) {
                    int toCopy = listTwo.get(l + 1);
                    listTwo.remove(l + 1);
                    listTwo.add(l, toCopy);
                }
            }
        }
        return listTwo;
    }

    public int differences(){
        int sum = 0;
        for (int m = 0; m < listOne.size(); m++){
            sum += Math.abs(listOne.get(m) - listTwo.get(m));
        }
        return sum;
    }

}
