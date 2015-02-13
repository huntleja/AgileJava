package chess;

import junit.framework.TestCase;
/**
 * Created by John on 2/13/2015.
 */
public class CharacterTest extends TestCase {

    public void testWhitespace(){
        assertTrue(Character.isWhitespace('\n'));
    }

}
