package demoTest.bean;


import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;

public class TestBean extends BaseBean{
	
//    @Xpath(xpath={"//android.widget.Button[@resource-id='simple.app:id/button1']"})
//    @Description(description="Button")
//    public Click button;
//
//    @Xpath(xpath={"//android.widget.CheckBox[@resource-id='simple.app:id/checkBox1']"})
//    @Description(description="Check")
//    public Check check;
//  
//    @Xpath(xpath={"//android.widget.RadioButton[@resource-id='simple.app:id/radioButton1']"})
//    @Description(description="RadioButton")
//    public Check radio;
//    
//    @Xpath(xpath={"//android.widget.Spinner[@resource-id='simple.app:id/spinner1']"})
//    @FullIndexXpath(fullIndexXpath="//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.Spinner[1]")
//    @Description(description="Spinner")
//    public Select spinner;
//    
//    @Xpath(xpath={"//android.widget.EditText[@resource-id='simple.app:id/editText1']"})
//    @Description(description="EditText")
//    public Text editText;
//    
//    @Xpath(xpath={"//android.widget.TextView[@resource-id='simple.app:id/textView1']"})
//    @Description(description="EditText")
//    public PlainText plainText;
//    
//    @Xpath(xpath={"//android.widget.DigitalClock[@resource-id='simple.app:id/digitalClock1']"})
//    @Description(description="DigitalClock")
//    public View digitalClock;
//    
//    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]"})
//    @FullIndexXpath(fullIndexXpath="//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]")
//    @Description(description="selText")
//    public Text seledText;
//    
    
        @Xpath(xpath={"//android.widget.TextView[@resource-id='android:id/title']"})
        @Description(description="android.widget.TextView")
        public  PlainText  textView1;


        @Xpath(xpath={"//android.widget.Button[@resource-id='simple.app:id/button1']"})
        @Description(description="android.widget.Button")
        public  Click  button1;


        @Xpath(xpath={"//android.widget.Spinner[@resource-id='simple.app:id/spinner1']"})
        @Description(description="android.widget.Spinner")
        public  Select  spinner1;


        @Xpath(xpath={"//android.widget.RadioButton[@resource-id='simple.app:id/radioButton1']"})
        @Description(description="android.widget.RadioButton")
        public  Click  radioButton1;


        @Xpath(xpath={"//android.widget.CheckBox[@resource-id='simple.app:id/checkBox1']"})
       @Description(description="android.widget.CheckBox")
        public  Click  checkBox1;


        @Xpath(xpath={"//android.widget.EditText[@resource-id='simple.app:id/editText1']"})
       @Description(description="android.widget.EditText")
        public  Text  editText1;


        @Xpath(xpath={"//android.widget.TextView[@resource-id='simple.app:id/textView1']"})
       @Description(description="android.widget.TextView")
        public  PlainText  textView2;


        @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='simple.app:id/toggleButton1']"})
      @Description(description="android.widget.ToggleButton")
        public  View  ToggleButton1;

        public TestBean(AppiumDriver aDriver){super(aDriver);}
}
