public class Main {
    public static void main(String[] args) {

        Education education1 = new Education(1,"Yazilim Gelistirici Yetistirme kampi (C#+Angular)",
                "Engin Demirog", "Sıfırdan başlayıp yepyeni bir metodolojiyle profesyonelleşeceksiniz.");
        Education education2 = new Education(2,"Yazilim gelistirici yetistirme kampi (Java*React)"
                ,"Engin Demirog","2 ay surecek yetistirme kampimizin yazilim ve duyurulari");
        Education education3 = new Education();
        education3.setId(3);
        education3.setName("Programlamaya giris icin temel kurs");
        education3.setTeacherName("Engin Demirog");

        Category category1 = new Category(1,"Programlama");

        Education[] educations = {education1, education2, education3};
        EducationManager educationManager = new EducationManager();
        educationManager.print(educations);
        System.out.println(educationManager.educationLength(educations));

    }
}
