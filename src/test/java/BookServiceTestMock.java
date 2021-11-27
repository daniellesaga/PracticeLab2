import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookServiceTestMock {
    @Test
    public void retrievebooks() {
        List<String> ff = bb.retrievedata();

        assertEquals(2,ff.size());
    }
    @Test
    public void retrievebooksempty() {
        List<String> bks = Arrays.asList();
        Mockito.when(bs.retrieveTodos()).thenReturn(bks);

        List<String> ff = bb.retrievedata();

        assertEquals(0,ff.size());
    }
}
