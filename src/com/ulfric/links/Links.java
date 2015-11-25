package com.ulfric.links;

import com.ulfric.lib.api.locale.Locale;
import com.ulfric.lib.api.module.Plugin;
import com.ulfric.lib.api.server.Commands;

public class Links extends Plugin {


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
			Commands.register(this, link, (sender, command, label, args) ->
			{
				Locale.send(sender, "link." + link);

				return true;
			});
		}
	}

	@Override
	public void disable()
	{
		Links.i = null;
	}


}