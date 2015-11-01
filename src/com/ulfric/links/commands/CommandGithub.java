package com.ulfric.links.commands;

import com.ulfric.lib.command.Command;
import com.ulfric.lib.util.string.Strings;
import com.ulfric.links.commands.enums.LinkType;
import com.ulfric.links.configuration.ConfigurationLinks;

public class CommandGithub extends Command {


	@Override
	public boolean dispatch()
	{
		this.sendMessage(Strings.formatF("&2GitHub: &a$1", ConfigurationLinks.get().getLink(LinkType.GITHUB)));

		return true;
	}


}