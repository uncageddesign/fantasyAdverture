public class Melee extends Player {

    // Melee classes: Barbarian, Fighter, Monk
    // Weapon: Greatsword, Warhammer, Rapier, Crossbow, Fists, Bowstaff
    // Armour: Plate, Chainmail, Leather, Shield, Bracers

    private String characterType;
    private String weapon;
    private String armour;

    public Melee(String name, String alignment, String characterType, String weapon, String armour){
        super(name, alignment);
        this.characterType = characterType;
        this.weapon = weapon;
        this.armour = armour;
    }

    public String getCharacterType() {
        return characterType;
    }

}
