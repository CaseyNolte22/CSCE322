import java.io.IOException;
import org.antlr.v4.runtime.*;

class csce322hw01pt02error extends BaseErrorListener{
    @Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
				int position, String msg, RecognitionException e) {
	System.err.println( msg );

	// replace with code to process syntax errors
	System.out.println( "ERROR" );
    }	
}