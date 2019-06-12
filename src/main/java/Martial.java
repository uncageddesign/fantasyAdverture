public class Martial extends Player {

    // Martial classes: Barbarian, Fighter, Monk, Ranger, Rogue
    // Weapon: Greatsword, Warhammer, Rapier, Crossbow, Fists, Bowstaff, Longbow
    // Armour: Plate, Chainmail, Leather, Shield, Bracers

    private String characterType;
    private String weapon;
    private String armour;

    public Martial(String name, String alignment, String characterType, String weapon, String armour){
        super(name, alignment);
        this.characterType = characterType;
        this.weapon = weapon;
        this.armour = armour;
    }

    public String getCharacterType() {
        return characterType;
    }

}
