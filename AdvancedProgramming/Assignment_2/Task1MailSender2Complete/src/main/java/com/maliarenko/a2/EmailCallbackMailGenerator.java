package com.maliarenko.a2;

public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "<html> don't call use we call you</html>";
    }
}
