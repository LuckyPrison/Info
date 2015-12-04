package com.ulfric.links;

import com.ulfric.lib.api.locale.Locale;
import com.ulfric.lib.api.module.Plugin;

public class Links extends Plugin {

	private static Links i;
	public static Links get() { return Links.i; }

	@Override
	public void load()
	{
		Links.i = this;

		for (String link : this.getDescription().getCommands().keySet())
		{
			this.addCommand(link, (sender, command, label, args) ->
			{
				Locale.send(sender, "link." + link);

				return true;
			});
		}
	}

	@Override
	public void enable()
	{
		// DO NOTHING
	}

	@Override
	public void disable()
	{
		Links.i = null;
	}

}