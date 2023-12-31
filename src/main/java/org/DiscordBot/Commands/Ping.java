package org.DiscordBot.Commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.DiscordBot.Command;

public class Ping implements Command {

    @Override
    public void execute(MessageReceivedEvent event, String[] args) {
        event.getChannel().sendMessage("Pong!").queue();
    }

    @Override
    public String getDescription() {
        return "Responds with Pong! to check if the bot is active.";
    }


}
