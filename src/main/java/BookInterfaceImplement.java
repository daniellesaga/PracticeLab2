import java.util.List;

public class BookInterfaceImplement implements BookInterface {
    @Override
    public List<String> retrieveTodos() {
        return Arrays.aslist("PHP", "Java for Dummies","Java for Experts","HTML");
    }
}
