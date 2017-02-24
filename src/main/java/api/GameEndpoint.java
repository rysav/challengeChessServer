package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("games")
class GameEndpoint {

  private static final Logger LOGGER = LoggerFactory.getLogger(GameEndpoint.class);

  @RequestMapping(method = RequestMethod.GET)
  String inform() {
    LOGGER.info("/games hit");
    return "Not yet implemented";
  }
}
