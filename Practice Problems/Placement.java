public class  Placement{
    String studentName;
    String companyName;
    double packageLPA;
    Placement(String studentName, String companyName, double packageLPA) {
        this.studentName = studentName;
        this.companyName = companyName;
        this.packageLPA = packageLPA;
    }
    void displayRecord() {
        System.out.println(studentName + " -> " + companyName + " @ " + packageLPA + " LPA ");
    }
    public static void main(String[] args) {
        Placement record1 = new Placement("Alice", "TechCorp", 12.5);
        Placement record2 = new Placement("Bob", "InnovateX", 10.0);
        Placement record3 = new Placement("Charlie", "NextGen Solutions", 15.0);
        Placement[] records = {record1, record2, record3};
        for (Placement record : records) {
            record.displayRecord();
        }
    }
}
