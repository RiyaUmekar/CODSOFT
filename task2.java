import java.util.Scanner;
class StudentCalculator
{
    public static void main(String[] args)
 {
        Scanner input = new Scanner(System.in);
        int numberOfSubjects;
        double percentage, average, x, sum = 0;
        char grade;
        
        System.out.print("Enter number of subjects: ");
        numberOfSubjects = input.nextInt();
        
        double[] marks = new double[numberOfSubjects];
        for(int i = 0; i <= marks.length - 1; i++)
       {
            System.out.print("Enter the mark: ");
            x = input.nextDouble(); 
            
          
            while(x > 100 || x < 0){
                System.out.println("Invalid mark.");
                System.out.print("Enter the mark: ");
                x = input.nextDouble();
            }
            
            marks[i] = x; 
            sum += marks[i];
        }
        
        average = sum / numberOfSubjects; 
        percentage = (average*100)/100;
        if(average >= 90)
            grade = 'A';
        else if(average >= 80)
            grade = 'B';
        else if(average >= 70)
            grade = 'C';
        else if(average >= 60)
            grade = 'D';
        else
            grade = 'F';
        
      
        System.out.println("Results: ");
        System.out.println("Total marks: " + sum);
        System.out.println("Average percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
    }
}
