class course{
    String code;
    String title;
    int credits;
    int labcredits;
    course(String code, String title, int credits, int labcredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labcredits = labcredits;
    }
    course(String code, String title, int credits){
        this(code,title,credits,0);
    }
    public int totalcredits(){
        return credits+labcredits;
    }
    public static void main(String[] args){
        course theory = new course("21CSC201J", "Data Structures",4);
        course lab = new course ("21csc205L", "DSA Lab", 3, 1);
        System.out.println(theory.code + "Total Credits: " + theory.totalcredits());
        System.out.println(lab.code + "Total Credits: " + lab.totalcredits());
    }

}