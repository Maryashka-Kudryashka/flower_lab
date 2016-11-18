package Main_pac;

import Decorators.BasketDecorator;
import Decorators.PaperDecorator;
import Decorators.RibbonDecorator;
import Delivery.PostDeliveryStrategy;
import Enum.*;
import Flowers.Cactus;
import Flowers.Romashka;
import Main_pac.Order;
import Payment.CreditCardPaymentStrategy;

public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();

        Flower romashka = new Romashka(true, 12, FlowerColor.BLUE, 12.5, FlowerType.ROMASHKA);
        Flower cactus = new Cactus(true, 12, FlowerColor.WHITE, 12.5, FlowerType.CACTUS);

        bucket.addFlower(cactus);
        bucket.addFlower(romashka);

        PaperDecorator paper = new PaperDecorator(bucket);
        RibbonDecorator ribbon = new RibbonDecorator(bucket);
        BasketDecorator basket = new BasketDecorator(bucket);

        Order order = new Order();
        order.addItem(paper);
        order.addItem(ribbon);
        order.addItem(basket);
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        order.setPaymentStrategy(new CreditCardPaymentStrategy());

        order.processOrder();

    }
}
