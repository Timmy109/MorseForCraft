package tim.lol.blockchange;

import org.bukkit.plugin.java.JavaPlugin;
import tim.lol.blockchange.commands.BlockChangeCommand;

public final class Blockchange extends JavaPlugin {
    private static Blockchange instance;
    @Override
    public void onEnable() {

        instance = this;

        getCommand("morse").setExecutor(new BlockChangeCommand());


        System.out.println("yeeee boi enabled....");
    }

    public static Blockchange getInstance() {
        return instance;
    }

}
