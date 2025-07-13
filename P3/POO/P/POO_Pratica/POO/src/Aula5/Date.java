package Aula5;

public class Date {
    int day,month,year;

    public Date(int day,int month,int year){
        this.set(day, month, year);
    }

    public void set(int day,int month,int year){
        if(valid(day, month, year)==true){
        this.day = day;
        this.month = month;
        this.year = year;
        }
        else{
        System.out.println("data invalida");
        }
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }

    public void increment(){
       
        this.day++;
        if(this.day>monthDays(this.month,this.year)){
            this.day = 1;
            this.month++;
            if(this.month>12){
                this.month = 1;
                this.year++;
            }
        }
    }

    public void decrement(){
        this.day--;
        if(this.day<1){
            this.month--;
            this.day = monthDays(this.month,this.year);
            if(this.month<1){
                this.month = 12;
                this.year--;
            }
        }

    }

    public static boolean validMonth(int month){
        if(month<1||month>12){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean valid(int day,int month, int year){
        if(validMonth(month)==true){
            if(day<1||day>monthDays(month, year)){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
       
    }
    public static boolean leapYear(int year){
        if (year % 400 == 0)
            {
                return true;
            }
            else if ((year %4 ==0 ) && (year % 100 != 0))
            {
                return true;
            }
            else 
            {
                return false;
            }
    }
    public static int monthDays(int month,int year){
         int day=0;
        switch(month){
            case 1:
                    day=31;   
                    break;
            case 2: 
                    if (leapYear(year)==true)
                        {
                            day = 29;
                        }
                    else{
                        day = 28;
                    }
            break;

            case 3:
            day=31;   
                    break;
            case 4: 
            day=30;   
                    break;
            case 5: 
            day=31;   
                    break;
            case 6: 
            day=30;   
                    break;
            case 7: 
            day=31;   
                    break;
            case 8: 
            day=31;   
                    break;
            case 9: 
            day=30;   
                    break;
            case 10:
            day=31;   
                    break;
            case 11:
            day=30;   
                    break;
            case 12:
            day=31;   
                    break;
        }
        return day;
    }
}

