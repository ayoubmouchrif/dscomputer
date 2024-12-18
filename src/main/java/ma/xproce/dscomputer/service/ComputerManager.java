package ma.xproce.dscomputer.service;

import lombok.AllArgsConstructor;
import ma.xproce.dscomputer.dao.entities.Computer;
import ma.xproce.dscomputer.dao.repositories.ComputerRepository;
import ma.xproce.dscomputer.dto.ComputerDTO;
import ma.xproce.dscomputer.mapper.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{

    ComputerMapper computerMapper;
    ComputerRepository computerRepository;

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        return computerMapper.fromComputerToComputerDTO(
                computerRepository.save(
                        computerMapper.fromComputerDTOToComputer(computerDTO)
                )
        );
    }

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<ComputerDTO> computersDTO = new ArrayList<>();
        List<Computer> computers = computerRepository.getByProce(proce);
        for(Computer computer:computers){
            computersDTO.add(computerMapper.fromComputerToComputerDTO(computer));
        }
        return computersDTO;
    }
}
