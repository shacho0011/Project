/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Bayezid
 */
public class Calander {
    void calander(){
        JFrame calfrm = new JFrame();
        Calendar cal = new GregorianCalendar();
        JLabel Day = new JLabel();
        JLabel Month = new JLabel();
        JLabel Year = new JLabel();
        
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        
        Day.setText(+day+" "+(month+1)+" "+year);
        Day.setBounds(650, 230, 300, 20);
        
        calfrm.add(Day);
        calfrm.show(true);
        
        
    }
}
