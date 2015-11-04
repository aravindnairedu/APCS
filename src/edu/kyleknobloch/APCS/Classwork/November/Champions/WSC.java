package edu.kyleknobloch.APCS.Classwork.November.Champions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * World Series Champions
 */
public class WSC {
    // TODO: Better menu system and more options for this like JJ said.
    // TODO: Possibly better naming?

    private ArrayList<String> teams = new ArrayList<>();

    /**
     * Default Constructor. Takes in the file path and then fills the array. That's it.
     *
     * @param file the file's name or path
     * @throws IOException
     *
     * Will fill the ArrayList with the file's contents.
     */
    public WSC (String file) throws IOException {
        fillArrayList(file);

    }


    /**
     * Fill the array with the file's contents.
     *
     * @param filepath the file's bath
     * @throws IOException
     */
    public void fillArrayList (String filepath) throws IOException {
        File file = new File(filepath);
        int i = 0;
        Scanner filling = new Scanner(file);

        while (filling.hasNext()) {
            teams.add(i, filling.nextLine());
            //System.out.println(teams.get(i)); //DEBUG
            i++;
        }

    }

    public void newFile (String file) throws IOException {
        fillArrayList(file);
    }


    /**
     * Check to see how many times a team has won.
     *
     * @param team the team's name
     * @return how many times that team appeared in the file.
     */
    public int teamCount (String team) {
        //System.out.println(teams.size()); //DEBUG
        int teamCount = 0;

        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).equalsIgnoreCase(team)) {
                //System.out.println(teams.get(i)); //DEBUG
                teamCount++;
            }
        }

        return teamCount;
    }

    public int search (String team) {
        return teamCount(team);

    }

}
