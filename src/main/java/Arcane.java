import java.util.ArrayList;

public class Arcane {

    // Arcane classes: Wizard, Warlock, Bard, Sorcerer, Hexblade
   // Familiar: Cat, Sparrow, Raven, Blink Dog, Bat

    private String characterType;   //create arraylist with all Arcane types
    private String familiar;        //create arraylist with all familiars
    private ArrayList<ArcanaSpells> spellSlots;


    public Arcane(String name, String alignment, Integer hitPoints, String characterType, String Familiar, ArrayList spells) {
        super(name, alignment, hitPoints);
        this.spellSlots= spellSlots;
        this.characterType = characterType;
        this.familiar = familiar;
    }

//    public getSpell() {
//        pull the required spell from the ArcanaSpells file for the player to use.
//        return spellSlots;
//    }

    public takeDamage() {

    }

}
