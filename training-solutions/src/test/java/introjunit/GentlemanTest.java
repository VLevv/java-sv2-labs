package introjunit;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
public class GentlemanTest {
    @Test
    public void testHello(){
        Gentleman gentleman = new Gentleman();
        assertThat(gentleman.sayHello("Jon Doe"),equalTo("Hello Jon Doe!"));
        assertThat(gentleman.sayHello(null),equalTo("Hello Anonymous!"));
    }

}
