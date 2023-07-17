public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int recharge = 1500;
        int summary = recharge + balance;
        int bonus = recharge / 100;



        if (recharge >= 1000) {
            System.out.println(bonus + summary);
        } else {
            System.out.println(summary);
            
        }


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}