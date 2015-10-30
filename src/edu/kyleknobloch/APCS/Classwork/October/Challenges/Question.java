package edu.kyleknobloch.APCS.Classwork.October.Challenges;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Questions
 */
public class Question {

    private ArrayList<String> questions = new ArrayList<>();


    /**
     * pre:  The ArrayList questoins has been created
     * post: The questions will be posted to that ArrayList
     */
    public Question() {
        questions.add(0, "We don't use the first one.");
        questions.add(1, "Question 1:\nWhat is Kyle's favoret color?\n1.) Red\n2.) Blue\n3.) Purple \n4.) Orange");
        questions.add(2, "Question 2:\nWhat is Kyle's least favoret color?\n1.) Red\n2.) Blue\n3.) Purple \n4.) Orange");
        questions.add(3, "Question 3:\nWho is the teacher of this class??\n1.) Mr. Files\n2.) Brendan Sheean\n3.) JOHN JAMES DRUGAN THE FORTH! \n4.) JJDRUGSIV");
        questions.add(4, "Question 4:\nWhy is this class an AP class??\n1.) Becuase\n2.) Becuase it's taught at the college level\n3.) Becuase we can \n4.) WHO GIVES A CRAP?");
        questions.add(5, "Question 5:\nWhat is Mr. Drugan's favoret website??\n1.) downloadmoreram.com\n2.) downloadmoreram.net\n3.) downloadmoreram.org \n4.) downloadmoreram.network");
        questions.add(6, "Question 6:\nWhat is Mr. Drugan's least favoret website??\n1.) downloadmoreram.com\n2.) downloadmoreram.net\n3.) downloadmoreram.org \n4.) downloadmoreram.network");
        questions.add(7, "Question 7:\nWho dose the most work in the class?\n1.) Kyle\n2.) Toby\n3.) Andrew\n4.) Brendan");
        questions.add(8, "Question 8:\nWho is the creator of Steam??\n1.) Gabe\n2.) Gaben\n3.) PC Master Race\n4.) Java");
        questions.add(9, "Question 1:\nWill it snow today?\n1.) yes\n2.) no\n3.) I HATE SNOW\n4.) GLOBAL WARMING IS THE KEY");
        questions.add(10, "Question 1:\nWill this challenge get an A?\n1.) yes\n2.) yes\n3.) yes\n4.) yes");
    }


    /**
     * Return the question asked for.
     * @param index what question?
     * @return The question in String form.
     */
    public String getQuestion (int index) {
        return questions.get(index);
    }


    /**
     *
     * @param question What is the question?
     * @return Returns the player's score
     */
    public int runQuestion(String question) {

        return Integer.parseInt(JOptionPane.showInputDialog(null, question + "\n\nEnter the number that is correct."));
    }


}
