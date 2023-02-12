/**
 *  @author: Azizbek Rakhimov
 * {@summary}: Job class takes input of title, salary, ration and calculates netSalary
 */
 
public class Job {
  private String title;
  private double salary;
  private double ratio;

// Fully-Parametrized constructor
  public  Job(String title, double salary, double ratio){
    this.title = title;
    this.ratio = ratio;
    this.salary = salary;
  }
// Default constructor
  public  Job(){
    this("Unknown", 0, 0.01);
  }
// setter 1 
  public void setTitle(String title){
    this.title = title;
  }
  //setter 2
  public void setSalary(double salary){
    if(salary<0){// if salary < 0 doesnt change the salary 
      System.out.println("Set value gretaer than 0");
      return;
    }
    this.salary = salary;
  }
  
  //setter 3 
  public void setRatio(double ratio){
    if (!(ratio > 0 && ratio<1)){// if salary is not between 0 and 1 return
      System.out.println("Set value between zero and 1");
      return;
    }
    this.ratio = ratio;
  }
//getter 1 returns String title
  public String getTitle(){
    return this.title;
  }
  //getter 2 double salary
  public double getSalary(){
    return salary;
  }
  //getter 3 double ratio
  public double getRatio(){
    return ratio;
  }

  // calculates netSalary and returns double
  public double calculateNetSalary(){
    return salary * (1+ratio);
    }
}

