import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

public class TombsugTest {
    @Test
    public void testHaveSomeMethod2() {
        ArrayList<String> methodNameList = new ArrayList<>();
        Method[] methods = Tombsug.class.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            methodNameList.add(name);
        }
        boolean hasCalcRadius = methodNameList.contains("feladat0213");
        assertTrue(hasCalcRadius);
    }
    
}
