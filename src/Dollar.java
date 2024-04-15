class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
        //return this.amount * multiplier;
    }

    String currency() {
        return "USD";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dollar other = (Dollar) obj;
        return amount == other.amount;
    }

}