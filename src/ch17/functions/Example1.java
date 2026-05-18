package ch17.functions;

public class Example1 {
    static void main() {
        Vehicle car = (speed) -> {
            return 0;
        };

        double accelerated = car.accelerate(9);
        System.out.println(accelerated);
    }

    private static double accelerateFor(double distance){
        try{
            int delay = 5;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
