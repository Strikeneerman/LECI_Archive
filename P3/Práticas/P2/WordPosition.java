
public class WordPosition {
		private final int x, y;
		private final Direction direction;
		
		public WordPosition(int x, int y, Direction direction) {
			this.x = x;
			this.y = y;
			this.direction = direction;
		}
		
		public String toString() {
			return "(" + x + ", " + y + ")   " + direction;
		}
		public boolean equals(WordPosition p) {
			return (x == p.x) && (y == p.y) && (direction.equals(p.direction));
		}

		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public Direction getDirection() {
			return direction;
		}
}
