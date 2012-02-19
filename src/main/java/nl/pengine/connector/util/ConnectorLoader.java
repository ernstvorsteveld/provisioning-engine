package nl.pengine.connector.util;

import org.identityconnectors.common.IOUtil;
import org.identityconnectors.framework.api.*;
import org.identityconnectors.framework.impl.api.ConfigurationPropertyImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 */
public class ConnectorLoader {

    private static final Logger logger = LoggerFactory.getLogger(ConnectorLoader.class);

    private final String bundleName;
    private final String bundleVersion;
    private final String connectorName;
    private final String connectorJarFilename;
    private final String connectorJarDir;

    public ConnectorLoader(String bundleName, String bundleVersion, String connectorName, String connectorJarFilename,
                           String connectorJarDir) {
        this.bundleName = bundleName;
        this.bundleVersion = bundleVersion;
        this.connectorName = connectorName;
        this.connectorJarFilename = connectorJarFilename;
        this.connectorJarDir = connectorJarDir;
    }

    public APIConfiguration getApiConfiguration() throws IOException {
        ConnectorInfoManager connectorInfoManager = readBundle();
        ConnectorKey connectorKey = new ConnectorKey(bundleName, bundleVersion, connectorName);

        ConnectorInfo connectorInfo = connectorInfoManager.findConnectorInfo(connectorKey);
        APIConfiguration apiConfiguration = connectorInfo.createDefaultAPIConfiguration();

        ConfigurationProperties configurationProperties = apiConfiguration.getConfigurationProperties();
        List<String> propertyNames = configurationProperties.getPropertyNames();

        for (String propertyName : propertyNames) {
            logger.debug("Property name: {}.", propertyName);
        }
        return apiConfiguration;
    }

    public void setProperty(String name, String value) {
        ConfigurationPropertyImpl property = new ConfigurationPropertyImpl();
        property.setName(name);
        property.setValue(value);
    }

    public ConnectorInfoManager readBundle() throws IOException {
        File bundleDirectory = new File(connectorJarDir);
        String[] bundleFiles = bundleDirectory.list();
        logger.debug("Found number of bundles: {}", bundleFiles.length);
        ConnectorInfoManager manager = ConnectorInfoManagerFactory.getInstance().getLocalManager(
                IOUtil.makeURL(bundleDirectory, connectorJarFilename));
        return manager;
    }

}
