import java.util.Scanner;
import java.util.InputMismatchException;
public class Order {

    Scanner input = new Scanner(System.in);
    // Taking from cart class attributes :

    private int pick_up_order;
    private String selectedTime;
    private final int ORDER_ID;
    private String restaurant_name;
    private Cart cart;
    private CartItem cartItem;
    private User user;

     private Restaurant restaurant;

    private Payment payment;

    public Order(int order_ID, Cart cart, User user, Restaurant restaurant, Payment payment) {
        this.ORDER_ID = order_ID;
        this.cart = cart;
        this.user = user;
        this.restaurant_name = restaurant.getName();
        this.payment = payment;
    }

    public int getPick_up_order() {
        return pick_up_order;
    }

    public void setPick_up_order(int pick_up_order) {
        this.pick_up_order = pick_up_order;
    }

    public String getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(String selectedTime) {
        this.selectedTime = selectedTime;
    }

    public int getOrder_ID() {

        return ORDER_ID;
    }




    public void Preferred_DeliveryTime() {
        boolean valid_input = false;

        do {
            try {
                System.out.println("Please enter the choice number of preferred time to pick up your order : ");
                System.out.println("1.Morning (between 7am-12pm)");
                System.out.println("2.Afternoon (between 12pm-4pm)");
                System.out.println("3.Evening (between 4pm-7pm)");
                System.out.println("4.Night (between 7pm-10pm)");
                pick_up_order = input.nextInt();

                // Array to store time descriptions
                String[] dayDurations = {
                        "Morning (between 7am-12pm)",
                        "Afternoon (between 12pm-4pm)",
                        "Evening (between 4pm-7pm)",
                        "Night (between 7pm-10pm)"
                };

                if (pick_up_order >= 1 && pick_up_order <= dayDurations.length) {
                    selectedTime = dayDurations[pick_up_order - 1];
                    // System.out.println(selectedTime);
                    valid_input = true;
                } else {
                    System.out.println("Invalid choice! Please try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid value.");
                input.nextLine();
                System.out.println("Please try again: ");
            }
        } while (!valid_input);

        Payment_information();
    }

    public void Payment_information() {

        if (payment.getPaymentStatus()) { // method returns boolean (if true)

            DeliverOrder();
        }
        else {

            System.out.println(" Please ensure that the payment process has been completed successfully.");
        }
    }

    public void DisplayOrder() {

        System.out.println("Thank you for choosing our service! your order will be ready for pickup on " + pick_up_order +"'\n' We appreciate your patience!");
        System.out.println("--------------------------------------------------------------------");
        System.out.println( user.getUserName()+ " order :");
        System.out.println("----> Order ID : " + ORDER_ID );
        System.out.println("----> Restaurant name : " + restaurant_name );
        System.out.println("----> Dishes : " + cartItem.getDish() + " (+ "+ cartItem.getQuantity()+")");
        System.out.println("----> Delivery Address : " + user.getDeliveryAddress());
        System.out.println("----> Delivery Time : " + selectedTime);
        System.out.println("----> Total price : " +cartItem.getPrice());
        System.out.println("----> Payment information :");
        System.out.println("------> Payment Method: " + payment.getPaymentMethod()); // i assumed the method names
        System.out.println("------> Total Amount: " + payment.getTotal());

    }

    public void DeliverOrder() {

        System.out.println("----> Your order is in progress and will be ready for pickup in 30 minutes. ");

        //  display Time tracking function
        OrderTimer orderTimer = new OrderTimer(2* 60); // Convert minutes to seconds
        orderTimer.startTimer();
    }


}