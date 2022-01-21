package uppgift2;

public class Factory {
    public static Car getCar(String carType) {

        switch (carType) {
            case "Tesla":
                return new Tesla();

            case "Audi":
                return new Audi();

            case "Toyota":
                return new Toyota();

            case "Saab":
                return new Saab();

            default:
                throw new RuntimeException("No vehicle found");
        }


    }
}
