public class Student {
    int id;
    String name;

    void  InsetInfo(int id,String name){}
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.id = 10;
        s1.name = "mugisha";

        s2.id= 1002;
        s2.name = "jimmy Karegeya prince";

        s3.id= 1023;
        s3.name = "Akimanizanye speciose";
        System.out.println("List of all students we registed \n");
        System.out.println(s1.id + "  "+ s1.name);
        System.out.println(s2.id + "  "+ s2.name);
        System.out.println(s3.id + "  "+ s3.name);
    }
}