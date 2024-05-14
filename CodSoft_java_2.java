import java.util.Scanner;
public class CodSoft_java_2 {
    public static void main(String[] args){
    double[] sub = new double[5];
    double total=0,percen;
    int n,i;
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("WELCOME TO THE GRADE CALCULATION SYSTEM");
        System.out.println("Enter your marks and you'll get to know your percentage and grade");
        System.out.print("Press 1 to know your grade: ");
        n = sc.nextInt();
        if(n!=1){
          System.out.println("Wrong input");
          System.out.println("Terminating...");
          break;
        }else{
              for(i=0;i<sub.length;i++){
                System.out.print("Enter marks for subject "+(i+1)+": ");
                sub[i] = sc.nextDouble();
                total = total + sub[i];
              }  
              percen = (total/(sub.length*100))*100;
              System.out.println("Total Marks obtained out of 500: "+total);
              System.out.println("Percentage obtained: "+percen+"%");
              if(percen>90 && percen<=100){
                System.out.println("Grade obtained: O");
              }else if(percen>80 && percen<=90){
                System.out.println("Grade obtained: E");
              }else if(percen>70 && percen<=80){
                System.out.println("Grade obtained: A");
              }else if(percen>60 && percen<=70){
                System.out.println("Grade obtained: B");
              }else if(percen>50 && percen<=60){
                System.out.println("Grade obtained: C");
              }else if(percen>40 && percen<=50){
                System.out.println("Grade obtained: D");
              }else{
                System.out.println("Grade obtained: F");
              }
            }
        }
    }
    
    }

