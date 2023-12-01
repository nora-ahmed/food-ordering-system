import java.util.ArrayList;
public class Restaurant {
    private String name;
    private String address;
    private String category;
    private String contactInfo;
    private float ratings;
    private Menu menu;

    public Restaurant(String name, String address, String contactInfo, float ratings, Menu menu) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.ratings = ratings;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public Menu getMenu() {
        return menu;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void addDish(Dish dish) {
        menu.addDish(dish);
    }

    public void removeDish(Dish dish) {
        menu.deleteDish(dish);
    }

    public void updateContactInformation(String newContactInfo) {
        this.contactInfo = newContactInfo;
    }

    public double getRatings() {
        return ratings;
    }

    public void displayMenu() {
        System.out.println("Restaurant: " + name);
        System.out.println(" Rating: " + ratings);
        System.out.println("Menu:");
        menu.displayMenu();
    }

    public void SelectedDishNumber(int dishNumber) {
        System.out.println("Selected dish number: " + dishNumber);
    }
    public Dish getDish(int num){
        return menu.getDish(num);
    }
}