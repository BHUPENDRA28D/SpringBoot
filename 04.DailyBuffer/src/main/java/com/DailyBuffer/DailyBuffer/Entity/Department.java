package com.DailyBuffer.DailyBuffer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Department {

    @Id   // to create primary key.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;


    @NotBlank(message = "Please Add Department Name")
    /*@Length(max = 5,min =1)
    @Size(max = 10, min = 0)
    @Email
    @Positive
    @Negative
    @PositiveOrZero
    @NegativeOrZero
    @Future
    @FutureOrPresent
    @Past
    @PastOrPresent*/


    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
