package br.com.serasaexperian.apis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.logging.Logger;

import org.yaml.snakeyaml.Yaml;

public class Helper {
	
	private static final String PATH = "src/test/resources/";
	
	public static String path(String key) {
        Yaml yaml = new Yaml();
        InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(PATH + "URL.yml");
		} catch (FileNotFoundException e) {
			Logger.getGlobal().severe(e.getMessage() + " - Access file ERROR");
			e.printStackTrace();
		}
        HashMap<Object, Object> yamlMap = yaml.load(inputStream);
        return yamlMap.get(key).toString();
	}
}
