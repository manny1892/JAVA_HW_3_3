public class CreditPaymentService {
    public double calculate(int amount, double percentYear, int periodYear) {
        int periodMonth = periodYear * 12;
        double percentMonth = (percentYear / 100) / 12;
        double monthlyPayment = amount * (percentMonth + (percentMonth / (Math.pow((1.0 + percentMonth), periodMonth) - 1.0)));
        return monthlyPayment;
    }
}
