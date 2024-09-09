package in.sp.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entity.Complaintbox;
import in.sp.main.entity.Images;
import in.sp.main.repository.ComplaintRepository;
import in.sp.main.service.ComplaintService;
import in.sp.main.service.ImagesService;

import java.util.List;
import java.util.Optional;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/combox")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @GetMapping
    public List<Complaintbox> getAllComplaintbox() {
        return complaintService.getAllComboxes();
    }

    @GetMapping("/{id}")
    public Optional<Complaintbox> getImageById(@PathVariable Integer id) {
        return complaintService.getComboxById(id);
    }

    @PostMapping
    public Complaintbox createComplaintbox(@RequestBody Complaintbox complaintbox) {
        return complaintService.saveCombox(complaintbox);
    }

    @PutMapping("/{id}")
    public Complaintbox updateComplaintbox(@PathVariable Integer id, @RequestBody Complaintbox complaintbox) {
    	complaintbox.setId(id);
        return complaintService.saveCombox(complaintbox);
        

}
}
