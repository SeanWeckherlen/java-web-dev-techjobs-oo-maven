package com.company.incomplete;

import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JobTests {
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly

    // empty constructor for Job
    private static final Job testNoConstructor = new Job();
    private static final Job testNoSecondConstructor = new Job();

    // filled Constructor for job
    private static final Job testFilledConstructor = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    private static final Job secondTestFilledConstructor = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    // missing one field
    private static final Job missingOneFieldConstructor = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    // all fields empty
    private static final Job missingALlFields = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));


    @Test
    public void testSettingJobId() {

        Assertions.assertEquals(1, testNoConstructor.getId());
        Assertions.assertEquals(2, testNoSecondConstructor.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Assertions.assertEquals(3, testFilledConstructor.getId());
        Assertions.assertEquals("Product tester", testFilledConstructor.getName());
        Assertions.assertEquals("ACME", testFilledConstructor.getEmployer().toString());
        Assertions.assertEquals("Desert", testFilledConstructor.getLocation().toString());
        Assertions.assertEquals("Quality control", testFilledConstructor.getPositionType().toString());
        Assertions.assertEquals("Persistence", testFilledConstructor.getCoreCompetency().toString());


        // delcare and initialized a job object matching what they want
        // check that name was set properly
        // check that location was set properly
        // check that emplyer was set properly ..... etc.
    }

    @Test
    public void testJobsForEquality() {

        Assertions.assertFalse(testFilledConstructor.equals(secondTestFilledConstructor));


    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {

        Assertions.assertTrue(testFilledConstructor.toString().contains(" "));

    }

    @Test
    public void testToStringHasLabelsForEachField() {

        Assertions.assertTrue(testFilledConstructor.toString().contains("Name:"));
        Assertions.assertTrue(testFilledConstructor.toString().contains("Employer:"));
        Assertions.assertTrue(testFilledConstructor.toString().contains("Location:"));
        Assertions.assertTrue(testFilledConstructor.toString().contains("Position Type:"));
        Assertions.assertTrue(testFilledConstructor.toString().contains("Core Competency:"));

    }

    @Test
    public void testToStringDataNotAvailable() {

        Assertions.assertTrue(missingOneFieldConstructor.toString().contains("Data not available"));

    }

    @Test
    public void testForAllEmptyFields(){
        Assertions.assertEquals("OOPS! This job does not seem to exist.", missingALlFields.toString());
    }
}
