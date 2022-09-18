package mygroup.boardservice.common.config;

import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        //@PathVariable 로 받는 값이 소문자여도 Enum 타입으로 컨버팅되도록 하기 위함.
        //ApplicationConversionService에는 StringToEnumIgnoringCaseConverterFactory가 포함되어 있다.
        ApplicationConversionService.configure(registry);
    }
}

