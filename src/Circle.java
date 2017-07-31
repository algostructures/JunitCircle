/**
 * Created by prajapas on 7/6/2017.
 */
public class Circle {

    private double redius;
    Circle(){};
    Circle(double redius) {
        this.redius = redius;
    }

    public double getSArea(){
        return Math.PI * this.redius * this.redius;
    }

    public double getCF() {
        return Math.PI * this.redius * 2;
    }
}
