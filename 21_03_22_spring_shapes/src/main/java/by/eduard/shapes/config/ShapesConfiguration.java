package by.eduard.shapes.config;

import by.eduard.shapes.entity.Line;
import by.eduard.shapes.entity.Rectangle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class ShapesConfiguration {

    @Bean
    public Line line1() {
        return new Line('x', 20);
    }

    @Bean
    @Qualifier("picture")
    @Order(1)
    public Line line2() {
        return new Line('-', 32);
    }

    @Bean
    @Qualifier("picture")
    @Order(3)
    public Line line3() {
        return new Line('+', 17);
    }

    @Bean
    @Qualifier("picture")
    @Order(2)
    public Rectangle rectangle1() {
        return new Rectangle('*', 19, 30);
    }

    @Bean
    public Rectangle rectangle2() {
        return new Rectangle('*', 17, 10);
    }

    @Bean
    public Picture picture(@Qualifier () picture )
}
