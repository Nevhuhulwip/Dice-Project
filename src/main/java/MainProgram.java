public class MainProgram {
    public static void main(String[] args) throws Exception {
        System.out.println("Perfectly Normal Dice.");
        Dice dice6 = new Dice(6);
        dice6.roll();
        System.out.println(dice6.value);

        System.out.println("Twenty Sided Dice.");
        Dice dice20 = new Dice(20);
        dice20.roll();
        System.out.println(dice20.value);

       System.out.println("Weighted Dice.");
       Dice weighted = new Dice(6, new int[]{1, 1, 1, 1, 1, 2});
       weighted.roll();
       System.out.println(weighted.value);
    }
}
