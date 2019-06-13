import java.util.ArrayList;

public class Divine {
    // Divine classes: Cleric, Paladin, Druid, Ranger


    private String characterType;
    private String familiar;
    private ArrayList<DivineSpells> spellSlots;


    public Divine(String name, String alignment, Integer hitPoints, String characterType, String familiar) {
        super(name, alignment, hitPoints);
        this.characterType = characterType;
        this.familiar = familiar;
    }
}
