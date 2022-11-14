public class Diamond {
    private int diamond_size;
    private double diamond_value;
    public Diamond(){

    }

    public Diamond(int size, double value) {
        diamond_size = size;
        diamond_value = value;
    }

    public void setDiamond_size(int diamond_size) {
        this.diamond_size = diamond_size;
    }

    public void setDiamond_value(double diamond_value) {
        this.diamond_value = diamond_value;
    }

    public int getSize() {
        return diamond_size;
    }

    public double getValue() {
        return diamond_value;
    }

}
