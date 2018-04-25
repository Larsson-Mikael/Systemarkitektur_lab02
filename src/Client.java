import Abstract.AbstractFactory;
import Abstract.AbstractProductA;
import Abstract.AbstractProductB;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = AbstractFactory.getFactory(1);
        AbstractFactory factory2 = AbstractFactory.getFactory(2);

        AbstractProductA A1 = factory1.createProductA();
        AbstractProductB B1 = factory1.createProductB();

        AbstractProductA A2 = factory2.createProductA();
        AbstractProductB B2 = factory2.createProductB();
    }
}
