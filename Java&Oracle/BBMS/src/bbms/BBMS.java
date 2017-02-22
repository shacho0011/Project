/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbms;

import view.MainFrame;
import view.SignInForm;
import static java.lang.String.format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Shadhin
 */
public class BBMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // MainFrame mf = new MainFrame();
        //mf.setVisible(true);

        SignInForm sif = new SignInForm();
        sif.setVisible(true);
        Date d1 = new GregorianCalendar(2016, 4, 15, 2, 0).getTime();

        /**
         * Today's date
         */
        Date today = new Date();

        // Get msec from each, and subtract.
        long diff = today.getTime() - d1.getTime();

        System.out.println("The 21st century (up to " + today + ") is "
                + (diff / (1000 * 60 * 60 * 24)) + " days old.");

    }

}
