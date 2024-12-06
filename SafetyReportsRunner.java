import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.awt.AWTEventMulticaster.remove;

public class SafetyReportsRunner {
    public static void main(String[] args) throws FileNotFoundException {
        File SafetyReportsNumbers = new File("C:\\Users\\BT_2S14_05\\IdeaProjects\\AdventOfCode_AmeliaFrench\\src\\SafetyReportsData");
        Scanner safetyReportsScanner = new Scanner(SafetyReportsNumbers);

        int numSafe = 0;
        while (safetyReportsScanner.hasNext()){
            List<Integer> report = new ArrayList<>();
            String data = safetyReportsScanner.nextLine();
            String[] dataByLetters = data.split("");
            String number = "";

            for (String dataByLetter : dataByLetters) {
                if (!Objects.equals(dataByLetter, " ")) {
                    number += dataByLetter;
                } else {
                    report.add(Integer.parseInt(number));
                    number = "";
                }
            }
            SafetyReports safetyReport = new SafetyReports(report);
            if ((safetyReport.isDecreasing() || safetyReport.isIncreasing()) && safetyReport.differencesSafe()){
                numSafe++;
            }
        }
        System.out.println("Num safe: ");
        System.out.println(numSafe);
    }
}
