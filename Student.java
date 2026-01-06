class Student {
    int rollNo;
    String name;

    // Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Amir");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();
    }
}

