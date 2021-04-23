public class main {
    public static void main(String[] args) {
        int income = 1750; // ввести сумму пополнения;
        long semiresult = income / 100;
        long result = semiresult + income;
        long limit = 1000;
        if (income < limit) result = income;
        System.out.println(result);
    }
}
