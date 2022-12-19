package jeff.balbalosa;

public class Table {
    int height;
    int width;
    int length;
    int drawers;

    public Table(int height, int width, int length, int drawers) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.drawers = drawers;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getDrawers() {
        return drawers;
    }
}
