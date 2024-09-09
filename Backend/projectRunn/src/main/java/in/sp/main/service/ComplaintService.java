package in.sp.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entity.Complaintbox;
import in.sp.main.repository.ComplaintRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository comboxRepository;

    public List<Complaintbox> getAllComboxes() {
        return comboxRepository.findAll();
    }

    public Optional<Complaintbox> getComboxById(Integer id) {
        return comboxRepository.findById(id);
    }

    public Complaintbox saveCombox(Complaintbox combox) {
        return comboxRepository.save(combox);
    }

    public void deleteCombox(Integer id) {
        comboxRepository.deleteById(id);
    }
}
