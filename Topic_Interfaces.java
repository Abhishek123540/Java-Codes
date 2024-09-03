interface Bicycle{
    int a=45;//Can't modify as it is final
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface horn{
    void horn1();
    void horn2();
}
class AvonCycle implements Bicycle,horn{
    void blowHorn(){
        System.out.println("horn sound");
    }
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("Accelerating");
    }
    @Override
    public void horn1() {
        System.out.println("Horn 1");
    }
    @Override
    public void horn2() {
        System.out.println("Horn 2");
    }
}

public class Topic_Interfaces {
    public static void main(String[] args) {
        AvonCycle c1 = new AvonCycle();
        c1.applyBrake(0);
        System.out.println(c1.a);
    }
}
