package uppgift2;

public class Main {

    public static void main(String[] args) {

        //Producing Tesla First Day
        String carType = "Tesla";
        Factory.getCar(carType).run();

        //Producing Audi Second Day
        carType = "Audi";
        Factory.getCar(carType).run();

        //Producing Toyota Third Day
        carType = "Toyota";
        Factory.getCar(carType).run();

        //Producing Saab Fourth Day
        carType = "Saab";
        Factory.getCar(carType).run();


    }
}
