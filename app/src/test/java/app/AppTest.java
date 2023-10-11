package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.FilterNameService;
import services.PrintNameService;
import services.ReceiveNameService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AppTest {
    private ReceiveNameService receiveNameService;
    private PrintNameService printNameService;
    private FilterNameService filterNameService;

    private App app;

    @BeforeEach
    void setUp() {
        receiveNameService = mock(ReceiveNameService.class);
        printNameService = mock(PrintNameService.class);
        filterNameService = mock(FilterNameService.class);

        app = new App(receiveNameService, printNameService, filterNameService);
    }

    @Test
    void run() {
        String name = "Chikorita";

        when(receiveNameService.getName()).thenReturn(name);

        assertThat(app.run()).isEqualTo(name);

        verify(receiveNameService).getName();
        verify(filterNameService).filterName(name);
        verify(printNameService).printName(name);
    }
}
