import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cart {

    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        this.items.add(item);
    }



    public void removeItem(String itemName) {
        int itemIndex = -1;
        for (int i = 0; i < this.items.size(); i++) {
            CartItem item = this.items.get(i);
            if (item.getDish().getName().equals(itemName)) {
                itemIndex = i;
                break;
            }
        }

        if (itemIndex == -1) {
            System.out.println("Item not found in cart.");
            return;
        }

        CartItem item = this.items.get(itemIndex);
        if (item.quantity > 1) {
            System.out.println("Enter the quantity you want to remove for " + item.getDish().getName() + ": ");
            Scanner scanner = new Scanner(System.in);
            int quantityToRemove = scanner.nextInt();

            if (quantityToRemove > item.quantity) {
                System.out.println("Invalid quantity. Please enter a quantity less than or equal to the item's quantity.");
                return;
            }

            item.quantity -= quantityToRemove;
            if (item.quantity == 0) {
                this.items.remove(itemIndex);
            }
        } else {
            this.items.remove(itemIndex);
        }
    }


    public static class EmptyCartException extends Exception {

        public EmptyCartException(String message) {
            super(message);
        }
    }

    public void removeLastItem() throws EmptyCartException {
        if (this.items.isEmpty()) {
            throw new EmptyCartException("Cart is empty");
        }

        this.items.remove(this.items.size() - 1);
    }

    public List<CartItem> getItems() {
        return this.items;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (CartItem item : this.items) {
            totalPrice += item.getPrice() * item.quantity;
        }
        return totalPrice;
    }


    public String display() {
        StringBuilder cartDisplay = new StringBuilder("Your Cart:\n");
        int counter = 1;

        for (CartItem item : this.items) {
            cartDisplay.append("\n")
                    .append(counter++).append("- ")
                    .append(item.getDish().getName())
                    .append(" (Quantity: ")
                    .append(item.quantity)
                    .append(")");
        }

        cartDisplay.append("\n\nTotal Price: $").append(this.getTotalPrice());
        return cartDisplay.toString();
    }
}