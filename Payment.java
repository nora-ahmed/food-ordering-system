import java.util.Scanner;

public class Payment {

    private String payment_method;
    public  int TransactionID;
    private boolean payment_status=false;
    private double total;
    private String creditCardNumber;




    public Payment(double total){



        this.total=total;



    }
    public void setPayment_method(String payment_method){

        this.payment_method=payment_method;
    }
    public String getPaymentMethod(){

        return payment_method;
    }
    public void setPayment_status(boolean payment_status){

        this.payment_method=payment_method;
    }
    public boolean getPaymentStatus(){
        return payment_status;
    }
    public void setTotal(double total){

        this.total=total;
    }

    public double getTotal(){

        return total;
    }
    public void paymentinfo(){
        System.out.println("the total is"+total);
        System.out.println("Payment Method: " + payment_method);
        System.out.println("Payment Status: " +(payment_status?"valid payment":"unvalid payment"));

    }


    public void processPayment() {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to choose a payment method
        System.out.println("Choose a payment method: ");
        System.out.println("1. Credit");
        System.out.println("2. Cash");

        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice==1){
            payment_method = "Credit";
            enterCreditCardNumber();
            payment_status = true;
        }
        else if(choice==2 ){
            payment_method = "Cash";
            payment_status = true;
        }else {
            System.out.println("Invalid choice. Defaulting to Cash.");
            payment_method = "Cash";
            payment_status = true;
        }




    }
    private void enterCreditCardNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter credit card number: ");
        String CreditCardNumber= scanner.nextLine();



        System.out.println("Credit card number entered: " + creditCardNumber);
    }
}