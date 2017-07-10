package com.pekomiya.mctosogame;

import com.pekomiya.mctosogame.commands.CommandSetting;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("tosogame").setExecutor(new CommandSetting());
    }
}

