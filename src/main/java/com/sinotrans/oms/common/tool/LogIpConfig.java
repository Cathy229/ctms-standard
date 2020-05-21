package com.sinotrans.oms.common.tool;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @deprecated:获取服务器ip地址
 * @author Colley.Bai
 * @version 1.0.0
 */
public class LogIpConfig extends ClassicConverter {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogIpConfig .class);
    @Override
    public String convert(ILoggingEvent event) {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            LOGGER.error("获取日志Ip异常", e);
        }
        return null;
    }
}
