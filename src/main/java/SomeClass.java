import java.lang.IllegalArgumentException;

public class SomeClass {

    public static void main(String[] args) {
        if (true) {
		throw new IllegalArgumentException("Hi Leha");
	}
        System.out.println("Hello!");
    }
}
