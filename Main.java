import java.util.Scanner;

class Main {
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);
      System.out.println("On what day of the month were you born? (number)");
      int day = scan.nextInt();
      System.out.println("In which month were you born? (number)");
      int month = scan.nextInt();
      String dayword = "";
      String monthword = "";  
      if(day > 31)
      {
        System.out.println("error");
      }
      if(month > 12)
      {
        System.out.println("error");
      }
      
      //ares
      if ((month == 3 && day >= 21) || (month == 4 && day <= 19))
      {
        System.out.println("Your sign is Aries");
      }
      //Taurus
      if ((month == 4 && day >= 20) || (month == 5 && day <= 20))
      {
        System.out.println("Your sign is Taurus");
      }
      //gemini
      if ((month == 5 && day >= 21) || (month == 6 && day <= 20))
      {
        System.out.println("Your sign is Gemini");
      }
      //cancer
      if ((month == 6 && day >= 21) || (month == 7 && day <= 22))
      {
        System.out.println("Your sign is Cancer");
      }
      //leo
      if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
      {
        System.out.println("Your sign is Leo");
      }
      //virgo
      if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
      {
        System.out.println("Your sign is Virgo");
      }
      //libra
      if ((month == 9 && day >= 23) || (month == 10 && day <= 22))
      {
        System.out.println("Your sign is Libra");
      }
      //scorpio
      if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
      {
        System.out.println("Your sign is Scorpio");
      }
      //sagit
      if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
      {
        System.out.println("Your sign is Sagittarius");
      }
      //capricorn
      if ((month == 12 && day >= 23) || (month == 1 && day <= 19))
      {
        System.out.println("Your sign is Capricorn");
      }
      //aquarius
      if ((month == 1 && day >= 20) || (month == 2 && day <= 18))
      {
        System.out.println("Your sign is Aquarius");
      }
      //pisces
      if ((month == 2 && day >= 19) || (month == 3 && day <= 21))
      {
        System.out.println("Your sign is Pisces");
      }
      
      //making the dates words 
     if(month == 1)
     {
       monthword = "January";
     }
     
     if(month == 2)
     {
         monthword = "February";
     }
     if(month == 3)
     {
         monthword = "March";
     }
     if(month == 4)
     {
         monthword = "April";
     }
     if(month == 5)
     {
         monthword = "May";
     }
     if(month == 6)
     {
         monthword = "June";
     }
     if(month == 7)
     {
         monthword = "July";
     }
     if(month == 8)
     {
         monthword = "August";
     }
     if(month == 9)
     {
         monthword = "September";
     }
     if(month == 10)
     {
         monthword = "October";
     }
     if(month == 11)
     {
         monthword = "November";
     }
     if(month == 12)
     {
         monthword = "December";
     }
     
     if(day == 1)
     {
         dayword = "first";
     }
     if(day == 2)
     {
         dayword = "second";
     }
     if(day == 3)
     {
         dayword = "third";
     }
     if(day == 4)
     {
         dayword = "fourth";
     }
     if(day == 5)
     {
         dayword = "fifth";
     }
     if(day == 6)
     {
         dayword = "sixth";
     }
     if(day == 7)
     {
         dayword = "seventh";
     }
     if(day == 8)
     {
         dayword = "eighth";
     }
     if(day == 9)
     {
         dayword = "ninth";
     }
     if(day == 10)
     {
         dayword = "tenth";
     }
     if(day == 11)
     {
         dayword = "eleventh";
     }
     if(day == 12)
     {
         dayword = "twelfth";
     }
     if(day == 13)
     {
         dayword = "thirteenth";
     }
     if(day == 14)
     {
         dayword = "fourteenth";
     }
     if(day == 15)
     {
         dayword = "fifteenth";
     }
     if(day == 16)
     {
         dayword = "sixteenth";
     }
     if(day == 17)
     {
         dayword = "seventeenth";
     }
     if(day == 18)
     {
         dayword = "eighteenth";
     }
     if(day == 19)
     {
         dayword = "nineteenth";
     }
     if(day == 20)
     {
         dayword = "twentieth";
     }
     if(day == 21)
     {
         dayword = "twenty-first";
     }
     if(day == 22)
     {
         dayword = "twenty-second";
     }
     if(day == 23)
     {
         dayword = "twenty-third";
     }
     if(day == 24)
     {
         dayword = "twenty-fourth";
     }
     if(day == 25)
     {
         dayword = "twenty-fifth";
     }
     if(day == 26)
     {
         dayword = "twenty-sixth";
     }
     if(day == 27)
     {
         dayword = "twenty-seventh";
     }
     if(day == 28)
     {
         dayword = "twenty-eigth";
     }
     if(day == 29)
     {
         dayword = "twenty-ninth";
     }
     if(day == 30)
     {
         dayword = "thirtieth";
     }
     if(day == 31)
     {
         dayword = "thirty-first";
     }
     
     System.out.println("Your birthday is: " + monthword+" " +dayword); 
    }
}