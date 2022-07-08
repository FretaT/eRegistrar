package cs.miu.eregistrar.eregistrar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Students")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="student_num",nullable = false)
    @NotBlank(message="Publisher Name cannot be blank spaces")
    private Long studentNumber;

    @Column(name="first_name",nullable = false)
    @NotBlank(message="Publisher Name cannot be blank spaces")
    private String FirstName;

    private String MiddleName;

    @Column(name="last_name",nullable = false)
    @NotBlank(message="Publisher Name cannot be blank spaces")
    private String LastName;

    private Double cgpa;

    @Column(name="enrollment_date",nullable = false)
    @NotBlank(message="Publisher Name cannot be blank spaces")
    private LocalDate enrollmentDate;

    @Column(name="is_internationl",nullable = false)
    @NotBlank(message="Publisher Name cannot be blank spaces")
    private String    isInternational;



}
