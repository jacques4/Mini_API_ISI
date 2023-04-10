package divin.tg.demo.repository;

import divin.tg.demo.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository  extends JpaRepository<Employe , Integer> {
}
