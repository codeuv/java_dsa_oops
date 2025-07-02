import com.codeuv.Rectangle;

public class Main2Shapes {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("red",12,10);

        System.out.println(rec.toString());
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    }
}
