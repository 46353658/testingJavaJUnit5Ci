package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("repeated")
public interface ModelRepeatedTests {
    @BeforeEach // RepetitionInfo only exists for RepeatedTests
    default void testInformation(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Before each, display name: " + testInfo.getDisplayName() + " iteration: " + repetitionInfo.getCurrentRepetition());
    }
}
