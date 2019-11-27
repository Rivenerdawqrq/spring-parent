package work;

import java.util.Properties;

public class SqlSessionFactory {
    private Properties properties;

    public SqlSessionFactory(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "SqlSessionFactory{" +
                "properties=" + properties +
                '}';
    }
}
