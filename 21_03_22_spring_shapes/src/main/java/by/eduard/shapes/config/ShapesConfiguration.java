package by.eduard.shapes.config;

import by.eduard.shapes.entity.Line;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapesConfiguration {

    @Bean
    public Line line1() {
        return new Line('x', 20);
    }


    @Bean
    public Line line2() {
        return new Line('-', 32);
    }

    @Bean
    public Line line3() {
        return new Line('+', 17);
    }


}
