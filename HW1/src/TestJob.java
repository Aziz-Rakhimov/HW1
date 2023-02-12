import java.util.Scanner;
/**
 * @author: Azizbek Rakhimov
 * {@summary}: The TestJob class with main method to print title, salary, ratio, netSalary of Job
 */
public class TestJob {
    public static void main(String[] args) throws Exception {
     Job job1 = new Job();// creating obj of Job class with default constructor
     //Printing default values
     System.out.print("Title: "+ job1.getTitle());
     System.out.printf(" Ratio: %.2f", job1.getRatio());
     System.out.printf(" Salary: %.2f", job1.getSalary());
     System.out.printf('\n'+"Job's NetSalary: %.2f", job1.calculateNetSalary());
     
    // Setting values for paramaters with setters and printing new values
    job1.setTitle("DBA");
    job1.setSalary(2000);
    job1.setRatio(0.3);
    System.out.print("\n"+"Title: "+ job1.getTitle());
    System.out.printf(" Ratio: %.2f", job1.getRatio());
    System.out.printf(" Salary: %.2f", job1.getSalary());
    System.out.printf('\n'+"Job's NetSalary: %.2f", job1.calculateNetSalary());
    
    Scanner scanner = new Scanner(System.in);//start of scanner
    System.out.println("\n"+"Enter job title: ");//asking user for inputs
    String title = scanner.nextLine();
    System.out.println("Enter your salary: ");
    double salary = scanner.nextDouble();
    while(salary<0){//checking and prompting until salary input is correct 
        System.out.println("Please enter value greater than zero");
        System.out.println("Enter your salary: ");
        salary = scanner.nextDouble();
        if(salary >= 0){
            break;
        }
    }//end of while loop

    System.out.println("Enter the ratio: ");
    double ratio = scanner.nextDouble();
    while(!(ratio > 0 && ratio < 1)){//checking and prompting until ratio input is correct 
        System.out.println("Please enter value between 0 and 1 ");
        System.out.println("Enter the ratio: ");
        ratio = scanner.nextDouble();
        if(ratio > 0 && ratio < 1){
            break;
        }
    }//end of while loop 

    Job job2 = new Job(title, salary, ratio);// creating new obj of class Job with user input 

    // printing  user inputted values
    System.out.println("Job's title: "+ job2.getTitle());
    System.out.println("Job's Ratio: "+ job2.getRatio());
    System.out.printf("Job's Salary: %1.0f",job2.getSalary());

    System.out.print("\n"+"Title: "+ job2.getTitle());
    System.out.printf(" Ratio: %.2f", job2.getRatio());
    System.out.printf(" Salary: %.2f", job2.getSalary());
    System.out.printf('\n'+"Job's NetSalary: %.2f", job2.calculateNetSalary());

    scanner.close();//closing scanner 
  }
}
