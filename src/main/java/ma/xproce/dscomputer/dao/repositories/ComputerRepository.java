package ma.xproce.dscomputer.dao.repositories;

import ma.xproce.dscomputer.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, String> {
    List<Computer> getByProce(String proce);
}
