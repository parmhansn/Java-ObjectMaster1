class Samurai extends Human{
    private static int numberOfSamurai = 0;
    public Samurai(){
        this.health = 200;
        this.numberOfSamurai++;
    }

    public void deathBlow(Human attackedHuman){
        int death = attackedHuman.getHealth();
        attackedHuman.setHealth(-death);
        int selfDamage = (this.health / 2);
        this.setHealth(-selfDamage);
        System.out.println("Killed a human, but lost " + selfDamage);
    }

    public void meditate() {
        int heal = this.health /2;
        this.setHealth(heal);
        System.out.println("Recovered");
    }

    public void howMany(){
        System.out.println("There are " +this.numberOfSamurai + "Samurai's.");
    }
}