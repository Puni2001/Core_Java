package BasicsSyntax;

public class Variables {
    public static void main(String[] args) {
        byte age = 25;
        short yearOfBirth = 1998;
        int zipCode = 123456;
        long phoneNumber = 9876543210L;
        float height = 5.9f;
        double weight = 70.5;
        char gender = 'M';
        boolean isEmployed = true;

        System.out.println("== My Bio ==");
        System.out.println("Age: " + age);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Height (ft): " + height);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("Employed: " + isEmployed);
    }
}
