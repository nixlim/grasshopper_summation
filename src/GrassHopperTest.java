import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrassHopperTest {

  @Test
  @DisplayName("Should return 3 when give 2 as initial value")
  public void returnsThreeForTwo () {
    assertEquals (3,GrassHopper.summation (2));
  }

}