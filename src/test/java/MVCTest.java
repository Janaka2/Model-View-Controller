import org.example.Controller;
import org.example.Model;
import org.example.View;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MVCTest {
    private Model model;
    private View view;
    private Controller controller;

    @BeforeEach
    public void setUp() {
        model = new Model();
        view = mock(View.class);
        controller = new Controller(model, view);
    }

    @Test
    public void testUpdateData() {
        String newData = "New data";

        controller.updateData(newData);

        assertEquals(newData, model.getData());
        verify(view).displayData(newData);
    }
}
