package tim.lol.blockchange;

import org.bukkit.plugin.java.JavaPlugin;
import tim.lol.blockchange.commands.BlockChangeCommand;

public final class Blockchange extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("morse").setExecutor(new BlockChangeCommand());


        System.out.println("yeeee boi enabled....");
    }

}
