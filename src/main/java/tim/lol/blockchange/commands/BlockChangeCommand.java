package tim.lol.blockchange.commands;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitTask;
import tim.lol.blockchange.Blockchange;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BlockChangeCommand implements CommandExecutor {

    public Integer x = 0;
    Block blockLocation = Bukkit.getWorld("creative").getBlockAt(-18, -60, 26);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage("nah");
            return true;
        }

        String message = String.join(" ", Arrays.asList(args).subList(0, args.length));
        sender.sendMessage(MorseClass.toMorse(message));

        String morse_message = MorseClass.toMorse(message);

        char[] morse_array = new char[morse_message.length()];
        for (int i = 0; i < morse_message.length(); i++) {
            morse_array[i] = morse_message.charAt(i);
        }

        long dit = 20;

        for (char symbol : morse_array) {

            if (symbol == '.') {
                Bukkit.getScheduler().runTaskLater(Blockchange.getInstance(), () -> {
                    blockLocation.setType(Material.REDSTONE_LAMP_ON);
                }, dit);

                Bukkit.getScheduler().runTaskLater(Blockchange.getInstance(), () -> {
                    blockLocation.setType(Material.REDSTONE_LAMP_OFF);
                }, dit);

                System.out.print("Low ");

            } else if (symbol == '-') {

                Bukkit.getScheduler().runTaskLater(Blockchange.getInstance(), () -> {
                    blockLocation.setType(Material.REDSTONE_LAMP_ON);
                }, dit*2);

                Bukkit.getScheduler().runTaskLater(Blockchange.getInstance(), () -> {
                    blockLocation.setType(Material.REDSTONE_LAMP_OFF);
                }, dit*2);

                System.out.print("High ");

            } else if (symbol == ' ') {

                blockLocation.setType(Material.REDSTONE_LAMP_OFF);

                Bukkit.getScheduler().runTaskLater(Blockchange.getInstance(), () -> {
                    blockLocation.setType(Material.REDSTONE_LAMP_OFF);
                }, dit*3);


                System.out.print("Space between letter ");
            } else if (symbol == '*') {

                blockLocation.setType(Material.REDSTONE_LAMP_OFF);

                Bukkit.getScheduler().runTaskLater(Blockchange.getInstance(), () -> {
                    blockLocation.setType(Material.REDSTONE_LAMP_OFF);
                }, dit*7);

                System.out.println("Space between word ");
            } else {
                System.out.println("Something went wrong!");
            }
        }
        return true;
    }
}
