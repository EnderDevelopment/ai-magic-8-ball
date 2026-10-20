package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MagicBallCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage("Please ask a question to the magic ball.");
            return false;
        }

        String question = String.join(" ", args);
        String answer = getAnswer(question);
        player.sendMessage("Magic Ball says: " + answer);
        return true;
    }

    private String getAnswer(String question) {
        // Placeholder for AI response logic
        return "The answer to your question is... ";
    }
}