package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;


import utils.Utils;



public class Hook extends Utils {




   @Before
    public void startDriver(){ inicial();
     }


     @After
      public void closeDriver(){
         webDriverFechar();
  }


   }










