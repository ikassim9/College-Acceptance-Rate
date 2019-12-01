import java.util.Scanner;
public class College {
   private int students;
   private int accepted;
   private int acceptedRate;
   Scanner scanner = new Scanner(System.in);

   public College() {
       students = 0;
       accepted = 0;
       acceptedRate = 0;
   }

   public College(int newstudents, int newaccepted) {
       this.students = newstudents;
       this.accepted = newaccepted;

   }

   public void DisplayAcceptedRate() {

       System.out.print("Number of students applied: ");
       students = scanner.nextInt();
       System.out.print("Number of students accepted: ");
       accepted = scanner.nextInt();
       double acceptedRate = (double)this.accepted/this.students;
       acceptedRate= acceptedRate*100;
       System.out.println("Acceptance rate is " + acceptedRate +"% " );


   }
}
