package gener;

public class App {
    public static void main(String[] args) {

        Test1<Integer,Integer> test1 = new Test1<>(1,"2");
        Test1<String,Integer> test2 = new Test1<>("a",2);
        Test1 test3 = new Test1(1,2);

    }
}
