class Student{
    String name;
    double attendance;
    static String college = "SRMIST";
    static int count = 0;
    Student(String name, double attendance){
        this.name = name;
        this.attendance = attendance;
        count++;
    } 
    static void print(){
        System.out.println("College Name: " + college);
        System.out.println("Student count: " + count);
    }
    public static void main(String[] args){
        Student s1 = new Student("Anwesha", 90.5);
        Student s2 = new Student("Ravi", 83.7);
        Student.print();
    }
}