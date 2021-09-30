import java.util.Scanner;

public class App {
 
 public static void main(String[] args){ 
  
  Scanner console = new Scanner(System.in);
  
  int number_of_month, year;
  int daysinmonth = 0;
  String month= "Is invalid month entries must be between 1-12";
  
  System.out.println("Enter a year");
  year = console.nextInt();
  
  System.out.println("Enter a value for the month (1 = Jan, 2 = Feb, etc): ");
  number_of_month = console.nextInt();
  
  
  
  switch(number_of_month) {
        case 1:
            month = "January";
            daysinmonth = 31;
            break;
        
        case 2:
            month = "February";
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
             daysinmonth = 29;
            } else {
             daysinmonth = 28;
            }
            break;
        case 3:
            month = "March";
            daysinmonth = 31;
            break;
        case 4:
            month = "April";
            daysinmonth = 30;
            break;
        case 5:
            month = "May";
            daysinmonth = 31;
            break;
        case 6:
            month = "June";
            daysinmonth = 30;
            break;
        case 7:
            month = "July";
            daysinmonth = 31;
            break;
        case 8:
            month = "August";
            daysinmonth = 31;
            break;
        case 9:
            month = "September";
            daysinmonth = 30;
            break;
        case 10:
            month = "October";
            daysinmonth = 31;
            break;
        case 11:
            month = "November";
            daysinmonth = 30;
            break;
        case 12:
            month = "December";
            daysinmonth = 31;
  }
  
  System.out.println(month + " of " + year + " has " + daysinmonth + " days");
  System.out.println("Goodbye...");
  console.close();
 }
}