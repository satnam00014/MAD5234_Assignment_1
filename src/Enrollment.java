/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satnam
 */
public class Enrollment {
    private ClassTermBlock classTermBlock;
    private Cohort cohort;
    public void registerCohorttoClassTermBlock(ClassTermBlock classTermBlock, Cohort cohort){
        this.classTermBlock = classTermBlock;
        this.cohort = cohort;
        //TODO
        // write the logic to enroll cohort into classtermblock here.
    }
}
