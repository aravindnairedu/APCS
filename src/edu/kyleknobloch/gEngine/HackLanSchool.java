package edu.kyleknobloch.gEngine;

import com.goosejs.gengine.Game;
import com.goosejs.gengine.GameBase;
import com.goosejs.gengine.graphics.GraphicsWrapper;
import com.goosejs.gengine.util.GameTime;

import javax.swing.*;
import java.awt.*;

public class HackLanSchool extends GameBase
{
    private Game game = new Game("hack LANSchool IT'S OVER 900!.exe.jar.loo.exe", 500, 200);
    private int barPosition = 1;
    private long initTime;
    private boolean finish = false;
    private int count = 0;


    public static void main(String args[])
    {
        new HackLanSchool().start();
    }


    public void start()
    {
        game.lockFramesToUpdates();
        game.setGameBase(this);
        game.startGame();
        initTime = System.currentTimeMillis();
    }


    @Override
    public void onLaunch()
    {
        Object[] options = {"Quit", "OH SHIT WHAT HAVE I DONE?", "FUCK YES BITCH DO IT!"};
        JOptionPane.showOptionDialog(null, "ARE YOU READY TO HACK LAN SCHOOL? ", "HACKZOR 9000",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);

    }


    @Override
    public void draw(GraphicsWrapper g)
    {
        Font font = new Font("Verdana", Font.BOLD, 25);
        Font updateFont = new Font("Verdana", Font.BOLD, 20);
        Color green = new Color(0, 255, 0);
        Color red = new Color(255, 0, 0);
        Color black = new Color(0, 0, 0);
        g.getGraphics().setFont(font);


        g.clear();

        if (!finish) {
            g.getGraphics().setColor(black);
            g.drawHorizontallyCenteredString("Hacking LanSchool...", 250, 30);

            //g.drawRectangle(50, 45, 400, 99);
            g.getGraphics().setColor(green);
            //g.drawFillRectange(50, 45, (int)(400 * (barPosition * .01)), 100);

            g.getGraphics().setFont(updateFont);
            g.getGraphics().setColor(red);
            if (barPosition < 15) {
                g.drawHorizontallyCenteredString("Initializing....", 250, 125);
            } else if (barPosition > 15 && barPosition < 35) {
                g.drawHorizontallyCenteredString("Started Part 1 of Hack LanSchool", 250, 125);
            } else if (barPosition > 35 && barPosition < 50) {
                g.drawHorizontallyCenteredString("Started Part 2 of Hack LanSchool", 250, 125);
            } else if (barPosition > 50 && barPosition < 56) {
                g.drawHorizontallyCenteredString("Warning! Something went wrong!", 250, 125);
            } else if (barPosition >= 56) {
                g.drawHorizontallyCenteredString("Warning! Something went wrong!", 250, 125);
                JOptionPane.showMessageDialog(null, "You've been caught hacking lan school. Report to Mr. Talbot's office NOW!");
                count++;
                if (count >= 11) {
                    JOptionPane.showMessageDialog(null, "lil bitch");
                    g.drawHorizontallyCenteredString("You're smart.", 250, 155);
                    barPosition = 100;
                }
            }

        } else {
            game.setBackground(green);
            g.drawHorizontallyCenteredString("Hack complete", 250, 30);
            g.getGraphics().setColor(black);
            g.drawHorizontallyCenteredString("LanSchool is now hacked forever!", 250, 125);
            g.getGraphics().setFont(updateFont);
            g.getGraphics().setColor(red);
            g.drawHorizontallyCenteredString("You're smart.", 250, 155);
        }

    }


    @Override
    public void update(GameTime gameTime)
    {
        if (barPosition < 56) {
            long curTime = System.currentTimeMillis();

            if ((curTime - initTime) > 100) {
                initTime = curTime;
                barPosition++;
                //System.out.println(barPosition); //DEBUG
            }

        }

        if (barPosition >= 100) {
            finish = true;
            barPosition = 101;
        }

    }


    @Override
    public void onExit()
    {
    }


}

