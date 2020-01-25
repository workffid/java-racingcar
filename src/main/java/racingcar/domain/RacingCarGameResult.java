package racingcar.domain;

import racingcar.domain.car.RacingCar;
import racingcar.domain.car.RacingCars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RacingCarGameResult {

    private List<RacingCarGameHistory> histories = new ArrayList<>();

    public void recordInitialHistory(RacingCars cars) {
        RacingCarGameHistory initialHistory = new RacingCarGameHistory();
        initialHistory.takeSnapshots(cars);

        histories.add(initialHistory);
    }

    public void record(RacingCarGameHistory history) {
        histories.add(history);
    }

    public int getLastRound() {
        return histories.size();
    }

    public Stream<RacingCarGameHistory> stream() {
        return histories.stream();
    }
}
