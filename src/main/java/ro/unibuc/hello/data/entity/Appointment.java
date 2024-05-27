package ro.unibuc.hello.data.entity;

import org.springframework.data.annotation.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode


public class Appointment {
    @Id
    private String id;
    private String doctorId;
    private String patientId;
    private Date appointmentDate;
    private String description;

}
