package edu.kyleknobloch.TestMarkProtect;

import edu.kyleknobloch.TestMarkProtect.Database.DBStart;
import edu.kyleknobloch.TestMarkProtect.UI.UIStart;

import javax.swing.*;

/**
 * Created by kyleknobloch on 11/30/15,
 * For
 * *
 * Actions:
 */
public class TMP {

    /**
     * Initialise the UI, Database connection, display the search or add UI. (this is basicly a man just not in the main
     * so it's more hidden
     */
    public TMP () {
        UIStart ui = new UIStart();
        DBStart db = new DBStart();

        do {
            switch (ui.showCommandUI()) {
                case 0:
                    searchLastName(ui.showSearchUI("Last name"));
                    break;
                case 1:
                    addChild(ui.showAddChildUI());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Bye bye!");
                    System.exit(1);
                    break;
            }
        } while (true);




    }

    public void addChild(String tokenizedString) {
        System.out.println(tokenizedString);
        //Scanner scanner = new Scanner(tokenizedString);

        String first, last, birthDay, band = "";

        //TODO: detokenize the String. Add to the Database and then return to main menu

            //StringTokenizer ST = new StringTokenizer(tokenizedString, "_");

            // Championship



            //first = ST.nextToken();
            //last = ST.nextToken();
            //birthDay = ST.nextToken();
           // band = ST.nextToken();

        //System.out.println(first + last + birthDay + band);


    }

    public void searchLastName(String searchContents) {
        System.out.println(searchContents);

    }


}
