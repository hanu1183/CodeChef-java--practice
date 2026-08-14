class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial parcels, new arrivals, and number of trucks
        int currentParcels = 250, newParcels = 80, totalTrucks = 7;

        // Add new parcels to current stock
int ks = currentParcels + newParcels;
int cs = ks;
cs %= totalTrucks;
System.out.println(cs);
        // Find undelivered parcels using %= after distributing equally among trucks


        //  Print the number of undelivered parcels


    }
}
