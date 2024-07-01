package br.com.devrsvieira.iPlay.enums;

public enum ConsoleEnum {

	NES(1, "NINTENDO"),
	SNES(2, "SUPER NINTENDO"),
	GB(3, "GAME BOY"),
	GBC(4, "GAME BOY COLOR"),
	GBA(5, "GAME BOY ADVANCED"),
	PS1(6, "PLAYSTATION "),
	PS2(7, "PLAYSTATION 2"),
	PS3(8, "PLAYSTATION 3"),
	PS4(9, "PLAYSTATION 4"),
	PS5(10, "PLAYSTATION 5"),
	SWITCH(11, "NINTENDO SWITCH"),
	GENESIS(12, "GENESIS"),
	MASTER_SYSTEM(13, "MASTER SYSTEM"),
	MEGA_DRIVE(14, "MEGA DRIVE"),
	XBOX(15, "XBOX"),
	XBOX_360(16, "XBOX 360"),
	XBOX_SERIES(17, "XBOX SERIES");

	private final int id;
    private final String name;

    ConsoleEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}