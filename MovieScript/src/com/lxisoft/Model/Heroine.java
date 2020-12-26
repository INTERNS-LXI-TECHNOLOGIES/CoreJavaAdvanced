package com.Lxisoft.Model;
public class Heroine extends Cast 
{
	private String characterName;
	private String dialogues;


	public void setCharacterName(String characterName)
	{
		this.characterName=characterName;
	}

	public String getCharacterName()
	{
		return characterName;
	}

	public void setDialogues(String dialogues)
	{
		this.dialogues=dialogues;
	}
	public String getDialogues()
	{
		return dialogues;
	}


}