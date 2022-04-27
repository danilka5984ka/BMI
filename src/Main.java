public class Main {

    public static void main(String[] args) {
        BodyMassIndex index = new BodyMassIndex();
        double i = 75.; // вес в кг
        double h = 1.8; // рост в см
        double BMI = index.calculate(i, h);
        System.out.println("Индекс массы тела: " + BMI);
    }
}
