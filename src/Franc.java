class Franc extends Money{
    Franc(int amount) {
        this.amount= amount;
    }
    int times(int multiplier) {
        //return new Franc(amount * multiplier);
        return this.amount * multiplier;
    }
}