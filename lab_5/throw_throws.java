// write a program for throw and throws

class AgeCheck {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age is less than 18");
        }

        System.out.println("Eligible");
    }
}

class ThrowThrows {
    public static void main(String[] args) {

        try {
            AgeCheck.checkAge(15    );
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}