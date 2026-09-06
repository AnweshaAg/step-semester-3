class IDcard{
    String name;
    int booksissued;
    IDcard(String name, int booksissued){
        this.name = name;
        this.booksissued = booksissued;
    }
    public static void main(String[] args){
        IDcard ravi = new IDcard("Ravi", 0);
        IDcard duplicate = ravi;
        duplicate.booksissued=3;
        IDcard seprate = new IDcard("Ravi",3);
        System.out.println("Ravi's book issued(via first variable): "+ ravi.booksissued);
        System.out.println("Duplicate == Ravi - "+ (duplicate == ravi));
        System.out.println("Seprate == Ravi - " + (seprate == ravi));
    }
}