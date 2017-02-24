package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
class EntryPoint {

  private static final Logger LOGGER = LoggerFactory.getLogger(EntryPoint.class);

  public static void main(String[] args) throws Exception {
    Object[] sources = {EntryPoint.class};
    SpringApplication.run(sources, args);
  }
}
