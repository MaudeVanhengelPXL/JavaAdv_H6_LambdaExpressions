package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GameCollection {
	private final List<VideoGame> videoGames = new ArrayList<>();

	public void addGame(VideoGame game) {
		videoGames.add(game);
	}

	public List<VideoGame> selectGames(Predicate<VideoGame> filter) {
		List<VideoGame> selectedGameList = new ArrayList<>();
		for (VideoGame game : videoGames) {
			if (filter.test(game)) {
				selectedGameList.add(game);
			}
		}
		return selectedGameList;
	}

}
