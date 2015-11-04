package com.ulfric.links;

import com.ulfric.lib.plugin.UPlugin;
import com.ulfric.lib.util.command.SimpleCommand;
import com.ulfric.lib.util.player.Locale;

public class Links extends UPlugin {


	private static Links i;
	public static Links get() { return Links.i; }


	@Override
	public void onLoad()
	{
		Links.i = this;
	}

	@Override
	public void onEnable()
	{
		for (String command : this.getDescription().getCommands().keySet())
		{
			this.registerCommand(command, new SimpleCommand()
			{

				@Override
				public void run()
				{
					Locale.send(this.getSender(), "link." + command);
				}

			});
		}
	}

	@Override
	public void annihilate()
	{
		Links.i = null;
	}


}