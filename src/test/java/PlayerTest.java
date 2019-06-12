import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;

    @Before
    public void setup(){
        player = new Player("Rhona Rivenstone", "NG");
    }

    @Test
    public void hasName(){
        assertEquals("Rhona Rivenstone", player.getName());
    }


    @Test
    public void hasAlignment(){
        assertEquals("NG", player.getAlignment());
    }
}
