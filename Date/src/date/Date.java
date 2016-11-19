/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

/**
 *
 * @author prv1
 */
public class Date {
private int month, day, year, hour, minute, second;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public Date(){
        this.month = 05;
        this.day = 10;
        this.year = 1951;
        this.hour = 10;
        this.minute = 05;
        this.second = 00;
        
    }
    
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = 10;
        this.minute = 05;
        this.second = 00;        
    }
    
    public Date(int month, int day, int year, int hour, int minute, int second) {
        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;         
    }
    
    public void setMonth(int month){
        this.month = month;
    }
    
    public void setDay(int day){
        this.day = day;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setHour(int hour){
        this.hour = hour;
    }
    
    public void setMinute(int minute){
        this.minute = minute;
    }
    
    public void setSecond(int second){
        this.second = second;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getDay(){
        return this.day;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public int getHour(){
        return this.hour;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSecond(){
        return this.second;
    }
    
    public int compare(Date thatDate){
        int value = 0;
        if(this.year < thatDate.getYear()){
            value = -1;
            /*if(this.month < thatDate.getMonth()){
                if(this.day < thatDate.getDay()){
                    value = -1;
                }else if(this.day > thatDate.getDay()){
                    value = -1;
                }else if(this.day == thatDate.getDay()){
                    value = -1;
                }
            }else if(this.month > thatDate.getMonth()){
                if(this.day < thatDate.getDay()){
                    value = -1;
                }else if(this.day > thatDate.getDay()){
                    value = -1;
                }else if(this.day == thatDate.getDay()){
                    value = -1;
                }
            }else if(this.month == thatDate.getMonth()){
                if(this.day < thatDate.getDay()){
                    value = -1;
                }else if(this.day > thatDate.getDay()){
                    value = -1;
                }else if(this.day == thatDate.getDay()){
                    value = -1;
                }
            }*/
        }else if(this.year > thatDate.getYear()){
            value = 1;
            /*
            if(this.month < thatDate.getMonth()){
                if(this.day < thatDate.getDay()){
                    value = 1;
                }else if(this.day > thatDate.getDay()){
                    value = 1;
                }else if(this.day == thatDate.getDay()){
                    value = 1;
                }    
            }else if(this.month > thatDate.getMonth()){
                if(this.day < thatDate.getDay()){
                    value = 1;
                }else if(this.day > thatDate.getDay()){
                    value = 1;
                }else if(this.day == thatDate.getDay()){
                    value = 1;
                }
            }else if(this.month == thatDate.getMonth()){
                if(this.day < thatDate.getDay()){
                    value = 1;
                }else if(this.day > thatDate.getDay()){
                    value = 1;
                }else if(this.day == thatDate.getDay()){
                    value = 1;
                }
            }*/
        }else if(this.year == thatDate.getYear()){
            if(this.month < thatDate.getMonth()){
                value = -1;
                /*
                if(this.day < thatDate.getDay()){
                    value = -1;
                }else if(this.day > thatDate.getDay()){
                    value = -1;
                }else if(this.day == thatDate.getDay()){
                    value = -1;
                }   */
            }else if(this.month > thatDate.getMonth()){
                value = 1;
                /*
                if(this.day < thatDate.getDay()){
                    value = 1;
                }else if(this.day > thatDate.getDay()){
                    value = 1;
                }else if(this.day == thatDate.getDay()){
                    value = 1;
                }*/
            }else if(this.month == thatDate.getMonth()){
                if(this.day < thatDate.getDay()){
                    value = -1;
                }else if(this.day > thatDate.getDay()){
                    value = 1;
                }else if(this.day == thatDate.getDay()){
                    value = 0;
                }
            }            
        }
        return value;
    }
    
    public String toString(){
        return this.month + "/" + this.day + "/" + this.year + " " + this.hour + ":" + this.minute + ":" + this.second;
    }
}
