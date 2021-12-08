package de.workshops.bookshelf.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("bookshelf")
public class BookshelfProperties {

    private String title;

    private String version;

    private Integer someNumber;
}
