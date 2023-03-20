import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

@Service
public class TranslationService {

    private static final String CLIENT_ID = "your-client-id";
    private static final String CLIENT_SECRET = "your-client-secret";

    public String translate(String text, Language from, Language to) throws Exception {
        Translate.setClientId(CLIENT_ID);
        Translate.setClientSecret(CLIENT_SECRET);
        return Translate.execute(text, from, to);
    }
}
