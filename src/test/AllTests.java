package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.model.Unit.HeroTest;
import test.model.Unit.UnitTest;


@RunWith(Suite.class)
@SuiteClasses({ HeroTest.class, UnitTest.class})
public class AllTests {

}

