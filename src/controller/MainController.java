package controller;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;

import javax.swing.*;

public class MainController {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatGradiantoMidnightBlueIJTheme() );
            new MainController();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
    }

}
