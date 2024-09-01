package net.mrks.discordLinker.bot.events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.mrks.discordLinker.bot.DiscordBotConfig;

public class GuildMessageEventHandler extends ListenerAdapter {
    private final DiscordBotConfig config;

    public GuildMessageEventHandler(DiscordBotConfig config) {
        this.config = config;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String channelId = event.getChannel().getId();
        if (config.getReadableChannels().contains(channelId)) {
            System.out.println("Message received: " + event.getMessage());
        }
    }
}
