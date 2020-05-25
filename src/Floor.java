public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length){
        this.length = length;
        if(length <0)
            length =0;
        this.width=width;
        if (width<0)
            width=0;
    }

    public double getArea(){
        return width* length;
    }


}
