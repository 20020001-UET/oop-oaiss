import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<Shape>();
    }

    /**
     * addShape method.
     * 
     * @param newShape Shape
     */
    public void addShape(Shape newShape) {
        shapes.add(newShape);
    }

    /**
     * getInfo method.
     * 
     * @return String info
     */
    public String getInfo() {
        String info = "Layer of crazy shapes:\n";
        for (Shape shape : shapes) {
            info += shape.toString() + "\n";
        }
        return info;
    }

    /**
     * check if shapes contains circle.
     * 
     * @return boolean
     */
    private int containCircle() {
        int index = 0;
        for (Shape shape : shapes) {
            if (shape.getClass() == Circle.class) {
                return index;
            }
            index++;
        }
        return -1;
    }

    /**
     * remove circles.
     */
    public void removeCircles() {
        int index = 0;
        do {
            index = containCircle();
            if (index != -1) {
                shapes.remove(index);
            } else {
                break;
            }
        } while (index != -1);
    }

    /**
     * remove duplicate shapes.
     */
    public void removeDuplicates() {
        for (int index = 0; index < shapes.size() - 1; index++) {
            List<Integer> duplicateIndex = new ArrayList<Integer>();
            for (int objIndex = index + 1; objIndex < shapes.size(); objIndex++) {
                if (shapes.get(index).equals(shapes.get(objIndex))) {
                    duplicateIndex.add(objIndex);
                }
            }

            if (duplicateIndex.isEmpty()) {
                continue;
            }

            for (int objIndex : duplicateIndex) {
                shapes.remove(objIndex);
            }
        }
    }
}
