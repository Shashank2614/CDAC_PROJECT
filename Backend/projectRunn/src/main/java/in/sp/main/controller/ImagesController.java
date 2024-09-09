package in.sp.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.sp.main.entity.Images;
import in.sp.main.service.ImagesService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/images")
public class ImagesController {

    @Autowired
    private ImagesService imagesService;

    @GetMapping
    public List<Images> getAllImages() {
        return imagesService.getAllImages();
    }

    @GetMapping("/{id}")
    public Optional<Images> getImageById(@PathVariable Integer id) {
        return imagesService.getImageById(id);
    }

    @PostMapping
    public Images createImage(@RequestBody Images image) {
        return imagesService.saveImage(image);
    }

    @PutMapping("/{id}")
    public Images updateImage(@PathVariable Integer id, @RequestBody Images image) {
        image.setId(id);
        return imagesService.saveImage(image);

}
}