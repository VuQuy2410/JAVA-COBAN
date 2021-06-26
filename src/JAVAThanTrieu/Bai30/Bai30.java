package JAVAThanTrieu.Bai30;

public class Bai30 {
    enum Size{
        EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE;

    }

    public static void main(String[] args) {
//        Season winter= Season.WINTER;
//        System.out.println(winter.getValue());
//        System.out.println(winter);
        Size mySize= Size.EXTRA_LARGE;
        Size brotherSize= Size.EXTRA_LARGE;

        if( mySize== brotherSize){
            System.out.println("Hai anh em có thể mặc chung quần áo!");

        }
        else {
            System.out.println("Hai anh em ko thể mặc chung quần áo!");
        }
    }
}
