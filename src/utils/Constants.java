package utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Constants {

    //  public static final int MIN_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    //  public static final int MIN_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    public static final int MIN_WIDTH = 720;
    public static final int MIN_HEIGHT = 480;


    public static final String TITTLE_COLOR = "#FF1A43";
    public static final int MIN_WIDTH_PHONE = 400;
    public static final int MIN_HEIGHT_PHONE = 800;
    public static Color COLOR_APP_DARK = new Color(37, 36, 39, 200);

    public static Font fontProject(int type, int Size) {
        Font fontProject = new Font("Montserrat", type, Size);
        return fontProject;
    }

    public static JLabel getSpace(int top, int left, int bottom, int right) {
        JLabel getSpace = new JLabel();
        getSpace.setBorder(new EmptyBorder(top, left, bottom, right));
        return getSpace;
    }

    public static JPanel insidePanel(Component comp, int top, int left, int bottom, int right, String color,
                                     boolean opaque) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.decode(color));
        panel.setOpaque(opaque);
        insidePanelContent(panel, comp, top, left, bottom, right);
        return panel;
    }

    private static void insidePanelContent(JPanel panel, Component comp, int top, int left, int bottom, int right) {
        panel.add(getSpace(top, 0, 0, 0), BorderLayout.PAGE_START);
        panel.add(getSpace(0, left, 0, 0), BorderLayout.LINE_START);
        panel.add(comp, BorderLayout.CENTER);
        panel.add(getSpace(0, 0, bottom, 0), BorderLayout.PAGE_END);
        panel.add(getSpace(0, 0, 0, right), BorderLayout.LINE_END);
    }

}
