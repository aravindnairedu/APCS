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
    GameTime gt = new GameTime(0, 60, 60);

    BigDecimal clicks = new BigDecimal(0.0);
    BigDecimal clicksPerSecond = new BigDecimal(0.0);
    long clicksPerClick = 10000;
    long initTime;

    int button3I = 8;


    gImage mainImage = new gImage("/test.png");
    gImage image = new gImage("/pepe.png");
    gImage image2 = new gImage("/spodermen.png");
    gImage image3 = new gImage("/jewsdidthis.gif");
    gImage image4 = new gImage("/themultiplyer.jpg");

    private Game game = new Game("Blank Template", 1366, 768);
    private ButtonComponent mainButton;
    private ButtonComponent itemButton;
    private ButtonComponent itemButton2;
    private ButtonComponent itemButton3;
    private ButtonComponent itemButton4;
    private ButtonComponent ItemButton4;
    private ButtonComponent saveButton;

    int mouseX, mouseY = 0;
    int place = 200;
    boolean dispUp = false;

    protected long costItem1 = 75;
    protected long costItem2 = 400;
    protected long costItem3 = 950;
    protected long costItem4 = 50000;

    public static void main(String args[])
    {
        new FredClicker().start();
    }

    public void start()
    {
        game.lockFramesToUpdates();
        game.setGameBase(this);

        mainButton = new ButtonComponent(game.getWidth()/2 - mainImage.getWidth()/2, game.getHeight()/2 - mainImage.getHeight()/2, mainImage.getWidth(), mainImage.getHeight(), mainImage);
        itemButton = new ButtonComponent(1050, 100, image.getWidth(), image.getHeight(), image);
        itemButton2 = new ButtonComponent(1050, 150, image2.getWidth(), image2.getHeight(), image2);
        itemButton3 = new ButtonComponent(900, 250, image3.getWidth(), image3.getHeight(), image3);
        itemButton4 = new ButtonComponent(900, 500, image4.getWidth(), image4.getHeight(), image4);

        game.getInputManager().registerMouseClickListener(mainButton);
        game.getInputManager().registerMouseClickListener(itemButton);
        game.getInputManager().registerMouseClickListener(itemButton2);
        game.getInputManager().registerMouseClickListener(itemButton3);
        game.getInputManager().registerMouseClickListener(itemButton4);

        mainButton.registerMouseClickEvent(mouseEvent -> click());
        itemButton.registerMouseClickEvent(mouseEvent -> buy());
        itemButton2.registerMouseClickEvent(mouseEvent -> buyItem2());
        itemButton3.registerMouseClickEvent(mouseEvent -> buyItem3());
        itemButton4.registerMouseClickEvent(mouseEvent -> buyItem4());

        game.startGame();
    }


    @Override
    public void onLaunch()
    {
        game.registerGuiComponent(mainButton);
        game.registerGuiComponent(itemButton);
        JOptionPane.showMessageDialog(null, "Welcome you scrub");
        initTime = System.currentTimeMillis();
    }

    @Override
    public void draw(GraphicsWrapper g)
    {
        g.clear();
        mainButton.render(g);

        if (clicks.compareTo(new BigDecimal(costItem1)) == 1 || clicks.compareTo(new BigDecimal(costItem1)) == 0)
            itemButton.render(g);
        if (clicks.compareTo(new BigDecimal(costItem2)) == 1 || clicks.compareTo(new BigDecimal(costItem2)) == 0)
            itemButton2.render(g);
        if (clicks.compareTo(new BigDecimal(costItem3)) == 1 || clicks.compareTo(new BigDecimal(costItem3)) == 0)
            itemButton3.render(g);
        if (clicks.compareTo(new BigDecimal(costItem4)) == 1 || clicks.compareTo(new BigDecimal(costItem4)) == 0)
            itemButton4.render(g);

        g.drawString("X: " + mouseX + " Y: " + mouseY, 10, 10);
        g.drawHorizontallyCenteredString("Clicks:" + clicks, game.getWidth() / 2, 50);
        g.drawHorizontallyCenteredString("Current Clicks Per Second:" + clicksPerSecond, game.getWidth() / 2, 75);
        g.drawHorizontallyCenteredString("Upgrades:", 1120, 70);
        g.drawHorizontallyCenteredString("FPS: " + gt.framesPerSecond, 1300, 20);

        if (dispUp && (place >= 120))
        {
            g.drawHorizontallyCenteredString("+ " + clicksPerClick, game.getWidth()/2, place);
            place -= 8;
        }
        else
        {
            dispUp = false;
            place = 200;
        }

    }

    @Override
    public void update(GameTime gameTime)
    {

        mouseX = (int) game.getInputManager().getMouseX();
        mouseY = (int) game.getInputManager().getMouseY();


        if (game.getInputManager().isKeyPressed(KeyEvent.VK_ESCAPE))
        {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you wish to quit?", "Quit?", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION)
                game.exit();
        }

        if (game.getInputManager().isKeyPressed(KeyEvent.VK_SPACE))
            click();


        if (System.currentTimeMillis() - initTime >= 100)
        {
            clicks = clicks.add(clicksPerSecond.divide(new BigDecimal(10)));
            initTime = System.currentTimeMillis();
        }


    }

    @Override
    public void onExit()
    {
        JOptionPane.showMessageDialog(null, "Thanks for playing!");
    }

    public void click()
    {
        clicks = clicks.add(new BigDecimal(clicksPerClick));
        dispUp = true;
    }

    public void buy()
    {
        if (clicks.compareTo(new BigDecimal(costItem1)) == 1 || clicks.compareTo(new BigDecimal(costItem1)) == 0)
        {
            clicksPerSecond = clicksPerSecond.add(new BigDecimal(.5));
            clicks = clicks.subtract(new BigDecimal(costItem1));
            costItem1 *= 1.4;
        }
    }
    public void buyItem2()
    {
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


}
