package view;

import utils.Constants;
import utils.TextPrompt;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TextFieldBound extends JTextField {


    public TextFieldBound(String placeholder) {
        this.setFont(Constants.fontProject(Font.PLAIN, 16));
        this.placeholder(placeholder);
    }

    private void placeholder (String placeholder) {
        TextPrompt placeholderText = new TextPrompt(placeholder, this);
        placeholderText.setBorder(new EmptyBorder(0,0,0,0));
        placeholderText.changeAlpha(0.75f);
        placeholderText.changeStyle(Font.PLAIN);
    }

   /* @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Paint oldPaint = g2.getPaint();
        RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(
                0,0,getWidth(),getHeight(),50,50);
        g2.clip(r2d);
        g2.setPaint(new GradientPaint(0.0f, 0.0f, getBackground(),
                0.0f, getHeight(), getBackground()));
        g2.fillRect(0,0,getWidth(),getHeight());
        g2.setPaint(new GradientPaint(0.0f, 0.0f, Color.WHITE,
                0.0f, getHeight(), Color.WHITE));
        g2.drawRoundRect(0, 0, getWidth(), getHeight(), 55, 55);
        g2.setPaint(oldPaint);
        super.paintComponent(g);
    }*/

}
