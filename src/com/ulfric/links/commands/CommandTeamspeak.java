package com.ulfric.links.commands;

import com.ulfric.lib.command.Command;
import com.ulfric.lib.util.string.Strings;
import com.ulfric.links.commands.enums.LinkType;
import com.ulfric.links.configuration.ConfigurationLinks;

public class CommandTeamspeak extends Command {


	@Override
	public boolean dispatch()
	{
		this.sendMessage(Strings.formatF("&2TeamSpeak3: &a$1", ConfigurationLinks.get().getLink(LinkType.TEAMSPEAK)));

		return true;
	}


}