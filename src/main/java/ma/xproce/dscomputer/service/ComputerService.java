package ma.xproce.dscomputer.service;

import ma.xproce.dscomputer.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {

    ComputerDTO saveComputer(ComputerDTO computerDTO);
    List<ComputerDTO> getComputerByProce(String proce);
}
