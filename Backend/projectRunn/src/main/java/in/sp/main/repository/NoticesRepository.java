package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.Notice;

@Repository
public interface NoticesRepository extends JpaRepository<Notice, Integer> {
}
