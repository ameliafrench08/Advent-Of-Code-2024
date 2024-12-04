import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class DifferenceBtwnListsRunner {
    public static void main(String[] args) throws FileNotFoundException {
        File differenceBetweenListsNumbers = new File("DifferenceBtwnListsNumbers");
        Scanner myReader = new Scanner(differenceBetweenListsNumbers);
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        int listOneOrTwo = 0;

        for (int b = 1; b <= 10000; b++){
            String data = myReader.nextLine();
            String[] dataByLetters = data.split("");
            for (int c = 0; c <= 4; c++){
                listOne.add(Integer.parseInt(dataByLetters[c]));
            }
            for (int q = 0; q <=12; q++) {
                //8-12
                listTwo.add(Integer.parseInt(dataByLetters[q]));
            }
        }
    }

}
