package Aula7.Ex72;
import java.util.Calendar;
public class DateND extends Date implements Comparable<DateND> {
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
 public DateND(int day, int month, int year){
     if(valid(day, month, year)){
         this.day   = day;
         this.month = month;
         this.year  = year;
     }
 }
 public DateND(){
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
 public int distance(){
      int distacia, difA, diaT,  cnt = 0, cnt1 = 0;
      difA = this.year - 2000; // diferença entre anos;
      diaT = difA * 365;  // dia total entre 01/01/2000 - 01/01/this.ano;

      for(int i = 1; i <= this.month; i++){
           cnt1 = monthDays(i, this.year) - 1;
        }

      if(difA >= 0){
            for(int i = 2000; i < this.year; i++){
                if(leapYear(i))
                cnt++;
            }
        }else{
            for(int i = 2000; i < this.year; i--){
                if(leapYear(i))
                cnt++;
            }
        }
        distacia = diaT + cnt + cnt1;
        return distacia;
    }
 public String toString(){
     return String.format("%04d-%02d-%02d", year, month, day);
 }
 public void print(){
     System.out.println("Data:" + this.toString());
 }
 @Override
 public int compareTo(DateND other) {
     // TODO Auto-generated method stub
     //DateND other = (DateND)o;
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
