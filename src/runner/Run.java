package runner;

import com.formdev.flatlaf.intellijthemes.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;
import controller.MainController;

import javax.swing.*;

public class Run {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMoonlightIJTheme());
            UIManager.put( "Button.arc", 999 );
            UIManager.put( "ProgressBar.arc", 999 );
            UIManager.put( "TextComponent.arc", 999 );

            new MainController();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
    }
}
