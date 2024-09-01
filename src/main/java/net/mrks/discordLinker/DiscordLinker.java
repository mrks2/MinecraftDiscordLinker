package net.mrks.discordLinker;

import net.mrks.discordLinker.bot.DiscordBot;
import org.bukkit.plugin.java.JavaPlugin;
import net.mrks.discordLinker.bot.DiscordBotConfig;

import java.util.List;

public final class DiscordLinker extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        DiscordBotConfig config = new DiscordBotConfig("MTI3OTQyMjY2ODc3MjQ3OTAxNg.GCS-oq.6un4V49DSD2NPs6xhQwNqVvDzCrUK8ca64AAnM", "732648510037426228", List.of("1279576841849405593"), List.of("1279576841849405593"), "1279576841849405593");
        DiscordBot bot = new DiscordBot(config);
        try {
            bot.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
