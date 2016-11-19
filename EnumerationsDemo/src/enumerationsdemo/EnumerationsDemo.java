/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerationsdemo;

/**
 *
 * @author phillip389
 */
public class EnumerationsDemo {
    public static enum MyDaysofTheWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};
    public static int DaysInYear = 365;
    public static int WeeksInYear = 52;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyDaysofTheWeek day = MyDaysofTheWeek.Monday;
        int DayInYear = 72 % 7;
        
        switch(DayInYear){
            case 0:
                day = MyDaysofTheWeek.Monday;
                break;
            case 1:
                day = MyDaysofTheWeek.Tuesday;
                break;
            case 2:
                day = MyDaysofTheWeek.Wednesday;
                break;
            case 3:
                day = MyDaysofTheWeek.Thursday;
                break;
            case 4:
                day = MyDaysofTheWeek.Friday;
                break;
            case 5:
                day = MyDaysofTheWeek.Saturday;
                break;
            case 6:
                day = MyDaysofTheWeek.Sunday;
                break;                
        }
        System.out.println(DayInYear);
        System.out.println(day);
    }
    
}
