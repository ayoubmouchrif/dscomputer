package ma.xproce.dscomputer.mapper;

import lombok.AllArgsConstructor;
import ma.xproce.dscomputer.dao.entities.Computer;
import ma.xproce.dscomputer.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public ComputerDTO fromComputerToComputerDTO(Computer computer){
        return modelMapper.map(computer, ComputerDTO.class);
    }

    public Computer fromComputerDTOToComputer(ComputerDTO computerDTO){
        return modelMapper.map(computerDTO, Computer.class);
    }
}
