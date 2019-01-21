class Wizard extends Human{
    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }
    
    public void heal(Human human){ //this is a method.
        Human healedHuman = human;
        healedHuman.setHealth(this.intelligence);
        System.out.print("This human has healed for " + this.intelligence);
    } 

    public void fireball(Human human){
        Human decreasedHealth = human;
        decreasedHealth.setHealth(this.intelligence * -3);
        System.out.println("This human's health was decreased by: " + this.health);
    }
        
}