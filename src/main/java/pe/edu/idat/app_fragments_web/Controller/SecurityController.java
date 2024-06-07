package pe.edu.idat.app_fragments_web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/Security")
    public String Security() {
        return "Security";
    }
}
