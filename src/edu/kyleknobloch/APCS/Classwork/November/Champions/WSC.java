package edu.kyleknobloch.APCS.Classwork.November.Champions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kyleknobloch on 11/2/15,
 * For
 * *
 * Actions:
 */
public class WSC {

    private String file;
    private ArrayList<String> teams = new ArrayList<>();
    private int teamCount = 0;


    /**
     * Default Constructor. Takes in the file and then fills the array. That's it.
     * @param file the file's name or path
     * @throws IOException
     */
    public WSC (String file) throws IOException {
        this.file  = file;
        fillArrayList(this.file);


    }


    /**
     * Fill the array with the file.
     *
     * @param filepath the file's bath
     * @throws IOException
     */
    public void fillArrayList (String filepath) throws IOException {
        file = filepath; //reset the file name so we know it's true;

        File file = new File(filepath);
        int i = 0;
        Scanner filling = new Scanner(file);

        while (filling.hasNext()) {
            teams.add(i, filling.nextLine());
            //System.out.println(teams.get(i)); //DEBUG
            i++;
        }

    }

    /**
     * fillArrayList() when the file is set in the class.
     */
    public void fillArrayList () throws IOException {
        fillArrayList(file);
    }

    public void newFile (String file) throws IOException {
        fillArrayList(file);
    }


    /**
     *
     * @param team the team's name
     * @return how many times that team appeared in the file.
     */
    public int teamCount (String team) {
        //System.out.println(teams.size()); //DEBUG

        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).equalsIgnoreCase(team)) {
                //System.out.println(teams.get(i)); //DEBUG
                teamCount++;
            }
        }

        return teamCount;
    }



}
