package com.s180282;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    String[] kolory ={"gfx/blue.png", "gfx/red.png", "gfx/green.png", "gfx/purple.png", "gfx/orange.png"};
    protected ImageIcon createImageIcon(String path,
                                        String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        JFrame f = new JFrame();
    f.setSize(1280,1024);
    f.setLayout(null);
    f.setTitle("Krysztalki");
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    JLabel[] krysztalki = new JLabel[81];
        Random r = new Random();
    for(int i =0;i<81;i++) {
        int temp = r.nextInt(5);
        krysztalki[i]=new JLabel(m.createImageIcon(m.kolory[temp], "test"));
        krysztalki[i].setBounds(70*(i%9), 70*(i/9),70 *(i%9)+70,70*(i/9)+70 );
        f.add(krysztalki[i]);
        krysztalki[i].setVisible(true);
    }
    JLabel wynik = new JLabel("Wynik:");
    JLabel wynik2 = new JLabel("XXXXXX");
    JLabel poziom = new JLabel("Poziom:  XXX");
    JLabel czas = new JLabel("Pozostały czas");
    JLabel czas2 = new JLabel("XXXX");
    JLabel menuButton =new JLabel(m.createImageIcon("gfx/button.png", "test"));
    wynik.setVisible(true);
        wynik2.setVisible(true);
    poziom.setVisible(true);
    czas.setVisible(true);
    czas2.setVisible(true);
    menuButton.setVisible(true);
    wynik.setFont(new Font("Calibri", Font.PLAIN,40));
    wynik2.setFont(new Font("Calibri", Font.PLAIN,40));
    poziom.setFont(new Font("Calibri", Font.PLAIN,40));
    czas.setFont(new Font("Calibri", Font.PLAIN,40));
    czas2.setFont(new Font("Calibri", Font.PLAIN,40));
    wynik.setBounds(950,10,300,40);
    wynik2.setBounds(950,0,300,200);
    poziom.setBounds(950,120,300,200);
    czas.setBounds(950,320,300,40);
    czas2.setBounds(950,280,300,200);
    menuButton.setBounds(950,800,300,100);
    f.add(wynik);
    f.add(wynik2);
    f.add(poziom);
    f.add(czas);
    f.add(czas2);
    f.add(menuButton);
    f.setVisible(true);
    }
}
