package task;

public enum Direction {
    North("North"), South("South"), East("East"), West("West");
    private String orientation;

    Direction(String orientation) {
        this.orientation = orientation;
    }
    public Vector2 move (Vector2 start, double distance) {
        double startX = start.getX();
        double startY = start.getY();

        switch (orientation) {
            case "North" -> {
                startY = startY - distance;
                return new Vector2(startX, startY);
            }

            case "South" -> {
                startY = startY + distance;
                return new Vector2(startX, startY);
            }

            case "East" -> {
                startX = startX + distance;
                return new Vector2(startX, startY);
            }

            case "West" -> {
                startX = startX - distance;
                return new Vector2(startX, startY);
            }

        }
        return start;
    }
}



