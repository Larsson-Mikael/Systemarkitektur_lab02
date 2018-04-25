package Factory;

import Abstract.AbstractFactory;
import Product.ProductA2;
import Product.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public ProductA2 createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB2 createProductB() {
        return new ProductB2();
    }
}
