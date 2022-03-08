import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatternMatchingTest {

    private final Object obj = "TEST";

    @Test
    public void previousWay() {
        if (obj instanceof String) {
            String castedString = (String) obj;

            Assertions.assertThat(castedString.substring(2)).isEqualTo("ST");
        }
    }

    @Test
    public void newWay() {
        if (obj instanceof String castedString) {

            Assertions.assertThat(castedString.substring(2)).isEqualTo("ST");
        }
    }
}
