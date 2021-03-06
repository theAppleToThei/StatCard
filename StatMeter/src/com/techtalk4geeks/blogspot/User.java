package com.techtalk4geeks.blogspot;

enum Rank
{
	LILYPAD, LEECH, FLY, POND_SKATER, POND_SNAIL, TADPOLE, KOI, FROG, DUCK, TURTLE
}

public class User
{
	String myName = "User.getName()";
	int myLevel = 1;
	Rank myRank;
	int myBirthYear;
	int myHP;
	int mySP;
	int myPOW;
	int myDEF;
	int mySPEED;

	public User(String name, Rank rank, int birthYear, int SP)
	{
		myName = name;
		myBirthYear = birthYear;
		myRank = rank;
		mySP = SP;
	}

	public User(String name, Rank rank, int birthYear, int SP, int level)
	{
		myName = name;
		myBirthYear = birthYear;
		myRank = rank;
		mySP = SP;
		myLevel = level;
	}

	public String getName()
	{
		return myName;
	}

	public void setName(String name)
	{
		myName = name;
	}

	public int getLevel()
	{
		return myLevel;
	}
}