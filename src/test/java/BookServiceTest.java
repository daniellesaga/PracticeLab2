import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void retrievedata() {
    }

    BookInterfaceImplement bb = new BookInterfaceImplement();
    BookService bk = new BookService(bb);

    List<String> fl = bk.retrievedata();

    assertEquals(2,fl.size());
}