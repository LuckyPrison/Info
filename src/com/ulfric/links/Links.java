package com.ulfric.links;

import com.ulfric.lib.plugin.UPlugin;
import com.ulfric.links.commands.CommandFacebook;
import com.ulfric.links.commands.CommandGithub;
import com.ulfric.links.commands.CommandIssues;
import com.ulfric.links.commands.CommandStore;
import com.ulfric.links.commands.CommandTeamspeak;
import com.ulfric.links.commands.CommandTumblr;
import com.ulfric.links.commands.CommandTwitch;
import com.ulfric.links.commands.CommandTwitter;
import com.ulfric.links.commands.CommandWebsite;
import com.ulfric.links.commands.CommandYoutube;

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
		this.registerCommand("website", new CommandWebsite());
		this.registerCommand("store", new CommandStore());
		this.registerCommand("teamspeak", new CommandTeamspeak());
		this.registerCommand("issues", new CommandIssues());
		this.registerCommand("github", new CommandGithub());
		this.registerCommand("twitter", new CommandTwitter());
		this.registerCommand("facebook", new CommandFacebook());
		this.registerCommand("tumblr", new CommandTumblr());
		this.registerCommand("youtube", new CommandYoutube());
		this.registerCommand("twitch", new CommandTwitch());
	}

	@Override
	public void annihilate()
	{
		Links.i = null;
	}


}