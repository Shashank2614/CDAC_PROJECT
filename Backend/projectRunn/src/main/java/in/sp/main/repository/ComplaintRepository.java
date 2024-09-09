package in.sp.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.Complaintbox;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaintbox, Integer> {
}
