package methodpass.window;

import mehodpass.windows.Window;
import mehodpass.windows.WindowOperation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WindowOperationTest {
    @Test
    void testResize(){
        List<Window> windows = Arrays.asList(
                new Window("bedroom",80,150),
                new Window("bedroom",80,150),
                new Window("bedroom",80,150),
                new Window("bedroom",80,150)
        );
        new WindowOperation().riseSize(windows,50);
        assertEquals(200,windows.get(0).getHeight());
    }
}
