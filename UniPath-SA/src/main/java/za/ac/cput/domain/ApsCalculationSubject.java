package za.ac.cput.domain;


import jakarta.persistence.*;

@Entity
public class ApsCalculationSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ApsCalculation apsCalculation;

    @ManyToOne
    private Subject subject;

    private Integer percentage;

    private Integer pointsAwarded;

    protected ApsCalculationSubject() {}

    private ApsCalculationSubject(Builder builder) {
        this.id = builder.id;
        this.apsCalculation = builder.apsCalculation;
        this.subject = builder.subject;
        this.percentage = builder.percentage;
        this.pointsAwarded = builder.pointsAwarded;
    }

    public static class Builder {
        private Long id;
        private ApsCalculation apsCalculation;
        private Subject subject;
        private Integer percentage;
        private Integer pointsAwarded;

        public Builder setId(Long id){this.id=id; return this;}
        public Builder setApsCalculation(ApsCalculation apsCalculation){this.apsCalculation=apsCalculation; return this;}
        public Builder setSubject(Subject subject){this.subject=subject; return this;}
        public Builder setPercentage(Integer percentage){this.percentage=percentage; return this;}
        public Builder setPointsAwarded(Integer pointsAwarded){this.pointsAwarded=pointsAwarded; return this;}

        public ApsCalculationSubject build(){
            return new ApsCalculationSubject(this);
        }
    }
}
