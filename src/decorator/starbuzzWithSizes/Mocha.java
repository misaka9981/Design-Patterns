package src.decorator.starbuzzWithSizes;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return .20 + beverage.cost();
    }
    
}