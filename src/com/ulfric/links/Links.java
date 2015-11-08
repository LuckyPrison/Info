package com.ulfric.links;

import com.ulfric.lib.plugin.UPlugin;
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
			this.registerCommand(command, (sender, cmd, label, args) ->
			{
				Locale.send(sender, "link." + command);

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