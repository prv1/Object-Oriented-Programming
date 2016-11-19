/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useyear;

/**
 *
 * @author phillip389
 */
public class Year {
    private int currentYear;
    private int daysInYear = 365;
    private int daysFromBeginning;
    private int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    
    public Year(int month, int day){
        //currentYear = year;
        for(int i = 0; i < month; i++ ){
            switch(i){
                case 12:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 11:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 10:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 9:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 8:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 7:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 6:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 5:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 4:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 3:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 2:
                    daysFromBeginning += daysInMonth[i];
                    break;
                case 1:
                    daysFromBeginning += daysInMonth[i];
                    break;
                default:
            }
        }
        daysFromBeginning += day;
    }
    
    public int getDaysFromBeginning(){
        return daysFromBeginning;
    }
    public void setDaysInYear(int daysInYear){
        this.daysInYear = daysInYear;
    }
}
