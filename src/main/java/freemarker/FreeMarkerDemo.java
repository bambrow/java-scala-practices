package freemarker;

import com.google.common.collect.Lists;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeMarkerDemo {
    public static void main(String[] args) throws IOException, TemplateException {
        Person p1 = Person.builder().name("Alice").age(25).build();
        Person p2 = Person.builder().name("Bob").age(30).build();
        Person p3 = Person.builder().name("Cathy").age(18).build();
        List<Person> personList = Lists.newArrayList(p1, p2, p3);

        Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
        cfg.setDirectoryForTemplateLoading(new File("src/main/resources/freemarker/"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
        cfg.setWrapUncheckedExceptions(true);
        cfg.setFallbackOnNullLoopVariable(false);

        Map<String, Object> map = new HashMap<>();
        map.put("showPersonList", true);
        map.put("showName", true);
        map.put("showAge", true);
        map.put("showSummary", false);
        map.put("personList", personList);

        Template template = cfg.getTemplate("person.ftl");
        StringWriter out = new StringWriter();
        template.process(map, out);
        String output = out.toString();
        System.out.println(output);
        System.out.println("-------------------------------------");

        map.replace("showAge", false);
        out = new StringWriter();
        template.process(map, out);
        output = out.toString();
        System.out.println(output);
        System.out.println("-------------------------------------");

        personList.remove(personList.size() - 1);
        out = new StringWriter();
        template.process(map, out);
        output = out.toString();
        System.out.println(output);
        System.out.println("-------------------------------------");

        map.replace("showName", false);
        map.replace("showSummary", true);
        out = new StringWriter();
        template.process(map, out);
        output = out.toString();
        System.out.println(output);
        System.out.println("-------------------------------------");

        map.replace("showPersonList", false);
        out = new StringWriter();
        template.process(map, out);
        output = out.toString();
        System.out.println(output);
    }
}
