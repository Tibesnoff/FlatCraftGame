public class Game {
    private GameWindow window;
    private GamePanel panel;

    public Game() {
        window = new GameWindow();
        panel = new GamePanel();
        
        window.setPanel(panel);
    }
}
