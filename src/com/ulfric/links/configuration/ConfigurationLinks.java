package com.ulfric.links.configuration;

import java.util.Map;

import org.bukkit.configuration.file.FileConfiguration;

import com.google.common.collect.Maps;
import com.ulfric.lib.configuration.IConfiguration;
import com.ulfric.links.Links;
import com.ulfric.links.commands.enums.LinkType;

public class ConfigurationLinks implements IConfiguration {


	private static final ConfigurationLinks INSTANCE = new ConfigurationLinks();
	public static ConfigurationLinks get() { return ConfigurationLinks.INSTANCE; }

	private final FileConfiguration config;
	private ConfigurationLinks()
	{
		this.config = Links.get().getConfig();

		this.config.options().copyDefaults(true);

		Links.get().saveConfig();

		this.populate();
	}


	@Override
	public void populate()
	{
		this.links = Maps.newEnumMap(LinkType.class);

		for (String path : this.config.getConfigurationSection("sites").getKeys(false))
		{
			this.links.put(LinkType.valueOf(path.toUpperCase()), this.config.getString("sites." + path));
		}
	}

	private Map<LinkType, String> links;
	public String getLink(LinkType type) { return this.links.get(type); }


}