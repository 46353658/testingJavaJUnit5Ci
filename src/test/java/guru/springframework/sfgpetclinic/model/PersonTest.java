package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    // ! Remember the order of assert -> expected and then actual

    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1l, "Joe", "Buck");

        // then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName()));
    }

    @Test
    void groupedAssertionsMsgs() {
        // given
        Person person = new Person(1l, "Joe", "Buck");

        // then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName(), "First name failed"),
                () -> assertEquals("Buck", person.getLastName(), "Last name failed"));
    }

}