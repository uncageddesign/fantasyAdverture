import java.util.ArrayList;

public class Arcane {

    // Arcane classes: Wizard, Warlock, Bard, Sorcerer, Hexblade
   // Familiar: Cat, Sparrow, Raven, Blink Dog, Bat
    // Spells: Firebolt, Magic Missile, Acid Arrow, Eldritch Blast, Blight, Vicious Mockery

    private String characterType;
    private String familiar;
    private ArrayList<Spells> spellSlots;


    public Arcane(String characterType, String Familiar, ArrayList spells) {
        this.spellSlots= spellSlots;
        this.characterType = characterType;
        this.familiar = familiar;
    }
}
