package Aula7.Ex72;
import java.util.Calendar;

public class DateYMD extends Date implements Comparable<DateYMD> {
       private int day;
       private int month;
       private int year;
    
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
    public DateYMD(int day, int month, int year){
        if(valid(day, month, year)){
            this.day   = day;
            this.month = month;
            this.year  = year;
        }
    }
    public DateYMD(){
        dataAtual();
     }
    public void dataAtual(){
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
    @Override
    public int compareTo(DateYMD other) {
        // TODO Auto-generated method stub
        //DateYMD other = (DateYMD)o;
        int ano = this.year- other.year;
        if(ano > 0)
          return 1;
        else if(ano < 0)
          return -1;
        else{
            int mes = this.month - other.month;
            if(mes > 0)
              return 1;
            else if(mes < 0)
              return -1;
            else{
                int dia = this.day - other.day;
                if(dia > 0)
                  return 1;
                else if(dia < 0)
                  return -1;
                else 
                  return 0;
            }
        }
    }


}
