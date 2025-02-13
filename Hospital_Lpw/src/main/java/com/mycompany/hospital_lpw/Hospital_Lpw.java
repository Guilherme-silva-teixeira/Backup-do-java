package com.mycompany.hospital_lpw;
import java.awt.Color;

import javax.swing.JFrame;

/*
*
*
*/

public class Hospital_Lpw extends JFrame
{
    public static void main(String[] args)
    {
        landingPage app = new landingPage();
        Color fundo = new Color(202,251,232);
        app.setTitle("Hospital");
        app.setBackground(fundo);
        app.setVisible(true);
    }
}