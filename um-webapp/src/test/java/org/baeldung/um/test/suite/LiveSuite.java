package org.baeldung.um.test.suite;

import org.baeldung.um.security.SecurityRestLiveTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ // @formatter:off
    LiveLogicSuite.class,
    SecurityRestLiveTest.class,
})
// @formatter:on
public final class LiveSuite {
    //
}