using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;

namespace GameNamespace
{
    public class Flatcraft : Game
    {
        private GraphicsDeviceManager graphics;
        private SpriteBatch? spriteBatch;

        public Flatcraft()
        {
            graphics = new GraphicsDeviceManager(this);
            Content.RootDirectory = "Content";
        }

        protected override void Initialize()
        {
            // Initialize game components, load content, etc.            
            spriteBatch = new SpriteBatch(GraphicsDevice);

            base.Initialize();
        }

        protected override void LoadContent()
        {
            spriteBatch = new SpriteBatch(GraphicsDevice);

            // Load game content (textures, sounds, etc.) here
        }

        protected override void Update(GameTime gameTime)
        {
            // Update game logic here
            // For example:
            // if (Keyboard.GetState().IsKeyDown(Keys.Escape))
            //     Exit();

            base.Update(gameTime);
        }

        protected override void Draw(GameTime gameTime)
        {
            GraphicsDevice.Clear(Color.CornflowerBlue);

            // Draw game objects here
            if(spriteBatch != null){
                spriteBatch.Begin();
                // Draw sprites, text, etc.
                spriteBatch.End();

                base.Draw(gameTime);
            }
        }
    }
}