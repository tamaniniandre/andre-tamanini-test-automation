package com.accenture.fwk.helpers;

import com.accenture.fwk.config.Config;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class YamlHelper {

  public static Config readConfigYaml() throws IOException {
    try {
      Yaml yaml = new Yaml();
      InputStream inputStream =
          new FileInputStream(
              System.getProperty("user.dir").concat("\\src\\test\\resources\\config\\config.yaml"));

     return yaml.loadAs(inputStream, Config.class);
    } catch (IOException e) {
      throw new IOException(
          "The config file was not found at directory: "
              + System.getProperty("user.dir")
                  .concat("\\src\\test\\resources\\config\\config.yaml"));
    }
  }
}
