package iVote;
import java.util.Random;

public class Student {

    // Generate a student ID based on a random 5-digit int
    public int studentID() {
        Random rand = new Random();
        return (1000 + rand.nextInt(9000));
    }

    public int singleAns() {
        Random randAns = new Random();
        int max = 4;
        int min = 1;
        return randAns.nextInt((max - min) + 1) + min;
    }
}
