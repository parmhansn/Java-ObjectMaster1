public class Human {
	public int strength = 3;
    public int intelligence = 3;
    public int stealth = 3;
    public int health = 100;

    public void attack(Human currentHuman) {
    	Human attackedHuman = currentHuman;
    	int strength = this.strength;
    	currentHuman.setHealth(-strength);
    	System.out.println("Current human strength: " + currentHuman);
    }
    
    
    public int getStrength() {
    	return this.strength;
    }
    
    
    public void getStrength(int strength) {
    	this.strength += strength;
    }
    
    public int getIntelligence() {
    	return this.intelligence;
    }
    
    public void setIntelligence(int intelligence) {
    	this.intelligence += intelligence;
    }
    
    public int getStealth() {
    	return this.stealth;
    } 
    
    public void setStealth(int stealth) {
    	this.stealth += stealth;
    }
    
    public int getHealth() {
    	return this.health;
    }
    
    public void setHealth(int health) {
    	this.health += health;
    }
}