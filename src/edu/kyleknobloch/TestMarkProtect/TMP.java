package edu.kyleknobloch.TestMarkProtect;

import edu.kyleknobloch.TestMarkProtect.UI.MainGUI;

/**
 *
 */
public class TMP {


    private MainGUI UI;


    /**
     * Initialise the UI, Database connection, display the search or add UI. (this is basically a initializer class)
     */
    public TMP () {
        UI = new MainGUI();
    }


    /**
     * Change Main GUI's visibility.
     * @param vis visibility: true/fale
     */
    public void changeMainGUIVisibility(boolean vis) {
        UI.setVisible(vis);
    }


}
