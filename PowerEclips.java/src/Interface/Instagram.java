package Interface;

public interface Instagram {
    public abstract void Post(String a) ;
        
        public void chat(String a);
        
        public void comment (String s);
        
        public static void greeting(String name) {
            System.out.println("Hey ! " + name + "Welcome To Instagrm");
        }
        
        void call();
        
        void Story(String Story);
    
}
