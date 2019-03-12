package _oop;

/**
 * Rectangle?
 *
 * @author Luo_0412
 */
public class SpecialRectangle {
    private double width;
    private double length;

    /**
     * setWidth()
     *
     * @param w
     */
    public void setWidth(double w) {
        if (w >= 10 && w <= 30) {
            this.width = w;
        } else {
            System.out.println("width must be in the 10 - 30");
            System.exit(0); // ??
        }
    }

    /**
     * setter
     *
     * @param
     */
    public void setLength(double len) {
        this.length = len;
    }

    /**
     * getter
     *
     * @return
     */
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * width;
    }

}
