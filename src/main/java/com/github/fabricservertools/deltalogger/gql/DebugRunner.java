package com.github.fabricservertools.deltalogger.gql;

import com.github.fabricservertools.deltalogger.DatabaseManager;
import com.github.fabricservertools.deltalogger.ModInit;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DebugRunner {
	public static void main(String[] args) {
		Path configPath = Paths.get(new File("").getAbsolutePath(), "config", "deltalogger.properties");
		ModInit.loadConfig(configPath);
		DatabaseManager dm = DatabaseManager.create(null);
		// HttpServer.start();
		new ApiServer().start(8080);
	}
}
