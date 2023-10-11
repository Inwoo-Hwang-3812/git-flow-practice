package services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FilterNameServiceTest {
    private FilterNameService filterNameService;

    @BeforeEach
    void setUp() {
        filterNameService = new FilterNameService();
    }

    @Nested
    class filterName {
        @Test
        void validCaseWithUpperCase() {
            assertDoesNotThrow(() -> filterNameService.filterName("CHIKORITA"));
        }

        @Test
        void validCaseWithLowerCase() {
            assertDoesNotThrow(() -> filterNameService.filterName("quoka"));
        }

        @Test
        void validCaseWithUpperAndLowerCaseAndWhiteSpace() {
            assertDoesNotThrow(() -> filterNameService.filterName("Hwang Inwoo"));
        }

        @Test
        void invalidCaseWithNumber() {
            assertThrows(IllegalArgumentException.class, () -> {
                filterNameService.filterName("Jae12min");
            });
        }

        @Test
        void invalidCaseWithSpecialCharacter() {
            assertThrows(IllegalArgumentException.class, () -> {
                filterNameService.filterName("z|ZonSuper*");
            });
        }
    }
}
