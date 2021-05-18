package tokyo.peya.plugins.psacimproved;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.bukkit.plugin.java.JavaPlugin;

import static tokyo.peya.plugins.psacimproved.Variables.*;

public final class PSACImproved extends JavaPlugin
{


    public PSACImproved()
    {
        saveDefaultConfig();
        config = getConfig();
        
        HikariConfig databaseConfig = new HikariConfig();
        databaseConfig.setJdbcUrl(config.getString("database.jdbc"));
        databaseConfig.setDriverClassName(config.getString("database.driver"));
        
        dataSource = new HikariDataSource(databaseConfig);
    }

    @Override
    public void onEnable()
    {
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
