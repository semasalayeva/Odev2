public class Education {
    private int id;
    private String name;
    private String teacherName;
    private String detail;

    public Education() {
    }

    public Education(int id, String name, String teacherName, String detail) {
        this.id = id;
        this.name = name;
        this.teacherName = teacherName;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
