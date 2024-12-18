package ma.xproce.dscomputer;

import ma.xproce.dscomputer.dto.ComputerDTO;
import ma.xproce.dscomputer.service.ComputerManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DscomputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DscomputerApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerManager computerManager){
        return args -> {
            List<ComputerDTO> computers = List.of(
                    ComputerDTO.builder().hardDrive("256Go").proce("i3").ram("DDR3").price(1500f).build(),
                    ComputerDTO.builder().hardDrive("512Go").proce("i5").ram("DDR4").price(2500f).build(),
                    ComputerDTO.builder().hardDrive("1To").proce("i7").ram("DDR4").price(4000f).build(),
                    ComputerDTO.builder().hardDrive("2To").proce("i9").ram("DDR5").price(8500f).build()
            );
            for(ComputerDTO computerDTO : computers){
                computerManager.saveComputer(computerDTO);
            }
        };
    }
}
