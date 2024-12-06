import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SimilarityScore {
    private List<Integer> listOne = new ArrayList<>();
    private List<Integer> listTwo = new ArrayList<>();
    private int totalScore;

    public SimilarityScore(List<Integer> listOne, List<Integer> listTwo){
        this.listOne = listOne;
        this.listTwo = listTwo;
        totalScore = 0;
    }

    public int comparison(){
        for (Integer value : listOne) {
            // MAYBE <=
            int totalTimesFound = 0;
            for (Integer integer : listTwo) {
                if (Objects.equals(value, integer)) {
                    totalTimesFound++;
                }
            }
            totalScore += value * totalTimesFound;

        }
        return totalScore;
    }

}
