package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("model")
public interface ModelTests {

    @BeforeEach
    default void testInformation(TestInfo testInfo) {
        System.out.println("Before each, display name: " + testInfo.getDisplayName() + ".");
    }
}
