package encaptulation;

public class EnhancedPlayer {

    private String name;
    private int hitpoints = 100; // default health set to 100
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // Only values between 1 & 100 are acceptable for health
        if(health > 0 && health <= 100) {
            this.hitpoints = health;
        }
        this.weapon = weapon;
    }
    // Lose health method
    public void loseHealth(int damage) {
        this.hitpoints = this.hitpoints - damage;
        if (this.hitpoints <= 0) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
        }
    }
    // Getter for health
    public int getHealth() {
        return hitpoints;
    }
}