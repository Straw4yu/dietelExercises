package tddClass;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PowerBikeTest {
    @Test
    public void powerBikeOnTest(){
        //given
        PowerBike myPowerBike =new PowerBike();
        //when
        myPowerBike.turnOn();
        //assert
        assertTrue(myPowerBike.getPowerStatus());
    }

}
