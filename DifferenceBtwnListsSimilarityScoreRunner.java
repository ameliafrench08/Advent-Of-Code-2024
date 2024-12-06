import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class DifferenceBtwnListsSimilarityScoreRunner {
    public static void main(String[] args) throws FileNotFoundException {

        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        List<Integer> newListOne = new ArrayList<>();
        List<Integer> newListTwo = new ArrayList<>();

        int listOneOrTwo = 0;
        File differenceBetweenListsNumbers = new File("C:\\Users\\BT_2S14_05\\IdeaProjects\\AdventOfCode_AmeliaFrench\\src\\DifferenceBtwnListsNumbers");
        Scanner myReader = new Scanner(differenceBetweenListsNumbers);

        while (myReader.hasNext()){

            String data = myReader.nextLine();
            String[] dataByLetters = data.split("");
            String toBeTotalNumOne = "";
            String toBeTotalNumTwo = "";
            for (int c = 0; c <= 4; c++){
                toBeTotalNumOne += dataByLetters[c];
                if (toBeTotalNumOne.length() == 5) {
                    listOne.add(Integer.parseInt(toBeTotalNumOne));
                }
            }
            for (int q = 8; q <=12; q++) {
                //8-12
                toBeTotalNumTwo += dataByLetters[q];
                if (toBeTotalNumTwo.length() == 5) {
                    listTwo.add(Integer.parseInt(toBeTotalNumTwo));
                }
            }
        }


        DifferenceBtwnLists difference = new DifferenceBtwnLists(listOne, listTwo);

        newListOne = difference.rearrangeListOne();

        newListTwo = difference.rearrangeListTwo();


        System.out.println();
        int finalDifference = difference.differences();
        System.out.println(finalDifference);

        SimilarityScore score = new SimilarityScore(newListOne, newListTwo);
        System.out.println("Score:");
        System.out.println(score.comparison());
    }

}
