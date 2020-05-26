public class ComplexNumbers {

    private double real;
    private double imaginary;


    public ComplexNumbers(double real,double imaginary){
        this.imaginary=imaginary;
        this.real=real;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

public void add(double real,double imaginary){
    System.out.println("I am here");
    System.out.println(this.real+real);
    System.out.println(this.imaginary+imaginary);


}

public void sub(double real,double imaginary){
        System.out.println(this.real-real);
        System.out.println(this.imaginary-imaginary);

    }


}
