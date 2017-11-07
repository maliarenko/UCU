package never_use_switch;


import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MailSender2 {
    private List<Class<? extends MailGenerator>> MailGeneratorClasses = new ArrayList<>();


    private Map<Integer, MailGenerator> map = new HashMap<>();

    public MailSender2() {
        Reflections scanner = new Reflections("never_use_switch");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                MailGeneratorClasses.add(aClass);
            }
        }

    }

    public void sendMail(MailInfo mailInfo) {

        MailGenerator mailGenerator = map.get(mailInfo.getMailCode());
        if (mailGenerator == null) {
            throw new IllegalStateException(mailInfo.getMailCode() + " not supported yet");
        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html,mailInfo);


    }

    private void send(String html, MailInfo mailInfo) {
        System.out.println("sending to ... " + html);
    }


}
