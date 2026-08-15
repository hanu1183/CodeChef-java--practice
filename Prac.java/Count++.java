class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial reward points, bonus points, and expired points
        int rewardPoints = 120, bonusPoints = 30, expiredPoints = 10;

        // Adjust reward points by adding bonus and subtracting expired points
int k=rewardPoints + bonusPoints;
int r= k-expiredPoints;
System.out.println("Reward Points before post-increment "+r);
r++;
System.out.println("Reward Points after post-increment "+r);



        
    }
}
