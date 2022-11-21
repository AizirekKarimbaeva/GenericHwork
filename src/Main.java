import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Box>box = new ArrayList<>();
       box.add(new Box<>(10," Made in China"));
       box.add(new Box<>(5," Made in USA"));
       box.add(new Box<>(5," Made in UAE"));
        System.out.println(box);
       Box.method(100);
    }
}