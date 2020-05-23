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

        Person person= new Person();
        person.setFirstName("");
        person.setFirstName("");
        person.setAge(10);
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen="+person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName="+person.getFullName());




    }
}


