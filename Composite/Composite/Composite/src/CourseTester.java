/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class CourseTester {

    public static void main(String[] args) {

        Course CSC285 = new Course("CSC","285","OOD","Object Oriented Design");
        Course CSC145 = new Course("CSC","145","Java II","Java I");
        Course CSC135 = new Course("CSC","135","Java I","Java II");
        Course CSC120 = new Course("CSC","120","Intro CS","Intro to Computer Science");
        Course MATH120 = new Course("MATH","101","College Algebra","College Algebra");

        CSC285.addPrerequisite(CSC145);
        CSC145.addPrerequisite(CSC135);
        CSC135.addPrerequisite(CSC120);
        CSC135.addPrerequisite(MATH120);

        System.out.println(CSC285.getPrerequisites());
    }
    
}
