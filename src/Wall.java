public class Wall {
    // instance variables tanımlamam gerekiyor:
    double width;
    double height;

    // constructor metodlar:
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setWidth(double value) {
        if (value <= 0) {
            width = 0;
        } else {
            width = value;
        }
        return width;
    }

    public double setHeight(double value) {
        if (value <= 0) {
            height = 0;
        } else {
            height = value;
        }
        return height;
    }

    public double getArea() {
        return width * height;
    }

}
