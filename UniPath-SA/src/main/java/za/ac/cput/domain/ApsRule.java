package za.ac.cput.domain;


import jakarta.persistence.*;

@Entity
public class ApsRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private University university;

    private String subjectCategory;

    private Integer weighting;

    private Integer minPercentage;

    private Integer academicYear;

    protected ApsRule() {}

    private ApsRule(Builder builder) {
        this.id = builder.id;
        this.university = builder.university;
        this.subjectCategory = builder.subjectCategory;
        this.weighting = builder.weighting;
        this.minPercentage = builder.minPercentage;
        this.academicYear = builder.academicYear;
    }

    public Long getId() {
        return id;
    }

    public University getUniversity() {
        return university;
    }

    public String getSubjectCategory() {
        return subjectCategory;
    }

    public Integer getWeighting() {
        return weighting;
    }

    public Integer getMinPercentage() {
        return minPercentage;
    }

    public Integer getAcademicYear() {
        return academicYear;
    }

    public static class Builder {
        private Long id;
        private University university;
        private String subjectCategory;
        private Integer weighting;
        private Integer minPercentage;
        private Integer academicYear;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setUniversity(University university) {
            this.university = university;
            return this;
        }

        public Builder setSubjectCategory(String subjectCategory) {
            this.subjectCategory = subjectCategory;
            return this;
        }

        public Builder setWeighting(Integer weighting) {
            this.weighting = weighting;
            return this;
        }

        public Builder setMinPercentage(Integer minPercentage) {
            this.minPercentage = minPercentage;
            return this;
        }

        public Builder setAcademicYear(Integer academicYear) {
            this.academicYear = academicYear;
            return this;
        }

        public ApsRule build() {
            return new ApsRule(this);
        }
    }
}
