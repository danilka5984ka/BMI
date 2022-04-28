public class Main {

    public static void main(String[] args) {
        BodyMassIndex index = new BodyMassIndex();
        double mass = 75.; // вес в кг
        double height = 1.8; // рост в см
        double bmi = index.calculate(mass, height);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
