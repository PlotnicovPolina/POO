
public class Main
{
    public static void main(String[] args)
    {
        Monitor Monitor_1= new Monitor("RED",5,3,400,240);
        Monitor Monitor_2= new Monitor("BLACK",4,3,1024,768);
        System.out.println("Monitor_1");
        Monitor_1.MonitorOutput();
        System.out.println("\nMonitor_2");
        Monitor_2.MonitorOutput();
        if ((Monitor_1.Resolution_1+Monitor_1.Resolution_2)>(Monitor_2.Resolution_1+Monitor_2.Resolution_2))
            {System.out.println("First Monitor is better.");}
        else
            {System.out.println("\nSecond monitor is better.");}

        University utm=new University("UTM",1958);
        University usm=new University("USM",1812);
        University asem=new University("ASEM",1927);
        Student Polina=new Student("Polina",19,10);
        Student Nichita=new Student("Nichita",20,8);
        Student Lina=new Student("Lina",19,9);
        Student Elina=new Student("Elina",20,10);
        Student Vera=new Student("Vera",21,7);
        Student Anastasia=new Student("Anastasia",22,5);
        Student Alexandra=new Student("Alexandra",20,9);
        Student Ray=new Student("Ray",24,9);
        Student Oleg=new Student("Oleg",18,8);

        utm.addS(Polina);
        utm.addS(Nichita);
        utm.addS(Lina);
        usm.addS(Elina);
        usm.addS(Vera);
        usm.addS(Anastasia);
        asem.addS(Alexandra);
        asem.addS(Ray);
        asem.addS(Oleg);

        int all= (utm.MarkCalculation()+ usm.MarkCalculation()+ asem.MarkCalculation())/3;

        utm.getDataOfU();
        utm.presentS();
        usm.getDataOfU();
        usm.presentS();
        asem.getDataOfU();
        asem.presentS();

        System.out.println("The general media of marks: "+all);




    }
}
