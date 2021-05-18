package tokyo.peya.plugins.psacimproved;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class PSACImproved extends JavaPlugin
{
    public static PSACImproved instance;
    public static Logger logger;

    public PSACImproved()
    {
        instance = this;
        logger = getLogger();
    }

    @Override
    public void onEnable()
    {
        logger.info("Initialize...");
        Init.init();
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
