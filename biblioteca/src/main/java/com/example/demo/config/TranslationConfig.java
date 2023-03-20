@Configuration
public class TranslationConfig {

    @Bean
    public TranslationService translationService() {
        return new TranslationService();
    }
}
