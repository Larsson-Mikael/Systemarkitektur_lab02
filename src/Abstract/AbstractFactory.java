package Abstract;

import Factory.ConcreteFactory1;
import Factory.ConcreteFactory2;

public abstract class AbstractFactory {

    public static AbstractFactory getFactory(int factoryNumber) throws IllegalArgumentException {
        switch (factoryNumber) {
            case 1: return new ConcreteFactory1();
            case 2: return new ConcreteFactory2();
            default: throw new IllegalArgumentException();
        }
    }

    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
