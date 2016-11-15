
import java.util.Arrays;
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower(true, 12, FlowerColor.PURPLE, 12.5, FlowerType.MAK);
        Flower romashka = new Flower(true, 12, FlowerColor.BLUE, 12.5, FlowerType.ROMASHKA);

        Flower_Special findFlower = new Flower_Special(FlowerColor.PURPLE, 12, FlowerType.ROMASHKA);


        bucket.addFlower(mak);
        bucket.addFlower(romashka);


        System.out.println(bucket.getFlower(findFlower));
        System.out.println(bucket.searchFlower(mak));

    }
}
