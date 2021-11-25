package padroescriacao.singleton;

public class Student {
    private Student(){}
    private static Student instace = new Student();
    public static Student getInstance(){
        return instace;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameRegistration() {
        return nameRegistration;
    }

    public void setNameRegistration(String nameRegistration) {
        this.nameRegistration = nameRegistration;
    }

    private String nameStudent;
    private String nameRegistration;

}
