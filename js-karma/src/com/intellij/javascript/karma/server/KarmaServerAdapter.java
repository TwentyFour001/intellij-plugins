package com.intellij.javascript.karma.server;

/**
 * @author Sergey Simonchik
 */
public class KarmaServerAdapter implements KarmaServerListener {

  @Override
  public void onReady(int webServerPort, int runnerPort) {}

  @Override
  public void onTerminated(int exitCode) {}

}
