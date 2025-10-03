package composite.excercise;

import java.util.ArrayList;
import java.util.List;

public class Team implements Operation {
  private List<Operation> operations = new ArrayList<>();

  public void add(Operation operation) {
    this.operations.add(operation);
  }

  @Override
  public void deploy() {
    for (var operation : operations)
      operation.deploy();
  }
}
