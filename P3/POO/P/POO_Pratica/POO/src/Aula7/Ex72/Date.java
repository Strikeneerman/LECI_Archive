package Aula7.Ex72;

public abstract class Date {

    public abstract void set(int day,int month,int year);
    public abstract void setYear(int year);
    public abstract void setMonth(int month);
    public abstract void setDay(int day);
    public abstract int getDay();
    public abstract int getMonth();
    public abstract int getYear();
    public abstract Date increment();
    public abstract Date decrement();
    public abstract String toString();
    public abstract void print();
    public abstract Date date();

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
    
}
