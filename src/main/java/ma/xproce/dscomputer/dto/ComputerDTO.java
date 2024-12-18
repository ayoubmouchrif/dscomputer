package ma.xproce.dscomputer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComputerDTO {
    private String proce;
    private String ram;
    private String hardDrive;
    private Float price;
}
