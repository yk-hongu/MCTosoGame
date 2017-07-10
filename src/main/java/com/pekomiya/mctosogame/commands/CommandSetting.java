package com.pekomiya.mctosogame.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandSetting implements CommandExecutor {

    private final SettingCommand settingCommand;
    private final JailCommand jailCommand;
    private final BoxCommand boxCommand;
    private final BookCommand bookCommand;
    private final PlayersCommand playersCommand;

    public CommandSetting() {
        settingCommand = new SettingCommand();
        jailCommand = new JailCommand();
        boxCommand = new BoxCommand();
        bookCommand = new BookCommand();
        playersCommand = new PlayersCommand();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) {
            String commandType = args[0];
            switch (commandType) {
                case "setting":
                    return settingCommand.onCommand(sender, command, label, args);
                case "jail":
                    return jailCommand.onCommand(sender, command, label, args);
                case "box":
                    return boxCommand.onCommand(sender, command, label, args);
                case "book":
                    return bookCommand.onCommand(sender, command, label, args);
                case "players":
                    return playersCommand.onCommand(sender, command, label, args);
            }
        }
        return false;
    }
}
