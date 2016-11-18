
import java.util.Arrays;
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower(false, 10, FlowerColor.PURPLE, 11.5, FlowerType.MAK);
        Flower romashka = new Flower(true, 12, FlowerColor.BLUE, 12.5, FlowerType.ROMASHKA);
        Flower roza = new Flower(false, 14, FlowerColor.WHITE, 10.5, FlowerType.ROZA);
        Flower tulpan = new Flower(true, 12, FlowerColor.RED, 22.5, FlowerType.TULPAN);


        Flower_Special findFlower = new Flower_Special(FlowerColor.PURPLE, 12, FlowerType.ROMASHKA);


        bucket.addFlower(mak);
        bucket.addFlower(romashka);
        bucket.addFlower(roza);
        bucket.addFlower(tulpan);


        //System.out.println(bucket.getFlower(findFlower));
        //System.out.println(bucket.searchFlower(mak));

        //System.out.println(Arrays.toString(bucket.searchFlower(tulpan)));
        PaperDecorator paper = new PaperDecorator(bucket);
        RibbonDecorator ribbon = new RibbonDecorator(bucket);
        BasketDecorator basket = new BasketDecorator(bucket);

        Order order = new Order();
        order.addItem(paper);
        order.addItem(ribbon);
        order.addItem(basket);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());

        order.processOrder();

    }
}
