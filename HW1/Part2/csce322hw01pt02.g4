grammar csce322hw01pt02;

// tokens
ANYTHING : (.);

// rules
gravityGame : ANYTHING EOF{ System.out.println( "Goodbye" ); };