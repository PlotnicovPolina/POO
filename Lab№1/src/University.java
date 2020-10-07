import java.util.ArrayList;

public class University {
    String name;
    int year;
    ArrayList<Student>studentList=new ArrayList<Student>();
    University(String name, int year){
        this.name=name;
        this.year=year;
    }

    public void addS(Student student)
    {
        studentList.add(student);
    }

     public int MarkCalculation (){

        int sum=0,cont=0;
        for (Student student:studentList)
         {
        sum+=student.get_mark();
        cont++;
         }
        if (cont>0){
            return sum/cont;
        }
        else
        {
            return sum;
        }
     }

     public void presentS(){
        System.out.println("Students:");
         for (Student student:studentList)
         {
             System.out.println(student.get_name());
         }
     }

    public void getDataOfU() {
        System.out.println(name+" was founded in "+year+".");
        System.out.println("The media: "+MarkCalculation());
    }

}
