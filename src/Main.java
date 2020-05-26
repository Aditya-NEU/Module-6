import java.nio.channels.Pipe;

public class Main {

    public static void main(String[] args) {

        /**
         * Exercise 29
         * Sum Calculator with getters and setters.
         */
//
//        SimpleCalculator calculator=new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= "+calculator.getAdditionResult());
//        System.out.println("subtract= "+calculator.getSubtractionResult());
//        calculator.setSecondNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= "+calculator.geMultiplicationResult());
//        System.out.println("divide="+calculator.getDivisionResult());


        /** Exercise 30
         * Person  class
         */

//        Person person= new Person();
//        person.setFirstName("");
//        person.setFirstName("");
//        person.setAge(10);
//        System.out.println("fullName= "+person.getFullName());
//        System.out.println("teen= "+person.isTeen());
//        person.setFirstName("John");
//        person.setAge(18);
//        System.out.println("fullName= "+person.getFullName());
//        System.out.println("teen="+person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("fullName="+person.getFullName());

        /** Exercise 31
         * Wall area calculator with constructor initialization.
         */

//        Wall wall= new Wall(5,4);
//        System.out.println("area =" +wall.getArea());
//
//        wall.setHeight(-1.5);
//        System.out.println("width="+wall.getWidth());
//        System.out.println("height="+wall.getHeight());
//        System.out.println("area="+wall.getArea());

        /**
         * Exercise 32
         * Distance calculator between two points.
         */

//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println("distance(0,0)="+first.distance());
//        System.out.println("distance(second)="+first.distance(2,2));
//        System.out.println("distance(2,2)" +first.distance(2,2));
//
//        Point point= new Point();
//        System.out.println("distance()="+point.distance());


        /**
         * Exercise 33
         * Carpet cost calculator using three classes.
         */
//        Carpet carpet= new Carpet(3.5);
//        Floor floor= new Floor(2.75,4.0);
//        Calculator calculator= new Calculator(floor,carpet);
//        System.out.println("total= "+calculator.getTotalCost());
//        carpet= new Carpet(1.5);
//        floor= new Floor(5.4,4.5);
//        calculator= new Calculator(floor,carpet);
//        System.out.println("total ="+calculator.getTotalCost());


        /**
         *
         * Exercise 34 is incomplete...
         * Complete this
         */

//        ComplexNumbers one= new ComplexNumbers(1.0,1.0);
//        ComplexNumbers number= new ComplexNumbers(2.5,-1.5);
//        one.add(1,1);


        /**
         * Exercise 35
         * Inheritance example
         */

//        Circle circle= new Circle(3.75);
//        System.out.println("circle.radius= "+circle.getRadius());
//        System.out.println("circle.area= "+circle.getArea());
//        Cylinder cylinder= new Cylinder(5.55,7.25);
//        System.out.println("cylinder.radius= "+cylinder.getRadius());
//        System.out.println("cylinder.height= "+cylinder.getHeight());
//        System.out.println("cylinder.aread= "+cylinder.getArea());
//        System.out.println("cylinder.volume= "+cylinder.getVolume());


        /**
         * Exercise 36 pool area and example of inheritance.
         */

        Rectangle rectangle= new Rectangle(5,10);
        System.out.println("rectangle.width= "+rectangle.getWidth());
        System.out.println("rectangle.length= "+rectangle.getLength());
        System.out.println("rectangle.area= "+rectangle.getArea());
        Cuboid cuboid= new Cuboid(5,10,5);
        System.out.println("cuboid.width= "+cuboid.getWidth());
        System.out.println("cuboid.length= "+cuboid.getLength());
        System.out.println("cuboid.area= "+cuboid.getArea());
        System.out.println("cuboid.height= "+cuboid.getHeight());
        System.out.println("cuboid.volume= "+cuboid.getVolume());

    }
}


