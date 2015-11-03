package com.ulfric.links.commands;

import com.ulfric.lib.util.command.SimpleCommand;
import com.ulfric.lib.util.player.Locale;

public class CommandWebsite extends SimpleCommand {


	@Override
	public void run()
	{
		Locale.send(this.getSender(), "link.website");
	}


}