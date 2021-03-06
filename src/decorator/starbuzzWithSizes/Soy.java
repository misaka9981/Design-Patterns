package src.decorator.starbuzzWithSizes;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += .10;
        }else if (beverage.getSize() == Size.GRANDER){
            cost += .15;
        }else if (beverage.getSize() == Size.VENTI){
            cost += .20;
        }
        return cost;
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
}