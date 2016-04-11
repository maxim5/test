package org.max.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * bar
 */
public class Main implements Runnable {
  private volatile int x = 0;
  // private AtomicInteger y = new AtomicInteger();

  // Comment
  public static void main(String[] args) throws Exception {
    Main main = new Main();
    for (int i = 0; i < 2; ++i) {
      new Thread(main).start();
    }
    Thread.sleep(1500);
    // System.out.println(main.y.get());
    System.out.println("x=" + main.x);
  }

  @Override
  public void run() {
    //
    // System.out.println("in");
    for (int i = 0; i < 100000; i++) {
      // y.incrementAndGet();
      x++;
    }
  }

  int value; // new line
}

