lass Codechef {
    public static void main(String[] args) {
        // Given variables: Prices of two items and a discount amount
        int itemPrice1 = 50, itemPrice2 = 30, discount = 10;

        // Calculate total price before discount

int tp = itemPrice1 + itemPrice2;
        // Apply discount to get the final price
int fp = tp - discount;


        // Calculate average price per item after discount
int ap = fp/2;

        // Print the final bill details
        System.out.println("Total Price is : "+tp);    // Prints total price before discount
        System.out.println("Final Price after the discount is : "+fp);    // Prints final price after discount
        System.out.println("Average Price is : "+ap);  // Prints average price per item
    }
}
