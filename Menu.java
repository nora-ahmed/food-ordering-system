import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> menuItems;
    public Menu() {
        this.menuItems = new ArrayList<Dish>();
    }

    public void addDish(Dish menuItem)
    {
        menuItems.add(menuItem);
    }


    public void deleteDish(Dish dish) {
        if (menuItems.remove(dish)) {
            System.out.println("The dish " + dish.getName() + " was deleted from the menu.");
        } else {
            System.out.println("The dish " + dish.getName() + " was not found in the menu.");
        }
    }

    public void displayMenu() {
        for (int i = 0; i < menuItems.size(); i++)
        {
            System.out.print((i + 1) + ". ");
            menuItems.get(i).display();
        }
    }
    public Dish getDish(int num){
        return menuItems.get(num);
    }
}