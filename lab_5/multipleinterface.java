// write a program for Multiple Interface Example

interface Sports {

    void sportsInfo();
}

interface Academics {

    void academicInfo();
}

class Student implements Sports, Academics {

    public void sportsInfo() {
        System.out.println("Sport = Football");
    }

    public void academicInfo() {
        System.out.println("Course = Computer Science");
        System.out.println("Mark = 85");
    }
}

class MultipleInterface {
    public static void main(String[] args) {

        Student s = new Student();

        s.academicInfo();
        s.sportsInfo();
    }
}