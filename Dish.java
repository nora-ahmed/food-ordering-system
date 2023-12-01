import java.util.Scanner;

public class Dish {
    private String name;
    private float price;
    private String description;
private Boolean combo=false,extraSalad=false,water=false;
Dish(String name,float price,String description){
    this.name=name;
    this.price=price;
    this.description=description;
}
public void customization(){
    Scanner scanner=new Scanner(System.in);
    char choice;
    System.out.println("Pay extra $5 and make it a combo? Y/N");
    choice=scanner.next().charAt(0);
    if (choice=='Y'||choice=='y'){
        this.combo=true;
    }
    System.out.println("Do you want extra salad for $3 ? Y/N");
    choice=scanner.next().charAt(0);
    if (choice=='Y'||choice=='y'){
        this.extraSalad=true;
    }
    System.out.println("Add water for $1 ? Y/N");
    choice=scanner.next().charAt(0);
    if (choice=='Y'||choice=='y'){
        this.water=true;

    }
    }

    public Boolean getCombo() {
        return combo;
    }

    public Boolean getExtraSalad() {
        return extraSalad;
    }

    public Boolean getWater() {
        return water;
    }

    public float getPrice() {
        return price;
    }

    /*public String getDescription() {
        return description;
    }*/


    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void display(){

    System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Description: "+description);

    }
}

