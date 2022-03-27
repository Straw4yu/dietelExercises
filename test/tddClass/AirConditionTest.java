package tddClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AirConditionTest {

    @Test
    public void airConditionOnTest(){
        //given
        AirCondition myAirCondition =new AirCondition();
        //when
        myAirCondition.setPower("on");
        //assert
        assertEquals("on",myAirCondition.getPower());
    }
    @Test
    public void airConditionerOffTest(){
        //given
        AirCondition myAirCondition =new AirCondition();
        //when
        myAirCondition.setPower("off");
        //assert
        assertEquals("off",myAirCondition.getPower());
    }
    @Test
    public void airConditionIncreaseTest(){
        //given
        AirCondition myAirCondition =new AirCondition();
        //when
        myAirCondition.increaseTemperature(16,18);
        assertEquals(18,myAirCondition.getTemperature());
    }

    @Test
    public void airConditionDecreaseTest(){
        //given
        AirCondition myAirCondition =new AirCondition();
        //when
        myAirCondition.decreaseTemperature(18,16);
        assertEquals(16,myAirCondition.getTemperature());
    }
    @Test
    public void airConditionIncreaseBeyond30Test(){
        //given
        AirCondition myAirCondition =new AirCondition();
        //when
        myAirCondition.increaseTemperature(16,45);
        //assert
        assertEquals( 30,myAirCondition.getTemperature());
    }

    @Test
    public void airConditionDecreaseTemperatureBelow16(){
        //given
        AirCondition myAirCondition =new AirCondition();
        //when
        myAirCondition.decreaseTemperature(45,16);
        //assert
        assertEquals( 16,myAirCondition.getTemperature());
    }

}

