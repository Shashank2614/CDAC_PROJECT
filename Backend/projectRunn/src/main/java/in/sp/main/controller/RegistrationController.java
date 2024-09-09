package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.sp.main.entity.Registration;
import in.sp.main.service.RegistrationService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @GetMapping("/{id}")
    public Optional<Registration> getRegistrationById(@PathVariable Integer id) {
        return registrationService.getRegistrationById(id);
    }

    @PostMapping
    public Registration createRegistration(@RequestBody Registration registration) {
        return registrationService.saveRegistration(registration);
    }

    @PutMapping("/{id}")
    public Registration updateRegistration(@PathVariable Integer id, @RequestBody Registration registration) {
        registration.setId(id);
        return registrationService.saveRegistration(registration);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable Integer id) {
        registrationService.deleteRegistration(id);
    }
}
