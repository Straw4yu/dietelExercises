package tddClass;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AccountTest {



     @Test
    public void depositTest(){
        //given
  Account stephenAccount = new Account ();
        //when
  stephenAccount.deposit(100);
        //assert
  assertEquals(100, stephenAccount.getBalance());
    }
}
