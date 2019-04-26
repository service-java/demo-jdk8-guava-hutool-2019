package modernjavainaction.ch11_optional;

import java.util.Optional;

public class Car {

  private Optional<Insurance> insurance;

  public Optional<Insurance> getInsurance() {
    return insurance;
  }

}
