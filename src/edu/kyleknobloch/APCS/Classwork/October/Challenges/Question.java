package edu.kyleknobloch.APCS.Classwork.October.Challenges;

import javax.swing.*;

/**
 * Questions
 */
public class Question {

    JOptionPane JO = new JOptionPane();

    public void Question() {


    }


    /**
     * Pre:  None
     * @return Returns the question and answers in String form.
     */
    public String question1 () {
        return "Question 1:\nWhat is Kyle's davoret color?\n1.) Red\n2.) Blue\n3.) Purple \n4.) Orange";
    }

    public String questoin2 () {
        return "Question 2:\nWhat is Kyle's least favoret color?\n1.) Red\n2.) Blue\n3.) Purple \n4.) Orange";
    }

    public String question3() {
        return "Question 3:\nWho is the teacher of this class??\n1.) Mr. Files\n2.) Brendan Sheean\n3.) JOHN JAMES DRUGAN THE FORTH! \n4.) JJDRUGSIV";
    }

    public String question4 () {
        return "Question 4:\nWhy is this class an AP class??\n1.) Becuase\n2.) Becuase it's taught at the college level\n3.) Becuase we can \n4.) WHO GIVES A CRAP?";
    }

    public String question5 () {
        return "Question 5:\nWhat is Mr. Drugan's favoret website??\n1.) downloadmoreram.com\n2.) downloadmoreram.net\n3.) downloadmoreram.org \n4.) downloadmoreram.network";
    }

    public String question6 () {
        return "Question 6:\nWhat is Mr. Drugan's least favoret website??\n1.) downloadmoreram.com\n2.) downloadmoreram.net\n3.) downloadmoreram.org \n4.) downloadmoreram.network";
    }

    public String question7 () {
        return "Question 7:\nWho dose the most work in the class?\n1.) Kyle\n2.) Toby\n3.) Andrew\n4.) Brendan";
    }

    public String question8 () {
        return "Question 8:\nWho is the creator of Steam??\n1.) Gabe\n2.) Gaben\n3.) PC Master Race\n4.) Java";

    }

    public String question9 () {
        return "Question 1:\nWill it snow today?\n1.) yes\n2.) no\n3.) I HATE SNOW\n4.) GLOBAL WARMING IS THE KEY";
    }

    public String question10 () {
        return "Question 1:\nWill this challenge get an A?\n1.) yes\n2.) yes\n3.) yes\n4.) yes";
    }


    /**
     *
     * @param question What is the question?
     * @return Returns the player's score
     */
    public int runQuestion(String question) {

        return Integer.parseInt(JO.showInputDialog(null, question + "\n\nEnter the number that is correct."));
    }


}
