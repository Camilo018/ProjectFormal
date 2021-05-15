package runner;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;
import controller.MainController;

import javax.swing.*;

public class Run {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatGradiantoMidnightBlueIJTheme() );
            new MainController();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
    }
}
