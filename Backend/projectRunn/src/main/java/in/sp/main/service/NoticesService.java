package in.sp.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entity.Notice;
import in.sp.main.repository.NoticesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NoticesService {

    @Autowired
    private NoticesRepository noticesRepository;

    public List<Notice> getAllNotices() {
        return noticesRepository.findAll();
    }

    public Optional<Notice> getNoticeById(Integer id) {
        return noticesRepository.findById(id);
    }

    public Notice saveNotice(Notice notice) {
        return noticesRepository.save(notice);
    }

    public void deleteNotice(Integer id) {
        noticesRepository.deleteById(id);
    }
}


