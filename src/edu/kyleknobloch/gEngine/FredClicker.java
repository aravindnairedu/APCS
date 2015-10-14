package edu.kyleknobloch.gEngine;

import com.goosejs.gengine.Game;
import com.goosejs.gengine.GameBase;
import com.goosejs.gengine.components.ButtonComponent;
import com.goosejs.gengine.graphics.GraphicsWrapper;
import com.goosejs.gengine.graphics.gImage;
import com.goosejs.gengine.util.GameTime;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;

public class FredClicker extends GameBase
{
    //Game time
    GameTime gt = new GameTime(0, 60, 60);

    //initialise numbers
    BigDecimal clicks = new BigDecimal(0.0);
    BigDecimal clicksPerSecond = new BigDecimal(0.0);
    long clicksPerClick = 1;
    long clicksPerClickAdvanced = 10000;
    long initTime;


    //images
    gImage mainImage = new gImage("/test.png");
    gImage image = new gImage("/pepe.png");
    gImage image2 = new gImage("/spodermen.png");
    gImage image3 = new gImage("/jewsdidthis.gif");
    gImage image4 = new gImage("/themultiplyer.jpg");
    gImage image5 = new gImage("/alphabet.png");

    private Game game = new Game("Blank Template", 1366, 768);


    //ButtonComponets
    private ButtonComponent mainButton;
    private ButtonComponent itemButton;
    private ButtonComponent itemButton2;
    private ButtonComponent itemButton3;
    private ButtonComponent itemButton4;
    private ButtonComponent itemButton5;
    private ButtonComponent saveButton;

    //More ints
    int button3I = 8;
    int mouseX, mouseY = 0;
    int place = 200;
    boolean dispUp = false;

    //item costs
    protected long costItem1 = 75;
    protected long costItem2 = 400;
    protected long costItem3 = 950;
    protected long costItem4 = 50000;
    protected long costItem5 = 1000000;


    //couting how many perceses we have made
    private long numberOfPercheses = 0;


    public static void main(String args[]) {
        /**
         * start
         */
        new FredClicker().start();
    }

    public void start() {
        /**
         * start
         */

        game.lockFramesToUpdates();
        game.setGameBase(this);

        //Setup the images on the canvas
        mainButton = new ButtonComponent(game.getWidth()/2 - mainImage.getWidth()/2, game.getHeight()/2 - mainImage.getHeight()/2, mainImage.getWidth(), mainImage.getHeight(), mainImage);
        itemButton = new ButtonComponent(1050, 100, image.getWidth(), image.getHeight(), image);
        itemButton2 = new ButtonComponent(1050, 150, image2.getWidth(), image2.getHeight(), image2);
        itemButton3 = new ButtonComponent(900, 250, image3.getWidth(), image3.getHeight(), image3);
        itemButton4 = new ButtonComponent(900, 500, image4.getWidth(), image4.getHeight(), image4);
        itemButton5 = new ButtonComponent(450, 500, image5.getWidth(), image5.getHeight(), image5);

        //Setup the clicking
        game.getInputManager().registerMouseClickListener(mainButton);
        game.getInputManager().registerMouseClickListener(itemButton);
        game.getInputManager().registerMouseClickListener(itemButton2);
        game.getInputManager().registerMouseClickListener(itemButton3);
        game.getInputManager().registerMouseClickListener(itemButton4);
        game.getInputManager().registerMouseClickListener(itemButton5);

        //setup clicking (2)
        mainButton.registerMouseClickEvent(mouseEvent -> click());
        itemButton.registerMouseClickEvent(mouseEvent -> buy());
        itemButton2.registerMouseClickEvent(mouseEvent -> buyItem2());
        itemButton3.registerMouseClickEvent(mouseEvent -> buyItem3());
        itemButton4.registerMouseClickEvent(mouseEvent -> buyItem4());
        itemButton5.registerMouseClickEvent(mouseEvent -> buyItem5());

        //Start the game
        game.startGame();
    }


    @Override
    public void onLaunch()  {
        /**
         * On Launch
         */
        game.registerGuiComponent(mainButton);
        game.registerGuiComponent(itemButton);
        JOptionPane.showMessageDialog(null, "Welcome you scrub");
        initTime = System.currentTimeMillis();
    }


