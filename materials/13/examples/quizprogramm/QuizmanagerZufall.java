import java.util.Random;
import java.util.Collections;

public class QuizmanagerZufall extends Quizmanager {

	@Override
	public void ladeFragen() {
		super.ladeFragen();
		Collections.shuffle(this.quizfragen, new Random());
	}
}
