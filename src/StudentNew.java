public class StudentNew {
    int id;
    String name;
    void insertInfo(int rollId, String n){
        id = rollId;
        name = n;
    }
    void displayStudent(){
        System.out.println("student info:  ");
        System.out.println(id + "  "+name);
    }
}
