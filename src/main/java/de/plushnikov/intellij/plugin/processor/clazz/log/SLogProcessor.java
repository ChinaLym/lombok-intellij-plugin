package de.plushnikov.intellij.plugin.processor.clazz.log;

import lombok.extern.shoulder.SLog;

/**
 * process @SLog for shoulder framework
 *
 * @author lym
 */
public class SLogProcessor extends AbstractTopicSupportingSimpleLogProcessor {

  public static final String LOGGER_TYPE = "org.shoulder.core.log.Logger";
  private static final String LOGGER_INITIALIZER = "org.shoulder.core.log.LoggerFactory.getLogger(%s)";

  public SLogProcessor() {
    super(SLog.class, LOGGER_TYPE, LOGGER_INITIALIZER, LoggerInitializerParameter.TYPE);
  }
}
