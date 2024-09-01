package net.mrks.discordLinker.bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.mrks.discordLinker.bot.events.GuildMessageEventHandler;

public class DiscordBot {
    private final DiscordBotConfig config;
    private final JDABuilder builder;


    public DiscordBot(DiscordBotConfig config) {
        this.config = config;
        this.builder = JDABuilder.createDefault(config.getToken());
        this.builder.enableIntents(GatewayIntent.MESSAGE_CONTENT);
        this.builder.addEventListeners(new GuildMessageEventHandler(config));
    }

    public void start() throws Exception{
        this.builder.build().awaitReady();
    }
}
