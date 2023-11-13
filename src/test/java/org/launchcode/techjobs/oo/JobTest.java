package org.launchcode.techjobs.oo;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
public class JobTest extends AbstractTest{
    //TODO: Create your unit tests here


    @Test
    public void testSettingJobId(){
Job object1 = new Job();
Job object2 = new Job();
assertNotEquals(object1,object2);
    }



    @Test
    public void testJobConstructorSetsAllFields(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(newJob.getName(),"Product tester");
        assertEquals(newJob.getEmployer().getValue(),"ACME");
        assertEquals(newJob.getLocation().getValue(),"Desert");
        assertEquals(newJob.getPositionType().getValue(),"Quality control");
        assertEquals(newJob.getCoreCompetency().getValue(),"Persistence");

assertTrue(newJob.getName() instanceof String);
assertTrue(newJob.getEmployer() instanceof Employer);
assertTrue(newJob.getLocation() instanceof Location);
assertTrue(newJob.getPositionType() instanceof PositionType);
assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);

    }
@Test
    public void testJobsForEquality(){


Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertNotEquals(job1, job2);
}

@Test
    public void testToStringStartsAndEndsWithNewLine(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals(job.toString().charAt(0),System.lineSeparator().charAt(0));
    assertEquals(job.toString().charAt(job.toString().length()-1),System.lineSeparator().charAt(System.lineSeparator().length()-1));
}
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    assertEquals(job.toString(),
            System.lineSeparator() + "ID: "+ "1" + System.lineSeparator() +
                    "Name: " + "Product tester" + System.lineSeparator() +
                    "Employer: " + "ACME" + System.lineSeparator() +
                    "Location: " + "Desert" + System.lineSeparator() +
                    "Position Type: " + "Quality Control" + System.lineSeparator() +
                    "Core Competency: " + "Persistence" + System.lineSeparator());
}


@Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job();
        assertEquals(job.toString(),
                System.lineSeparator() + "ID: "+ "1" + System.lineSeparator() +
                        "Name: " + "Data not available" + System.lineSeparator() +
                        "Employer: " + "Data not available" + System.lineSeparator() +
                        "Location: " + "Data not available" + System.lineSeparator() +
                        "Position Type: " + "Data not available" + System.lineSeparator() +
                        "Core Competency: " + "Data not available" + System.lineSeparator());
    }


}
