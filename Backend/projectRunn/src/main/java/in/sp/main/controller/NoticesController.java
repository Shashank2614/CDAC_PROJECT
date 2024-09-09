package in.sp.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.sp.main.entity.Notice;
import in.sp.main.service.NoticesService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/notices")
public class NoticesController {

    @Autowired
    private NoticesService noticesService;

    @GetMapping
    public List<Notice> getAllNotices() {
        return noticesService.getAllNotices();
    }

    @GetMapping("/{id}")
    public Optional<Notice> getNoticeById(@PathVariable Integer id) {
        return noticesService.getNoticeById(id);
    }

    @PostMapping
    public Notice createNotice(@RequestBody Notice notice) {
        return noticesService.saveNotice(notice);
    }

    @PutMapping("/{id}")
    public Notice updateNotice(@PathVariable Integer id, @RequestBody Notice notice) {
        notice.setId(id);
        return noticesService.saveNotice(notice);
    }

    @DeleteMapping("/{id}")
    public void deleteNotice(@PathVariable Integer id) {
        noticesService.deleteNotice(id);
    }
}
