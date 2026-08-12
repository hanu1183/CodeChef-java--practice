class Codechef {
    public static void main(String[] args) {
        // Declare and assign student roll number as int
        int rollNumber = 12_345;  // Roll number within short range

        // Explicitly convert int to short
        short convertedRollNumber = (short)rollNumber;

        // Declare and assign student pass status
        boolean hasPassed = true;  
        System.out.println("Student Roll Number (Int): "+rollNumber);
        System.out.println("Converted Roll Number (short): "+convertedRollNumber);
        System.out.println("Has Passed: "+hasPassed);
        
    }
}
