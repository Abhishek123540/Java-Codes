abstract class Base{
    int a;
    public Base(){
        System.out.println("Base 2 constructor");
    }
    public void hello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child extends Base{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    public void say(){
        System.out.println("HI");
    }
}
abstract class child2 extends Base{
    public void th(){
        System.out.println();
    }
    public abstract void say();
}

class friend extends child2{
    @Override
    public void greet() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void say() {
        // TODO Auto-generated method stub
        
    }
}

public class Topic_Abstract_Class {
    public static void main(String[] args) {
        Base b1 = new child();
        child c1 = new child();
        // b1.say();//wrong
        c1.say();
        b1.hello();
        c1.hello();
        b1.greet();
        c1.greet();

        Base b2 = new Base() {
            @Override
            public void greet() {
                // TODO Auto-generated method stub
                
            }
        };
        Base b3 = new friend();
    }
}
