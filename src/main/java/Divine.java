import java.util.ArrayList;

public class Divine {
    // Divine classes: Cleric, Paladin,
    // Familiar: Cat, Sparrow, Raven, Blink Dog, Bat
    // Spells: Firebolt, Magic Missile, Acid Arrow, Eldritch Blast, Blight, Vicious Mockery

    private String characterType;
    private String familiar;
    private ArrayList<DivineSpells> spellSlots;


    public Arcane(String characterType, String Familiar, ArrayList spells) {
        this.spellSlots= spellSlots;
        this.characterType = characterType;
        this.familiar = familiar;
    }
}
