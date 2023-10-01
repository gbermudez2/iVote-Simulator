package iVote;
import java.util.Random;

public class VotingService implements Question {

    public void multiChoice() {
        System.out.println("\nSelecting from a list of multiple-choice questions.\n");

        int[] qList = {1, 2, 3};

        Random rand = new Random();
        int max = 3;
        int min = 1;
        int qChoice = rand.nextInt((max - min) + 1) + min;

        switch(qChoice) {
            case 1:
                System.out.println("Which of these elements are noble gases?\na) Helium\nb) Chlorine\nc) Xenon\nd) Fluorine\n");
                break;
            case 2:
                System.out.println("Which of these US states borders the Atlantic Ocean?\na) West Virginia\nb) Virginia\nc) Georgia\nd) Vermont\n");
                break;
            case 3:
                System.out.println("Which of these countries speak German?\na) Luxembourg\nb) Belgium\nc) Germany\nd) Austria\n");
                break;
        }
    }

    public void singleChoice() {
        System.out.println("\nSelecting from a list of single-choice questions.\n");

        Random rand = new Random();
        int max = 3;
        int min = 1;
        int qChoice = rand.nextInt((max - min) + 1) + min;

        switch(qChoice) {
            case 1:
                System.out.println("What is the biggest US state by land area?\na) Texas\nb) Alaska\nc) California\nd) New York\n");
                break;
            case 2:
                System.out.println("Which country has the highest population?\na) China\nb) India\nc) USA\nd) Indonesia\n");
                break;
            case 3:
                System.out.println("What is the smallest country by land area?\na) San Marino\nb) Monaco\nc) Liechtenstein\nd) Vatican City\n");
                break;
        }
    }

    public String tabulation(int a, int b, int c, int d) {
        return ("\nANSWERS:\na: " + a + "\nb: " + b + "\nc: " + c + "\nd: " + d + "\n");
    }
}
