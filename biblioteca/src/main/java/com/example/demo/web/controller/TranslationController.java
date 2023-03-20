import com.memetix.mst.language.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TranslationController {

    @Autowired
    private TranslationService translationService;

    @PostMapping("/translate")
    @ResponseBody
    public String translate(@RequestBody String text) throws Exception {
        String translatedText = translationService.translate(text, Language.ENGLISH, Language.SPANISH);
        return translatedText;
    }
}
