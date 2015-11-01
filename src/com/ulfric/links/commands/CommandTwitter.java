package com.ulfric.links.commands;

import com.ulfric.lib.command.SimpleCommand;
import com.ulfric.lib.util.string.Strings;
import com.ulfric.links.commands.enums.LinkType;
import com.ulfric.links.configuration.ConfigurationLinks;

public class CommandTwitter extends SimpleCommand {


	@Override
	public void run()
	{
		this.sendMessage(Strings.formatF("&2Twitter: &a$1", ConfigurationLinks.get().getLink(LinkType.TWITTER)));
	}


}