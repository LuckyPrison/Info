package com.ulfric.links;

import com.ulfric.lib.plugin.UPlugin;
import com.ulfric.lib.util.player.Locale;

public class Links extends UPlugin {


	private static Links i;
	public static Links get() { return Links.i; }

	@Override
	public void load()
	{
		Links.i = this;
	}

	@Override
	public void enable()
	{
		for (String link : this.getDescription().getCommands().keySet())
		{
			this.registerCommand(link, (sender, command, label, args) ->
			{
				Locale.send(sender, "link." + link);

				return true;
			});
		}
	}

	@Override
	public void annihilate()
	{
		Links.i = null;
	}


}