package sk.itsovy.petrova.projectgoodschool;
import java.util.List;

public interface SchoolStat {
    Student getTheBestStudent();
    int getAverageAbsence();
    double getAverageGrade();
    double getAverageGradeFromMath();
    Student getTheWorstStudent();
    int getTheLowestAbsence();
    List getListSortedByLastNameAsc();
    List getListSortedByAbsenceDesc();
}
