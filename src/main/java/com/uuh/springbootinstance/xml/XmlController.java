package com.uuh.springbootinstance.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cg
 * @description xml格式数据传输(< dependency >
 * <groupId>com.fasterxml.jackson.dataformat</groupId>
 * <artifactId>jackson-dataformat-xml</artifactId>
 * </dependency>)
 * @date 2019/12/20 16:41
 * @since 1.0
 */
@Controller
public class XmlController {

    @PostMapping(value = "/xml",
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public User create(@RequestBody User user) {
        user.setName("didispace.com : " + user.getName());
        user.setAge(user.getAge() + 100);
        return user;
    }




    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JacksonXmlRootElement(localName = "User")
    static class User{

        @JacksonXmlProperty(localName = "name")
        private String name;

        @JacksonXmlProperty(localName = "age")
        private Integer age;
    }

}