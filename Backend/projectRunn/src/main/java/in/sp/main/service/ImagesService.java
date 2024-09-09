package in.sp.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entity.Images;
import in.sp.main.repository.ImagesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ImagesService {

    @Autowired
    private ImagesRepository imagesRepository;

    public List<Images> getAllImages() {
        return imagesRepository.findAll();
    }

    public Optional<Images> getImageById(Integer id) {
        return imagesRepository.findById(id);
    }

    public Images saveImage(Images image) {
        return imagesRepository.save(image);
    }

    public void deleteImage(Integer id) {
        imagesRepository.deleteById(id);
    }
}
