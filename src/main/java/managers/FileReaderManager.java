package managers;

import dataProvider.ConfigFileReader;

public class FileReaderManager {

	private static FileReaderManager FileReaderManager = new FileReaderManager();
	private static ConfigFileReader ConfigFileReader;
	
	public FileReaderManager() {
		// TODO Auto-generated constructor stub
	}

	 public static FileReaderManager getInstance() {
	      return FileReaderManager;
	 }

	 public ConfigFileReader getConfigReader() {
		 return (ConfigFileReader == null) ? new ConfigFileReader() : ConfigFileReader;
	 }
}
