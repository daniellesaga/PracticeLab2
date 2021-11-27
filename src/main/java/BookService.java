import java.util.ArrayList;
import java.util.List;

public class BookService {

    private BookService bk;

    public BookService(BookInterface bk) {
        this.bk = bk;
    }

    public List<String> retrievedata(){

        List<String> filtered = new ArrayList<>();
        List<String> books = bk.retrieveTodos(); //The part where you need the actual method

        for(String bks:books){
            if(bks.contains("Java")){
                filtered.add(bks);
            }
        }

        return filtered;
    }
}
