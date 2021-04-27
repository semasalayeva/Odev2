public class EducationManager {
    public void print(Education[] educations){
        for (Education education:educations) {
            System.out.println(education);
        }
    }
    public int educationLength(Education[] educations){
        return educations.length;

    }
}
