using GameNamespace;
class Program{
    static void Main(string[] args)
    {
        using (var game = new Flatcraft())
        {
            game.Run();
        }
    }
}
