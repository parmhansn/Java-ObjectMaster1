class Ninja extends Human {
    public Ninja(){
        this.stealth = 10;
    }

    public void steal(Human human){
        Human stealth = human;
        stealth.setHealth(this.stealth * -1);
        this.setHealth(this.stealth);
    }

    public void runAway(Human human) {
        this.setHealth(-10);
        System.out.println("This person health was decresed");
    }
}