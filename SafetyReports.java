import java.util.ArrayList;
import java.util.List;

public class SafetyReports {
    private List<Integer> report = new ArrayList<>();
    private boolean isSafe;

    public SafetyReports(List<Integer> report){
        this.report = report;
    }

    public boolean isIncreasing(){
        int numTimesIncreasing = 0;
        for (int i = 0; i < report.size(); i++){
            if (report.size() - i >= 2 && (report.get(i) < report.get(i +1))){
                numTimesIncreasing++;
            }
        }
        return numTimesIncreasing + 1 == report.size();
    }

    public boolean isDecreasing(){
        int numTimesDecreasing = 0;
        for (int l = 0; l < report.size(); l++){
            if (report.size() - l >= 2 && (report.get(l) > report.get(l +1))){
                numTimesDecreasing++;
            }
        }
        return numTimesDecreasing + 1 == report.size();
    }

    public boolean differencesSafe(){
        for (int k = 0; k < report.size(); k++){
            int difference = 0;
            if (report.size() - k >= 2) {
                difference = Math.abs(report.get(k) - report.get(k + 1));
            }
            if (difference >= 4 || difference < 1){
                return false;
            }
        }
        return true;
    }
}
