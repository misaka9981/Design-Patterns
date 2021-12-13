package src.decorator.starbuzzWithSizes;

/**
 * Beverage
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public enum Size {TALL, GRANDER, VENTI};
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public abstract double  cost();

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

}