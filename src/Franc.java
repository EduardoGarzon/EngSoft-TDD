class Franc extends Money{
    Franc(int amount) {
        this.amount= amount;
    }
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
        //return this.amount * multiplier;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Franc other = (Franc) obj;
        return amount == other.amount;
    }
}