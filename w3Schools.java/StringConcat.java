class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String customerName = "Alice";
        String orderedDish = "Pasta";
        double totalPrice = 12.99;

        // Using concat() method to create the order summary...Complete the remaining code
   String ordersummary = customerName.concat("").concat("ordered").concat("").concat(orderedDish).concat(".").concat("").concat("The total price is").concat("")+(totalPrice);
                                
System.out.println("Customer: "+customerName);
System.out.println("Ordered Dish: "+orderedDish);
System.out.println("Total Price: "+"$"+totalPrice);
System.out.println("Order Summary: "+ordersummary);
        // Print the final order summary
    }
}
