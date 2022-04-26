public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payment = service.calculate(1_000_000, 9.99, 1);
        String result = String.format("%.2f", payment);
        System.out.println("Ваш ежемесячный платеж = " + result);

        double payment2 = service.calculate(1_000_000, 9.99, 2);
        String result2 = String.format("%.2f", payment2);
        System.out.println("Ваш ежемесячный платеж = " + result2);

        double payment3 = service.calculate(1_000_000, 9.99, 3);
        String result3 = String.format("%.2f", payment3);
        System.out.println("Ваш ежемесячный платеж = " + result3);

    }
}
