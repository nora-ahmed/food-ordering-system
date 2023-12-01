/*import java.util.Scanner;

public class Main {

    public static void WelcomePage(){

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

                            checkLogin = false;


                        }
                    }

                    checkLogin = true;

                    if(checkLogin)
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

    public static void main(String[] args) {

        WelcomePage();

    }
}*/