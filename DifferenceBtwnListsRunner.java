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
            String toBeTotalNumOne = "";
            StringBuilder toBeTotalNumTwo = new StringBuilder();
            for (int c = 0; c <= 4; c++){
                toBeTotalNumOne += dataByLetters[c];
                listOne.add(Integer.parseInt(toBeTotalNumOne));
            }
            for (int q = 8; q <=12; q++) {
                //8-12
                toBeTotalNumTwo.append(dataByLetters[q]);
                listTwo.add(Integer.parseInt(String.valueOf(toBeTotalNumTwo)));
            }
        }
        System.out.println("List one: ");
        System.out.println(listOne);

        System.out.println();

        System.out.println("List two: ");
        System.out.println(listTwo);
    }

}
