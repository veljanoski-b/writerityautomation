package com.writerity.tests;

import org.testng.annotations.Test;

public class ElementTests extends BaseTest {


    @Test
    public void test1() {
        contactUs.click_aboutus();
        sleep(2000);
        contactUs.click_mission();
        sleep(2000);
        contactUs.click_service();
        sleep(2000);
        contactUs.click_service1();
        sleep(2000);
        contactUs.click_technology();
        sleep(2000);
        contactUs.click_blog();
        sleep(2000);
        contactUs.click_qanda();
        sleep(2000);
        contactUs.click_recruit();
        sleep(2000);
        contactUs.click_qainternship();
        sleep(2000);
        contactUs.click_contactus();
        sleep(2000);
        contactUs.type_name_lastname("Bojan Veljanoski");
        sleep(2000);
        contactUs.type_email_address("veljanoski_b@yahoo.com");
        sleep(2000);
        contactUs.type_phonenumber("077852605");
        sleep(2000);
        contactUs.type_sendmessage("Writerity Automation Practice :)");
        sleep(2000);
        contactUs.click_submit();
        sleep(3000);
    }
}
