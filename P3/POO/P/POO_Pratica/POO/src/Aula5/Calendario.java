package Aula5;

public class Calendario {

    int year,weekDayYear,weekDayMonth,month,day;
    String monthWord;
    public Calendario(int year, int weekDayYear){
        this.year = year;
        this.weekDayYear=weekDayYear;
    }

    public void set(int year, int weekDayYear){
        this.year = year;
        this.weekDayYear=weekDayYear;
    }
    public int getYear(){
        return year;
    }
    public int getfirstWeekDayOfYear(){
        return weekDayYear;
    }
    public int firstWeekdayOfMonth(int month){
        if(Date.validMonth(month)==true){
            weekDayMonth=weekDayYear;
            if(Date.leapYear(getYear())==true){
            switch(month){
                case 1:  
                         
                        break;
                case 2:
                         
                        weekDayMonth += 31;   
                        break;
                case 3: 
                         
                        weekDayMonth += 60;
                        break;
    
                case 4:  
                        weekDayMonth += 91;   
                        break;
                case 5: 
                        weekDayMonth += 121;   
                        break;
                case 6: 
                        weekDayMonth += 152;   
                        break;
                case 7: 
                        weekDayMonth += 182;   
                        break;
                case 8: 
                        weekDayMonth += 213;   
                        break;
                case 9: 
                        weekDayMonth += 244;   
                        break;
                case 10: 
                        weekDayMonth += 274;   
                        break;
                case 11:
                        weekDayMonth += 305;   
                        break;
                case 12:
                        weekDayMonth += 335;   
                        break;
            }
            }
            else{
            switch(month){
                case 1: 
                        break;
                case 2: 
                        weekDayMonth += 31;   
                        break;
                case 3: 
                        weekDayMonth += 59;
                        break;
    
                case 4:  
                        weekDayMonth += 90;   
                        break;
                case 5: 
                        weekDayMonth += 120;   
                        break;
                case 6: 
                        weekDayMonth += 151;   
                        break;
                case 7: 
                        weekDayMonth += 181;   
                        break;
                case 8: 
                        weekDayMonth += 212;   
                        break;
                case 9: 
                        weekDayMonth += 243;   
                        break;
                case 10:
                        weekDayMonth += 273;   
                        break;
                case 11:
                        weekDayMonth += 304;   
                        break;
                case 12:
                        weekDayMonth += 334;   
                        break;
                
            }
            }
            weekDayMonth = (weekDayMonth % 7);
            if(weekDayMonth==0) weekDayMonth=7;
      
        }
        else{
            System.out.print("Valor de mes invalido");
        }
        return weekDayMonth;
    }
    public void printMonth(int month){
        calculodays(getYear(),month);
        System.out.println("   " + monthWord +" "+ year +"     ");
        System.out.println(" Su Mo Tu We Th Fr Sa  ");
        int i;
        for (i=1;i<firstWeekdayOfMonth(month);i++)
		{
			System.out.print("   ");
		}
		for (int j=1;j<=calculodays(getYear(),month);j++)
		{
			if((i % 7) == 0)
			{
				System.out.printf(" %2d  \n ",j);
			}
			else 
			{
				System.out.printf("%2d ",j);
			}
			i++;
		}
		while((i % 7)!=0)
		{
			System.out.printf("   ");
			i++;
		}

         System.out.println();       
    }
    /*public String toString(){
        
        return year+"/"+month+"/"+day;
    }*/

    public int calculodays(int year,int month){

        switch(month){
            case 1: monthWord = "Janeiro";
                    day=31;   
                    break;
            case 2: monthWord = "Fevereiro";
                    if (Date.leapYear(getYear())==true)
                        {
                        day = 29;
                        }
                    else 
                    {
                        day = 28;
                    }
            break;

            case 3: monthWord = "Março";
                    day=31;   
                    break;
            case 4: monthWord = "Abril";
                    day=30;   
                    break;
            case 5: monthWord = "Maio";
                    day=31;   
                    break;
            case 6: monthWord = "Junho";
                    day=30;   
                    break;
            case 7: monthWord = "Julho";
                    day=31;   
                    break;
            case 8: monthWord = "Agosto";
                    day=31;   
                    break;
            case 9: monthWord = "Setembro";
                    day=30;   
                    break;
            case 10: monthWord = "Outubro";
                    day=31;   
                    break;
            case 11: monthWord = "Novembro";
                    day=30;   
                    break;
            case 12: monthWord = "Dezembro";
                    day=31;   
                    break;
        }
        return day;
    }
    
}
