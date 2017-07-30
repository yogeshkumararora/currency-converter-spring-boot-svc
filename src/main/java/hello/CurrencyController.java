package hello;

/**
 * Created by yogeshkumararora on 28/07/17.

*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

@Controller
public class CurrencyController {

    @RequestMapping("/currencyconverter")
    @ResponseBody
    BigDecimal home() {
        return new BigDecimal(64.13).setScale(2, BigDecimal.ROUND_CEILING);
    }
}