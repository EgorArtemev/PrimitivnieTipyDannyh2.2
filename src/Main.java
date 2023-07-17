public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int recharge1 = 300;
        int recharge2 = 1100;
        int summary1 = recharge1 + balance;
        int summary2 = recharge2 + balance;
        int bonus1 = recharge1 / 100;
        int bonus2 = recharge2 / 100;


        if (recharge1 >= 1000) {
            System.out.println(bonus1 + summary1);
        } else {
            if (recharge2 >= 1000)
                System.out.println(bonus2 + summary2);
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