
package staticinitializersinjava;

public class StaticInitializersINJava {

    static{
        System.out.println("This is first Static-Block");       // Important -Points
    }
    StaticInitializersINJava(){                                 //1:Static blocks are positioned in memory and executed when JVM loads a class.
        System.out.println("This is first-constructor");        
    }
    
    public static String variable1="My String Static- variable.";
    
    static{
        System.out.println("This is Second Static-Block");
    }
    
    public static void main(String[] args) {        //2: Main method is executed when Static initilizer Block executes.
        
        StaticInitializersINJava.method2();

    }
    static{                                         //3: Method 2 runs first beccause its called in static initializer Block.
        method2();
        System.out.println("This is Third Static-Block");
    }
    public static void method1(){
        System.out.println("This is Static method 1");
    }
    public static void method2(){
        System.out.println("This is Static method two");
    }
    
}
