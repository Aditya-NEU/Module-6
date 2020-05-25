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
         * Distance calculator between two points.s
         */

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)="+first.distance());
        System.out.println("distance(second)="+first.distance(2,2));
        System.out.println("distance(2,2)" +first.distance(2,2));

        Point point= new Point();
        System.out.println("distance()="+point.distance());

    }
}


