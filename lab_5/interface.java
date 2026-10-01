// write a program for Interface in Java

interface Printable {

    void print();
}

class Student implements Printable {

    public void print() {
        System.out.println("Student Name = Sreehari");
        System.out.println("Roll Number = 101");
    }
}

class Teacher implements Printable {

    public void print() {
        System.out.println("Teacher Name = Rahul");
        System.out.println("Subject = Java");
    }
}

class InterfaceExample {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.print();

        System.out.println();

        t.print();
    }
}