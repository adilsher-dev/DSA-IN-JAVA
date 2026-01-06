class class_object {
    int rollNo;
    String name;
    double marks;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        class_object s1 = new class_object(); // object creation

        s1.rollNo = 101;
        s1.name = "Amir";
        s1.marks = 88.5;

        s1.display();
    }
}
