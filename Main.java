import java.util.ArrayList;
import java.util.Scanner;

class mainMenu{

    public void displayMainMenu(){
        while(true) {
            int choice;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter you choice:");
            System.out.println("1) Display all restaurants.");
            System.out.println("2) Search.");
            System.out.println("3) View cart.");
            System.out.println("4) Log out.");
            choice = scanner.nextInt();
            if (choice == 1) {
               displayRestaurants();

            } else if (choice == 2) {
                search();
            } else if (choice == 3) {
                this.viewCart();
                //display cart
                //custom
                //edit:quantity delete
                //place order

            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice, Please try Again.");

            }
        }
    }
public void displayRestaurants(){

            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ") Restaurant: " + Main.r[i].getName());
                System.out.println("Rating: " + Main.r[i].getRatings());

            }
            System.out.println("Please enter your choice: 1-3:");

            Scanner resScanner = new Scanner(System.in);
            int resChoice = resScanner.nextInt();
            Main.r[(resChoice - 1)].displayMenu();
            while (true) {

                System.out.println("Please enter your choice: 1-5 or enter 0 to go back:");
                int dishChoice = resScanner.nextInt();
                if (dishChoice == 0) {
                    break;
                } else if (dishChoice >= 1 && dishChoice <= 5) {
                    Dish d = Main.r[(resChoice - 1)].getDish(dishChoice - 1);
                    CartItem ci = new CartItem(d, 5);
                    Main.c.addItem(ci);

                }

            }

}
public void viewCart(){
    Main.c.display();
    while(true){
    System.out.println("Please enter your choice:");
    System.out.println("1) Edit your order.");
    System.out.println("2) Place your order.");
    System.out.println("3) Go back.");
    Scanner scanner=new Scanner(System.in);
    int cartChoice=scanner.nextInt();

        if (cartChoice == 1) {
            while(true){
            System.out.println("Please enter your choice:");
            System.out.println("1) Customize your order.");
            System.out.println("2) Edit the quantity.");
            System.out.println("3) Delete an item.");
            System.out.println("4) Go back");
            Scanner scanner1 = new Scanner(System.in);
            int cusChoice = scanner1.nextInt();
            if (cusChoice == 1) {

            } else if (cusChoice == 2) {

            } else if (cusChoice == 3) {
                System.out.println("Please enter the item's name:");
                String itemName;
                Scanner scanner2 = new Scanner(System.in);
                itemName = scanner2.next();
                Main.c.removeItem(itemName);


            } else if (cusChoice == 4) {
                break;
        }}

    }else if (cartChoice == 3) {
            break;
        }}
}
public void search() {
    while(true) {
        System.out.println("Please enter you choice:");
        System.out.println("1) Search by restaurant name.");
        System.out.println("2) Search by restaurant category.");
        System.out.println("3) Go back.");
        Scanner scanner = new Scanner(System.in);
        int searchChoice = scanner.nextInt();
        if (searchChoice == 1) {
            System.out.println("Please enter the restaurant name:");
            Scanner scanner1 = new Scanner(System.in);
            String resName = scanner1.next();
            boolean flag = false;
            for (int i = 0; i < 3; i++) {
                if (resName.equals(Main.r[i].getName())) {
                    flag = true;
                    Main.r[i].displayMenu();

                    while (true) {
                        System.out.println("Please enter your choice: 1-5 or enter 0 to go back:");
                        Scanner scanner2 = new Scanner(System.in);
                        int dishChoice = scanner2.nextInt();
                        if (dishChoice == 0) {
                            break;

                        } else if (dishChoice >= 1 && dishChoice <= 5) {
                            Dish d = Main.r[i].getDish(dishChoice - 1);
                            CartItem ci = new CartItem(d, 5);
                            Main.c.addItem(ci);
                        }
                    }

                }
            }
            if (!flag) {
                System.out.println("Sorry, we don't have this restaurant.");
                break;
            }
        }
        if (searchChoice == 3) {
            break;
        }
    }}
    public void WelcomePage(){

        Scanner read = new Scanner(System.in);

        User[] user;
        user = new User[10];

        boolean state = false;
        do {

            int option;

            boolean checkRegistration = false;

            boolean checkLogin = false;

            int index = User.numberOfUser;

            System.out.println("Welcome To Our Program");

            System.out.println("press 1 to register");

            System.out.println("press 2 to login");

            System.out.println("press 0 to close the program");

            option = read.nextInt();

            switch (option)
            {
                case 1:{

                    user[index] = new User();

                    System.out.println("Enter your user name");
                    String username = read.next();

                    for (int i  = 0 ; i < index ; i++){

                        if (username.equals(user[i].getUserName()))
                        {
                            System.out.println("user name already exists");

                            checkRegistration = true;

                            break;
                        }

                    }

                    if(checkRegistration){

                        state = true;

                        break;

                    }

                    System.out.println("Enter your Email");
                    String email = read.next();

                    for (int i  = 0 ; i < index ; i++){

                        if (email.equals(user[i].getEmail()))
                        {
                            System.out.println("email already exists");

                            checkRegistration = true;

                            break;
                        }

                    }

                    if(checkRegistration){

                        state = true;

                        break;

                    }

                    user[index].setUserName(username);
                    user[index].setEmail(email);


                    System.out.println("Enter your Delivery Address");
                    String deliveryAddress = read.next();
                    user[index].setDeliveryAddress(deliveryAddress);


                    System.out.println("Enter your Password");
                    String password = read.next();
                    user[index].setPassWord(password);


                    User.numberOfUser++;

                    state = true;

                    break;
                }
                case 2:{
                    System.out.println("Enter your User Name");
                    String username = read.next();

                    System.out.println("Enter your Password");
                    String password = read.next();

                    for (int i  = 0 ; i < index ; i++ ){

                        if(username.equals(user[i].getUserName()) && password.equals(user[i].getPassword()) ){

                            System.out.println("login successfully");

                            checkLogin = true;
                         this.displayMainMenu();



                        }
                    }

                    //checkLogin = true;

                    if(!checkLogin)
                    {
                        System.out.println("invalid userName or password");
                    }

                    state = true;


                    break;
                }
                case 0:
                {
                    state = false;

                    break;
                }
                default:
                {
                    System.out.println("Invalid Option");

                    state = true;
                }
            }
        } while (state);
    }
}
public class Main {

static Restaurant r[]=new Restaurant[3] ;
    static Menu m=new Menu();
    static Menu v=new Menu();

static Cart c=new Cart();
    public static void main(String[] args) {
        Dish d=new Dish("ldldl",30,"dkdkk");
        m.addDish(d);
for (int i=1;i<3;i++){
    r[i]=new Restaurant("fkkfkf","jhfhdfkj","fhjfkhkd", 4.5F,m);
}

r[0]=new Restaurant("Nora","nora","nora",3.5F,v);
        Dish b=new Dish("Pizza",30,"sssss");
        v.addDish(b);
for(int i=1;i<5;i++){
    Dish m=new Dish("Burger",50,"fries");
   v.addDish(m);
}


mainMenu j=new mainMenu();
j.WelcomePage();


        }
    }
