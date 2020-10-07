
public class Monitor
{
    int Dimension_1;
    int Dimension_2;
    int Resolution_1;
    int Resolution_2;
    String color;
    Monitor(String color,int Dimension_1,int Dimension_2,int Resolution_1,int Resolution_2) {
        this.color = color;
        this.Dimension_1 = Dimension_1;
        this.Dimension_2 = Dimension_2;
        this.Resolution_1 = Resolution_1;
        this.Resolution_2 = Resolution_2;
    }
    public void MonitorOutput(){
        System.out.println("Color "+this.color);
        System.out.printf("Dimension "+this.Dimension_1);
        System.out.printf("*"+this.Dimension_2);
        System.out.printf("\nResolution "+this.Resolution_1);
        System.out.printf( "*"+this.Resolution_2);
    }
}

