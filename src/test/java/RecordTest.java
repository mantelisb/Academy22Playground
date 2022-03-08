import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordTest {

    private final String name = "Mantas";
    private final int age = 26;

    @Test
    public void immutableClass() {
        ImmutablePerson immutablePerson = new ImmutablePerson(name, age);

        assertThat(immutablePerson)
                .returns(name, ImmutablePerson::getName)
                .returns(age, ImmutablePerson::getAge);
    }


    @Test
    public void immutableLombok() {
        ImmutableLombokPerson lombokPerson = new ImmutableLombokPerson(name, age);

        assertThat(lombokPerson)
                .returns(name, ImmutableLombokPerson::getName)
                .returns(age, ImmutableLombokPerson::getAge);
    }


    @Test
    public void record() {
        ImmutableRecordPerson recordPerson = new ImmutableRecordPerson(name, age);

        assertThat(recordPerson)
                .returns(name, ImmutableRecordPerson::name)
                .returns(age, ImmutableRecordPerson::age);
    }


}
