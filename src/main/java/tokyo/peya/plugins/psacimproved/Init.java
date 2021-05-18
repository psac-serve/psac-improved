package tokyo.peya.plugins.psacimproved;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import static tokyo.peya.plugins.psacimproved.Variables.config;
import static tokyo.peya.plugins.psacimproved.Variables.dataSource;

public class Init
{
    public static void init()
    {
        initializeConfiguration();
        initializeVariables();
    }

    private static void initializeConfiguration()
    {
        PSACImproved.instance.saveDefaultConfig();
        config = PSACImproved.instance.getConfig();
    }

    private static void initializeVariables()
    {
        HikariConfig databaseConfig = new HikariConfig();
        databaseConfig.setJdbcUrl(config.getString("database.jdbc"));
        databaseConfig.setDriverClassName(config.getString("database.driver"));

        dataSource = new HikariDataSource(databaseConfig);
    }
}
