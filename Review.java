import java.util.Scanner;

public  class Review {
//private User user;
//private Dish dish;
private int rating;
     private String feedback;
     public void getReview(/*User user,Dish dish*/){
         Scanner scanner=new Scanner(System.in);
         System.out.println("Please enter you rating form 1-5:");
         this.rating=  scanner.nextInt();
         System.out.println("Please enter you feedback:");
         this.feedback=scanner.next();
     }

     public int getRating() {
         return rating;
     }

     public void display(){
         //user.display();

         System.out.println("Rating ="+rating);
         System.out.println("Feedback:"+feedback);

     }
 }
