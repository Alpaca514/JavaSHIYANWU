package HuaQ;
public class student {
    String name;
    String number;

    public student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return "name='" + name + "number='" + number + '\n' ;
    }
}