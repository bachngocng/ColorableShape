package colorable;

import com.codegym.Circle;
import com.codegym.Rectangle;
import com.codegym.Shape;
import com.codegym.Square;


public class ColorableTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square cSquare = new ColorableSquare();

        Shape[] shapes = new Shape[]{circle, rectangle, cSquare};

        for (Shape shape : shapes) {
            System.out.println(shape);

            // những shape nào implement Colorable thì mới được gọi howToColor()
            // nếu không có if ==> lỗi vì một số shape không implement Colorable, không có PT howToColor()
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

//            ((Colorable) shape).howToColor(); // ==> Lỗi Runtime ClassCastException
//             shape.howToColor();                // Lỗi Compiletime: trong Shape không có PT này
        }

    }
}