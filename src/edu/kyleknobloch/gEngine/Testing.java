/**

package edu.kyleknobloch.gEngine;

import com.goosejs.gengine.Game;
import com.goosejs.gengine.GameBase;
import com.goosejs.gengine.components.ButtonComponent;
import com.goosejs.gengine.graphics.GraphicsWrapper;
import com.goosejs.gengine.graphics.gImage;
import com.goosejs.gengine.util.GameTime;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Testing extends GameBase
{
    GameTime gt = new GameTime(0, 60, 60);

    BigDecimal clicks = new BigDecimal(0.0);
    BigDecimal clicksPerSecond = new BigDecimal(0.0);
    long clicksPerClick = 1;
    long initTime;



    gImage image = new gImage("/test.png");
    gImage image2 = new gImage("/pepe.png");
    gImage image3 = new gImage("/spodermen.png");

    private Game game = new Game("Blank Template", 1366, 768);
    private ButtonComponent mainButton;
    private ButtonComponent itemButton;
    private ButtonComponent itemButton2;
    private ButtonComponent saveButton;

    int mouseX, mouseY = 0;

    protected long costItem1 = 75;
    protected long costItem2 = 400;

    public static void main(String args[])
    {
        new Tester().start();
    }

    public void start()
    {
        game.lockFramesToUpdates();
        game.setGameBase(this);

        mainButton = new ButtonComponent(game.getWidth()/2 - image.getWidth()/2, game.getHeight()/2 - image.getHeight()/2, image.getWidth(), image.getHeight(), image);
        itemButton = new ButtonComponent(1050, 100, image2.getWidth(), image2.getHeight(), image2);
        itemButton2 = new ButtonComponent(1050, 150, image2.getWidth(), image2.getHeight(), image3);

        game.getInputManager().registerMouseClickListener(mainButton);
        game.getInputManager().registerMouseClickListener(itemButton);
        game.getInputManager().registerMouseClickListener(itemButton2);

        mainButton.registerMouseClickEvent(mouseEvent -> click());
        itemButton.registerMouseClickEvent(mouseEvent -> buy());
        itemButton2.registerMouseClickEvent(mouseEvent -> buyItem2());

        earnedClickTexts = new ArrayList<>();

        game.startGame();
    }


    @Override

    public void onLaunch()
    {
        game.registerGuiComponent(mainButton);
        game.registerGuiComponent(itemButton);
        JOptionPane.showMessageDialog(null, "Welcome!");
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

        g.drawString("X: " + mouseX + " Y: " + mouseY, 10, 10);
        g.drawHorizontallyCenteredString("Clicks:" + clicks, game.getWidth() / 2, 50);
        g.drawHorizontallyCenteredString("Current Clicks Per Second:" + clicksPerSecond, game.getWidth() / 2, 75);
        g.drawHorizontallyCenteredString("Upgrades:", 1120, 70);
        g.drawHorizontallyCenteredString("FPS: " + gt.framesPerSecond, 1300, 20);

        for (EarnedClickText currentText : earnedClickTexts)
            currentText.render(g);

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


        if (System.currentTimeMillis() - initTime >= 100)
        {
            clicks = clicks.add(clicksPerSecond.divide(new BigDecimal(10)));
            initTime = System.currentTimeMillis();
        }

        for (EarnedClickText currentText : earnedClickTexts)
        {
            currentText.update();
            if (currentText.shouldDispose())
                earnedClickTexts.remove(currentText);
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
        earnedClickTexts.add(new EarnedClickText("+ " + clicksPerClick, game.getDisplay().getDisplayWidth() / 2, 200, 120));
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


}
*/