    @Override
    public void draw(GraphicsWrapper g) {
        /**
         * Draw
         */

        g.clear();
        mainButton.render(g);

        //render based off weather or not you can afford these items
        if (clicks.compareTo(new BigDecimal(costItem1)) == 1 || clicks.compareTo(new BigDecimal(costItem1)) == 0)
            itemButton.render(g);
        if (clicks.compareTo(new BigDecimal(costItem2)) == 1 || clicks.compareTo(new BigDecimal(costItem2)) == 0)
            itemButton2.render(g);
        if (clicks.compareTo(new BigDecimal(costItem3)) == 1 || clicks.compareTo(new BigDecimal(costItem3)) == 0)
            itemButton3.render(g);
        if (clicks.compareTo(new BigDecimal(costItem4)) == 1 || clicks.compareTo(new BigDecimal(costItem4)) == 0)
            itemButton4.render(g);
        if (clicks.compareTo(new BigDecimal(costItem5)) == 1 || clicks.compareTo(new BigDecimal(costItem4)) == 0)
            itemButton5.render(g);

        //Draw some words
        g.drawString("X: " + mouseX + " Y: " + mouseY, 10, 10);
        g.drawHorizontallyCenteredString("Clicks:" + clicks, game.getWidth() / 2, 50);
        g.drawHorizontallyCenteredString("Current Clicks Per Second:" + clicksPerSecond, game.getWidth() / 2, 75);
        g.drawHorizontallyCenteredString("Upgrades:", 1120, 70);
        g.drawHorizontallyCenteredString("FPS: " + gt.framesPerSecond, 1300, 20);

        if (dispUp && (place >= 120)) {
            g.drawHorizontallyCenteredString("+ " + clicksPerClick, game.getWidth()/2, place);
            place -= 8;
        } else {
            dispUp = false;
            place = 200;
        }

    }


    @Override
    public void update(GameTime gameTime) {
        /**
         * On update
         */

        mouseX = (int) game.getInputManager().getMouseX();
        mouseY = (int) game.getInputManager().getMouseY();


        if (game.getInputManager().isKeyPressed(KeyEvent.VK_ESCAPE)) {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you wish to quit?", "Quit?", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION)
                game.exit();
        }

        if (game.getInputManager().isKeyPressed(KeyEvent.VK_SPACE)) {
            click();
        }

        if (game.getInputManager().isKeyPressed(KeyEvent.VK_S)) {
            advancedClick();
        }

        if (System.currentTimeMillis() - initTime >= 100)
        {
            clicks = clicks.add(clicksPerSecond.divide(new BigDecimal(10)));
            initTime = System.currentTimeMillis();
        }


    }


    @Override
    public void onExit() {
        /**
         * on Exit, bye bye
         */
        JOptionPane.showMessageDialog(null, "Thanks for playing!");
    }


    public void click() {
        /**
         * Click
         */
        clicks = clicks.add(new BigDecimal(clicksPerClick));
        dispUp = true;
    }

    public void advancedClick() {
        /**
         * advanced click
         */
        clicks = clicks.add(new BigDecimal(clicksPerClickAdvanced));
        dispUp = true;
    }


    /**
     * Buy methods
     */

    public void buy() {
        if (clicks.compareTo(new BigDecimal(costItem1)) == 1 || clicks.compareTo(new BigDecimal(costItem1)) == 0)
        {
            clicksPerSecond = clicksPerSecond.add(new BigDecimal(.5));
            clicks = clicks.subtract(new BigDecimal(costItem1));
            costItem1 *= 1.4;
        }
    }

    public void buyItem2() {
        if (clicks.compareTo(new BigDecimal(costItem2)) == 1 || clicks.compareTo(new BigDecimal(costItem2)) == 0)
        {
            clicksPerSecond = clicksPerSecond.add(new BigDecimal(4));
            clicks = clicks.subtract(new BigDecimal(costItem2));
            costItem2 *= 1.4;
        }
    }

    public void buyItem3() {
        if (clicks.compareTo(new BigDecimal(costItem3)) == 1 || clicks.compareTo(new BigDecimal(costItem3)) == 0) {
            clicksPerSecond = clicksPerSecond.add(new BigDecimal(button3I));
            clicks = clicks.subtract(new BigDecimal(costItem3));
            costItem3 *= 1.4;
            button3I = button3I * 2;
        }
    }

    public void buyItem4 () {
        //multiplyer
        if (clicks.compareTo(new BigDecimal(costItem4)) == 1 || clicks.compareTo(new BigDecimal(costItem4)) == 0) {
            clicksPerSecond = clicksPerSecond.add(clicksPerSecond.multiply(new BigDecimal(2)));
            clicks = clicks.subtract(new BigDecimal(costItem4));
            costItem3 *= 750;
        }
    }

    public void buyItem5 () {
        if (clicks.compareTo(new BigDecimal(costItem5)) == 1 || clicks.compareTo(new BigDecimal(costItem5)) == 0) {
            //cps = cps * (cps *
        }

    }


}
