package modernjavainaction.ch17_reactive.rxjava;

import static modernjavainaction.ch17_reactive.rxjava.TempObservable.getCelsiusTemperatures;

import io.reactivex.Observable;
import modernjavainaction.ch17_reactive.TempInfo;

public class MainCelsius {

  public static void main(String[] args) {
    Observable<TempInfo> observable = getCelsiusTemperatures("New York", "Chicago", "San Francisco");
    observable.subscribe(new TempObserver());

    try {
      Thread.sleep(10000L);
    }
    catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

}
