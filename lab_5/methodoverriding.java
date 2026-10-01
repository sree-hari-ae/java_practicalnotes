class Human {

    void sound() {
        System.out.println("Human makes a sound");
    }
}

class Men extends Human {

    @Override
    void sound() {
        System.out.println("Men says: Blah");
    }
}

class Girl extends Human {

    @Override
    void sound() {
        System.out.println("Girl says: blah blah blah");
    }
}

class MethodOverriding {
    public static void main(String[] args) {

        Human h1 = new Men();
        Human h2 = new Girl();

        h1.sound();
        h2.sound();
    }
}