package oops.singleton;

public class AppConfig {
  private static AppConfig appConfig = null;

  private AppConfig() {}

  public static AppConfig getInstance() {
    // Lazy method
    if (appConfig == null) {
      appConfig = new AppConfig();
    }
    return appConfig;
  }
  
}
