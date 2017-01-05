
public class Level {
	private int level = 0;
	public Level(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	public boolean above(Level level) {
		if(this.level >= level.getLevel()) {
			return true;
		}else {
			return false;
		}
	}
}

