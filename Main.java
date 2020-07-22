
public class Main {
  public static void main(String[] args) {
    
    System.out.println("Executed!");

    cleanup();
  }

  // this will clean up any unnecessary folders or files created by the build System
  // that we can not normally remove in this context
  private static void cleanup(){
    try{
      //Runtime.getRuntime().exec("./clean.sh");
      System.out.println( "Skipping cleanup" );
    }
    catch ( Exception e ){
      e.printStackTrace();
    }
  }
}

