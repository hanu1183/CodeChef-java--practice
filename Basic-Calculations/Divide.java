class Codechef {
    public static void main(String[] args) {
        // Write your code here
        int students = 10, packsOfCandies = 5, candiesPerPack = 8, extraCandies = 2;
        int pack = packsOfCandies*candiesPerPack;
        int totalCandies = pack+extraCandies;
        int averageCandies = totalCandies/students;
        System.out.println(totalCandies);
        System.out.println(averageCandies);
    }
}
