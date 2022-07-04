package ch.bbw.layouts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class M133LayoutsController {
    @GetMapping("/customers")
    public String editCustomer() {
        return "customers";
    }
}
