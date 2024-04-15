class Franc extends Money{
    Franc(int amount, String currency) {
        super(amount, currency);
    }
    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
        //return this.amount * multiplier;
    }

    String currency() {
        return "CHF";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Franc other = (Franc) obj;
        return amount == other.amount;
    }
}