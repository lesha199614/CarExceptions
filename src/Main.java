public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", 200, 20000, false);
        try {
            myCar.StartEngine();
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Покатаешься в следующий раз");
        }
    }
}
