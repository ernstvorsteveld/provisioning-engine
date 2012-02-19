package nl.pengine.connector.util;

import org.identityconnectors.framework.api.ConnectorFacade;

import java.io.IOException;

/**
 */
public class AbstractGoogleAppsConnectorTestcase {

    private ConnectorFacade connector;

//    private Map<GoogleAppsConnectorProperties, String> googleAppsProperties = Maps.newHashMap();

    public void initialize() throws IOException {
//        this.googleAppsProperties = loadFromPropertyFile();
//        ConnectorLoader connectorLoader = new ConnectorLoader(getProperty(GoogleAppsConnectorProperties.bundleName),
//                                                              getProperty(GoogleAppsConnectorProperties
// .bundleVersion),
//                                                              getProperty(GoogleAppsConnectorProperties
// .connectorName),
//                                                              getProperty(GoogleAppsConnectorProperties
//                                                                                  .connectorJarFilename));
//        APIConfiguration apiConfiguration = connectorLoader.getApiConfiguration();
//        ConfigurationProperties configurationProperties = apiConfiguration.getConfigurationProperties();
//        configurationProperties.setPropertyValue(GoogleAppsConnectorProperties.domain.name(),
//                                                 getProperty(GoogleAppsConnectorProperties.domain));
//        configurationProperties.setPropertyValue(GoogleAppsConnectorProperties.login.name(),
//                                                 getProperty(GoogleAppsConnectorProperties.login));
//        configurationProperties.setPropertyValue(GoogleAppsConnectorProperties.password.name(),
//                                                 getProperty(GoogleAppsConnectorProperties.password));
//        configurationProperties
//                .setPropertyValue(GoogleAppsConnectorProperties.connectionUrl.name(),
//                                  getProperty(GoogleAppsConnectorProperties.connectionUrl));
//        configurationProperties.setPropertyValue(GoogleAppsConnectorProperties.orgUnitUrl.name(),
//                                                 getProperty(GoogleAppsConnectorProperties.orgUnitUrl));
//        this.connector = ConnectorFacadeFactory.getInstance().newInstance(apiConfiguration);
//    }
//
//    private Map<GoogleAppsConnectorProperties, String> loadFromPropertyFile() throws IOException {
//        File file = new File(System.getProperty("user.home") + File.separator + ".test",
//                             File.separator + "ga.connector.properties");
//        nl.iwelcome.test.service.PropertyLoader propertyLoader = new PropertyLoader(file);
//        Map<GoogleAppsConnectorProperties, String> propertiesMap = Maps.newHashMap();
//        for (GoogleAppsConnectorProperties propertyName : GoogleAppsConnectorProperties.values()) {
//            String value = propertyLoader.getPropertyValue(propertyName.getPropertyName(), String.class);
//            propertiesMap.put(propertyName, value);
//        }
//        return propertiesMap;
//    }
//
//    public String getUsernameForTest(String usernameBase) {
//        String username = usernameBase + System.currentTimeMillis();
//        return username;
//    }
//
//    public ConnectorFacade getConnector() {
//        return connector;
//    }
//
//    public String getProperty(GoogleAppsConnectorProperties propertyName) {
//        return this.googleAppsProperties.get(propertyName);
//    }
//
//    public Set<Attribute> createUser(String username, String rootDomainEmailAddress,
//                                     String primaryDomainEmailAddress, String organizationName) {
//        final Set<Attribute> attributes = new HashSet<Attribute>();
//        attributes.add(AttributeBuilder.build(GoogleSchema.username.name(), username));
//        attributes.add(AttributeBuilder.build("__NAME__", username));
//
//        attributes.add(AttributeBuilder.build(GoogleSchema.givenName.name(), "givenName"));
//        attributes.add(AttributeBuilder.build(GoogleSchema.familyName.name(), "familyname"));
//        attributes.add(AttributeBuilder.build(GoogleSchema.password.name(), "Pass*w0rd!"));
//        attributes.add(AttributeBuilder.build(GoogleSchema.email.name(), primaryDomainEmailAddress));
//        attributes.add(AttributeBuilder.build(GoogleSchema.googlemail.name(), username));
//        attributes.add(AttributeBuilder.build(GoogleSchema.organization.name(), organizationName));
//
//        attributes.add(AttributeBuilder.buildPassword("Pass*w0rd!".toCharArray()));
//        return attributes;
    }


}
