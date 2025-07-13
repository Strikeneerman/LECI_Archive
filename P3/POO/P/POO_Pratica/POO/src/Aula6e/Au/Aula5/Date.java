package Aula6e.Au.Aula5;
import java.util.Calendar;
public class Date {
       private int day;
       private int month;
       private int year;
    public static boolean validMonth(int month){
        return month >= 1 && month <= 12;
    }
    public static int monthDays(int month,int year){
        int day;
        if(validMonth(month)){
            switch (month) {
                case 2:
                    if(leapYear(year))
                        day = 29;
                    else 
                        day = 28;
                    break;
                case 4: case 6: case 9: case 11:
                        day = 30;
                    break;       
                default:
                        day = 31;
                    break;
            }
            return day;
        }
        return -7;
        
    }
    public static boolean leapYear(int year){
        return year % 4 == 0 && year % 100 != 0 ||  year % 400 == 0 ;
    }
    public static boolean valid(int day,int month,int year) {
        return validMonth(month) && year >= 0 && day >= 0 && day <= monthDays(month, year);
    }
    public void set(int day,int month,int year){
        if(valid(day, month, year)){
            this.day   = day;
            this.month = month;
            this.year  = year;
        }
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){return day;}
    public int getMonth(){return month;}
    public int getYear(){return year;}
    public Date date(){return this;}
    public Date(int day, int month, int year){
        if(valid(day, month, year)){
            this.day   = day;
            this.month = month;
            this.year  = year;
        }
    }
    public Date(){
        Calendar today = Calendar.getInstance();
        day   = today.get(Calendar.DAY_OF_MONTH);
        month = today.get(Calendar.MONTH) + 1;
        year  = today.get(Calendar.YEAR);
     }
    public Date increment(){
        day++;
        if(day > monthDays(month, year)){
            month++;
            day = 1;
            if(month > 12){
                year++;
                month = 1;
            }
        }
        return this;
    }
    public Date decrement(){
        day--;
        if(day < 1){
            month--;
            day = monthDays(month, year);
            if(month < 1){
              year--; 
              month = 12;
              day = monthDays(month, year);
            }
        }
        return this;
    }
    public String toString(){
        return String.format("%04d-%02d-%02d", year, month, day);
    }
    public void print(){
        System.out.println("Data:" + this.toString());
    }


}
