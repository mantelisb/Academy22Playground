import org.junit.jupiter.api.Test;

public class StringFormatTest {

    private final String name = "Mantas";
    private final int age = 26;

    @Test
    public void previousWay() {
        System.out.println("previous way");
        System.out.println(String.format("My name is %s and I am %d years old", name, age));
    }

    @Test
    public void stringFormatted() {
        System.out.println("new way");
        System.out.println("My name is %s and I am %d years old".formatted(name, age));
    }
}
