package ch4;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //рассчитать далльность поездки при полном баке
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров на расстояние " +
                range + " миль");
    }
}
