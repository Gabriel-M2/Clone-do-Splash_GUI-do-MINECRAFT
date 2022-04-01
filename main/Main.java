package main;

import VIEW.Splash_GUI;

public class Main {

    public static void main(String[] args) {
       
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_GUI().setVisible(true);
            }
        });
        
    }
    
}
