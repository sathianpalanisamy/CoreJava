package com.learning.corejava.in28minutes.l_exception_handling;

class CurrencyDoNotMatchException extends Exception{
    public CurrencyDoNotMatchException(String message) {
        super(message);
    }
}

class Amount{
    String currency;
    int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    //unchecked Exception
//    public void add(Amount that){
//        if (!this.currency.equals(that.currency)){
//            throw new RuntimeException("currency is mot matched");
//        }
//        this.amount= this.amount+that.amount;
//    }

    // Checked Exception
    public void add(Amount that) throws Exception {
        if (!this.currency.equals(that.currency)){
//            throw new Exception("currency is mot matched with "+this.currency+" & ");
            throw new CurrencyDoNotMatchException("currency is mot matched with "+this.currency+" & ");
        }
        this.amount= this.amount+that.amount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Amount{");
        sb.append("currency='").append(currency).append('\'');
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) throws Exception {

        Amount amount1 = new Amount("USD",10);
        Amount amount2 = new Amount("INR",10);

        amount1.add(amount2);

        System.out.println(amount1);



    }
}
