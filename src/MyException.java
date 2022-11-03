public class MyException extends Exception {
    public MyException(String message) {
        System.out.println("Выпало четное число");
        System.out.println(message);
    }
}
