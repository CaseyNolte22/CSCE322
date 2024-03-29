import java.io.IOException;
import org.antlr.v4.runtime.*;

class csce322hw01pt02error extends BaseErrorListener {
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int position, String msg,
			RecognitionException e) {
		System.err.println(msg);
		System.out.println("Something unexpected happened on Line " + line + ".");
		System.exit(0);
		return;
	}
}
