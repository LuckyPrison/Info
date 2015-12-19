package com.ulfric.info;

import com.ulfric.lib.api.locale.Locale;
import com.ulfric.lib.api.module.Plugin;

public class Info extends Plugin {

	private static Info i;
	public static Info get() { return Info.i; }

	@Override
	public void load()
	{
		Info.i = this;

		for (String link : this.getDescription().getCommands().keySet())
		{
			this.addCommand(link, (sender, command, label, args) ->
			{
				Locale.send(sender, "info." + link);

				return true;
			});
		}
	}

	@Override
	public void disable()
	{
		Info.i = null;
	}

}