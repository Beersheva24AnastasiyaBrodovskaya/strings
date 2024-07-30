//package telran.strings;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import static telran.strings.Strings.javaVariable;
public class RegularExpressionsTest {
        
    @Test
    void javaVariableTest(){
        //TODO
        assertTrue("varName".matches(javaVariable()));
        assertTrue("_var_Name_".matches(javaVariable()));
        assertTrue("$var$Name$".matches(javaVariable()));
        assertTrue("var1Name_".matches(javaVariable()));
        assertTrue("int1".matches(javaVariable()));
        assertTrue("Afloat".matches(javaVariable()));

        assertFalse("1varName".matches(javaVariable()));
        assertFalse("var-Name".matches(javaVariable()));
        assertFalse("var Name".matches(javaVariable()));
        assertFalse("var.Name".matches(javaVariable()));
        assertFalse("varName!".matches(javaVariable()));
        assertFalse("[_58".matches(javaVariable()));
        assertFalse("".matches(javaVariable()));

        
    }
}
