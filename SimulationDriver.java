package iVote;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args) {
        System.out.println("Generating 20 random students and IDs");

        // Create an ArrayList of 20 student objects
        ArrayList<Student> studentList = new ArrayList<Student>(20);
        for (int i = 0; i < 20; i++) {
            Student s = new Student();
            studentList.add(s);
            System.out.println("Student " + studentList.get(i).studentID() + " registered.");
        }

        // Create a question choice
        VotingService newQuestion = new VotingService();
        Random rand = new Random();
        int max = 2;
        int min = 1;
        int qType = rand.nextInt((max - min) + 1) + min;

        // Answer types
        int a = 0, b = 0, c = 0, d = 0;

        // Generate answers
        newQuestion.multiChoice();
        for (Student student : studentList) {
            switch (student.singleAns()) {
                case 1:
                    a += 1;
                    break;
                case 2:
                    b += 1;
                    break;
                case 3:
                    c += 1;
                    break;
                case 4:
                    d += 1;
                    break;
            }
        }

        // Use VotingService to tabulate answers
        System.out.println(newQuestion.tabulation(a,b,c,d));
    }
}