package com.pekomiya.mctosogame;

import com.pekomiya.mctosogame.command.TosoSettingCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("tosogame").setExecutor(new TosoSettingCommand());

        super.onEnable();
    }
}
