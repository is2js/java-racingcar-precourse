package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.Count;
import racingcar.domain.Names;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Controller {
	public void runRacing() {
		RacingGame racingGame = RacingGame.getInstance();
		racingGame.init();

		OutputView.printInputNamesInstruction();
		Names names = Names.from(InputView.getNames());
		Cars cars = Cars.from(names);
		
		OutputView.printInputCountInstruction();
		Count count = Count.of(InputView.getCount());

	}
}
