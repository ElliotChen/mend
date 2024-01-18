package tw.elliot.mend.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrl")
public class ConfigCtrl {
    @GetMapping("/something")
    public String doSomething() {
        return "";
    }
    @GetMapping("/another")
    public String another() {
        return "";
    }
}
