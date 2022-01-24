/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Satnam
 */
public class EnrollmentTest {
    
    public EnrollmentTest() {
        
    }
    
    /**
     * Test of registerCohorttoClassTermBlock method, of class Enrollment.
     */
    @Test
    public void testRegisterCohorttoClassTermBlock() {
        System.out.println("registerCohorttoClassTermBlock");
        ClassTermBlock classTermBlock = null;
        Cohort cohort = null;
        Enrollment instance = new Enrollment();
        instance.registerCohorttoClassTermBlock(classTermBlock, cohort);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
