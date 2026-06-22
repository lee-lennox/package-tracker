package za.ac.cput.domain;



import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ApsCalculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private University university;

    private Integer totalScore;

    @Enumerated(EnumType.STRING)
    private QualificationLevel qualificationLevel;

    private LocalDateTime calculatedAt;

    private Integer academicYear;

    protected ApsCalculation() {}

    private ApsCalculation(Builder builder) {
        this.id = builder.id;
        this.user = builder.user;
        this.university = builder.university;
        this.totalScore = builder.totalScore;
        this.qualificationLevel = builder.qualificationLevel;
        this.calculatedAt = builder.calculatedAt;
        this.academicYear = builder.academicYear;
    }

    public static class Builder {
        private Long id;
        private User user;
        private University university;
        private Integer totalScore;
        private QualificationLevel qualificationLevel;
        private LocalDateTime calculatedAt;
        private Integer academicYear;

        public Builder setId(Long id){this.id=id; return this;}
        public Builder setUser(User user){this.user=user; return this;}
        public Builder setUniversity(University university){this.university=university; return this;}
        public Builder setTotalScore(Integer totalScore){this.totalScore=totalScore; return this;}
        public Builder setQualificationLevel(QualificationLevel qualificationLevel){this.qualificationLevel=qualificationLevel; return this;}
        public Builder setCalculatedAt(LocalDateTime calculatedAt){this.calculatedAt=calculatedAt; return this;}
        public Builder setAcademicYear(Integer academicYear){this.academicYear=academicYear; return this;}

        public ApsCalculation build(){
            return new ApsCalculation(this);
        }
    }
}
