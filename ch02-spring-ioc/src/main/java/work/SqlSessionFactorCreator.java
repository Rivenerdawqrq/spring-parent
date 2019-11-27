package work;

import java.util.Properties;

public class SqlSessionFactorCreator {
    private Properties properties;
    public SqlSessionFactory create(){
        return new SqlSessionFactory(properties);
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
