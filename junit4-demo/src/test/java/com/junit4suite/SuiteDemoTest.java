package com.junit4suite;
import com.junit4case.BuyTest;
import com.junit4case.LoginTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({LoginTest.class, BuyTest.class})
public class SuiteDemoTest {
}
