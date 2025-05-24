// Syzu 5/24/25

// GreetHelper.java

// 🧪 Instruction
// In this lesson, you’re gonna call a method from another class — but not just any method — a static one.
// Create a new class called GreetHelper.
//Inside that class, make a static method called sayHi() that just prints something like "Static world!".
// Then, go to your Main class and in the main method, call that method using:
// GreetHelper.sayHi();
// Run it and it should just print your message.

public class GreetHelper {

  public static void sayHi() {
    System.out.println("Static world!");
  }
}

// My Explanation
// So this class GreetHelper we made a static method  sayHi(). That method sayHi() is static, so it belongs to the class itself.
// Because it’s static not object, we don’t need to make a new GreetHelper object to run it. We can just call GreetHelper.sayHi() anywhere in our code and will work just fine. 
// If its not static, we will  have to create object like new GreetHelper().sayHi() first.
// So basically, this class is just a quick way to keep that “Static world!” print somewhere else, and we call it directly from ourmain code without any problem.
