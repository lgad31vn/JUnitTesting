package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddGradeTests.class, CheckValidTests.class, EstimatedGPATests.class, PassingGradeTests.class,
		RemoveGradeTests.class })
public class AllTestsForGPACal {

}
