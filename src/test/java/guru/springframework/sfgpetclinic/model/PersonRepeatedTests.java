package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeatedTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class PersonRepeatedTests implements ModelRepeatedTests {
    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}" )
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        //TODO
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }

    // Assignment - JUnit Dependency Injection attempt
    @RepeatedTest(value = 4, name = "{displayName} -> repetition {currentRepetition} of {totalRepetitions}.")
    @DisplayName("My Assignment Attempt")
    void myAssignment() {

    }
}
