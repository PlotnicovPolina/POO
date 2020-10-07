public class Student {
    String name;
    int age;
    int mark;

     Student(String name,int age,int mark){
        this.name=name;
        this.age=age;
        this.mark=mark;
    }

    public String get_name() {
        return name;
    }

    public int get_mark() {
        return mark;
    }
}
