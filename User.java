public class User
{
    private String userName;
    private String email;
    private String password;
    private String deliveryAddress;

    public static int numberOfUser = 0;


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassWord(String password) {
        this.password = password;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getPassword() {
        return password;}
}