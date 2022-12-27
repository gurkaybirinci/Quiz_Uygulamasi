package git.quiz_application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
    Scanner sc = new Scanner(System.in);
    int correctAnsCount = 0;
    int wrongAnsCount = 0;
    Questions q1 = new Questions("Which statement is true about Java?",
                "a) Java is a sequence-dependent programming language",
                "b) Java is a code dependent programming language",
                "c) Java is a platform-dependent programming language",
                "d) Java is a platform-independent programming language");
    Questions q2 = new Questions("What is the extension of java code files?",
                "a) .js",
                "b) .txt",
                "c) .class",
                "d) .java");
    Questions q3 = new Questions("Who invented Java Programming?",
                "a) Guido van Rossum",
                "b) James Gosling",
                "c) Dennis Ritchie",
                "d) Bjarne Stroustrup");
    Questions q4 = new Questions("Which one of the following is not a Java feature?",
                "a) Object-oriented",
                "b) Use of pointers",
                "c) Portable",
                "d) Dynamic and Extensible");
    Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?",
                "a) identifier & keyword",
                "b) identifier",
                "c) keyword",
                "d) none of the mentioned");

    public void logic(){
        Map<Questions, Character> hmap = new HashMap<>();
        hmap.put(q1, 'D');
        hmap.put(q2, 'D');
        hmap.put(q3, 'B');
        hmap.put(q4, 'B');
        hmap.put(q5, 'C');

        for(Map.Entry<Questions, Character> map:hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter your answer: ");
            Character ans = sc.next().charAt(0);

            int cans = Character.compare(ans, map.getValue());
            if (cans==0){
                System.out.println("Correct");
                correctAnsCount++;
            }else {
                System.out.println("Wrong");
                wrongAnsCount++;
            }
        }

        System.out.println("\n-------Result--------");
        System.out.println("Total Question: " + hmap.size());
        System.out.println("Correct Answered Questions: " + correctAnsCount);
        System.out.println("Wrong Answered Questions: " + wrongAnsCount);
        int percentage = (100*correctAnsCount)/hmap.size();
        System.out.println("Percentage: " + percentage);

        if (percentage>79){
            System.out.println("Performance : Very good.");
        } else if (percentage<41) {
            System.out.println("Performance : Very low.");
        }else {
            System.out.println("Performance : Medium.");
        }


    }
}
